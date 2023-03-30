package com.example.projetoFarmacia.Controller;

import com.example.projetoFarmacia.Model.fornecedoresModel;
import com.example.projetoFarmacia.Repository.fornecedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class fornecedoresController {
    @Autowired
    private fornecedoresRepository repository;

    @GetMapping("/buscar")
    public List<fornecedoresModel> buscarTodos(){
        return repository.findAll();
    }
    @GetMapping("/buscar/{IDFORNECEDOR}")
    public fornecedoresModel buscarFID(@PathVariable Long IDFORNECEDOR){
        return repository.findById(IDFORNECEDOR).get();
    }
    @PostMapping("/AddF")
    public fornecedoresModel Addf(@RequestBody fornecedoresModel fornecedores){
        return repository.save(fornecedores);
    }
    @PutMapping("/AttF")
    public fornecedoresModel AttF(@RequestBody fornecedoresModel fornecedores){
        return repository.save(fornecedores);
    }
}
