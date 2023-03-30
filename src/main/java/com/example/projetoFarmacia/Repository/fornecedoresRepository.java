package com.example.projetoFarmacia.Repository;

import com.example.projetoFarmacia.Model.fornecedoresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface fornecedoresRepository extends JpaRepository<fornecedoresModel, Long> {
    //@Query("update fornecedores_patrickfarmacia set ativo:= 1 where ativo:=0")
    //int modify (int ATIVO);
}
