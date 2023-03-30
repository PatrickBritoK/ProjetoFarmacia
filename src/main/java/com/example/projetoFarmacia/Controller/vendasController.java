package com.example.projetoFarmacia.Controller;

import com.example.projetoFarmacia.Model.vendasModel;
import com.example.projetoFarmacia.Repository.vendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class vendasController {
    @Autowired
    private vendasRepository repository;

    @GetMapping("/buscarTodos")
    public List<vendasModel> buscarTodos(){
        return repository.findAll();
    }
    @GetMapping("/buscar/{IDVENDA}")
    public vendasModel buscarVID(@PathVariable Long IDVENDA){
        return repository.findById(IDVENDA).get();
    }
    @PostMapping("/AddV")
    public vendasModel AddV(@RequestBody vendasModel vendas){
        return repository.save(vendas);
    }
    @PutMapping("/AttV")
    public vendasModel AttV(@RequestBody vendasModel vendas){
        return repository.save(vendas);
    }
}
