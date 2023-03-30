package com.example.projetoFarmacia.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "VENDAS_PATRICKFARMACIA")
public class vendasModel {
    @Id
    @Column(name = "IDVENDA")
    public Long IDVENDA;

    @Column(name = "DATA_VENDA")
    public Date DATA_VENDA;

    @ManyToOne
    @JoinColumn(name = "IDMEDICAMENTO", referencedColumnName = "IDMEDICAMENTO")
    public medicamentosModel MEDICAMENTOS;

    @ManyToOne
    @JoinColumn(name = "IDCLIENTE", referencedColumnName = "IDCLIENTE")
    public clientesModel CLIENTE;
}
