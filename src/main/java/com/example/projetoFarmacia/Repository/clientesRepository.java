package com.example.projetoFarmacia.Repository;

import com.example.projetoFarmacia.Model.clientesModel;
import org.springframework.data.jpa.repository.JpaRepository;
public interface clientesRepository extends JpaRepository<clientesModel, Long> {

    //@Modifying
    //@Query("update clientes_patrickfarmacia set ativo:= ?1 where ativo:= ?2")
    //Long update(int ATIVO);

}
