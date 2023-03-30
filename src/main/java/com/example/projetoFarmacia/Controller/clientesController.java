package com.example.projetoFarmacia.Controller;

import com.example.projetoFarmacia.Model.clientesModel;
import com.example.projetoFarmacia.Repository.clientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class clientesController {
    @Autowired
    private clientesRepository repository;

    @GetMapping("/buscarC")
    public List<clientesModel> buscarTodos(){
        return repository.findAll();
    }
    @GetMapping("/buscarCID/{IDCLIENTE}")
    public clientesModel buscarCID(@PathVariable Long IDCLIENTE){
        return repository.findById(IDCLIENTE).get();
    }

}
