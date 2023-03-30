package com.example.projetoFarmacia.Repository;

import com.example.projetoFarmacia.Model.vendasModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vendasRepository extends JpaRepository<vendasModel, Long> {
}
