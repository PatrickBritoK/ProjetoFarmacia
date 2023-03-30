package com.example.projetoFarmacia.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "CLIENTES_PATRICKFARMACIA")
public class clientesModel {
    @Id
    @Column(name = "IDCLIENTE")
    public Long IDCLIENTE;

    @Column(name = "NOME")
    public String NOME;

    @Column(name = "ENDERECO")
    public String ENDERECO;

    @Column(name = "TELEFONE")
    public String TELEFONE;

    @Column(name = "ATIVO")
    public int ATIVO;
}
