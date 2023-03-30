package com.example.projetoFarmacia.Repository;

import com.example.projetoFarmacia.Model.medicamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface medicamentosRepository extends JpaRepository<medicamentosModel, Long> {
    //@Query("update medicamentos_patrickfarmacia set ativo:= 1 where ativo:=0")
    //int modify (int ATIVO);
}
