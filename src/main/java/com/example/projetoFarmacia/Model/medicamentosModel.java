package com.example.projetoFarmacia.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "MEDICAMENTO_PATRICKFARMACIA")
public class medicamentosModel {
    @Id
    @Column(name = "IDMEDICAMENTO")
    public Long IDMEDICAMENTO;

    @Column(name = "NOME")
    public String NOME;

    @Column(name = "DESCRICAO")
    public String DESCRICAO;

    @Column(name = "PRECO")
    public double PRECO;

    @Column(name = "QUANTIDADE")
    public int QUANTIDADE;

    @ManyToOne
    @JoinColumn(name = "IDFORNECEDOR", referencedColumnName = "IDFORNECEDOR")
    public fornecedoresModel fornecedor;

    @Column(name = "ATIVO")
    public int ATIVO;
}
