package com.example.projetoFarmacia.Controller;

import com.example.projetoFarmacia.Model.medicamentosModel;
import com.example.projetoFarmacia.Repository.medicamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamentos")
public class medicamentosController {
    @Autowired
    private medicamentosRepository repository;

    @GetMapping("/buscar")
    public List<medicamentosModel> buscarTodos(){
        return repository.findAll();
    }
    @GetMapping("/buscar/{IDMEDICAMENTO}")
    public medicamentosModel buscarMID(@PathVariable Long IDMEDICAMENTO){
        return repository.findById(IDMEDICAMENTO).get();
    }
    @PostMapping("/AddM")
    public medicamentosModel AddM(@RequestBody medicamentosModel medicamentos){
        return repository.save(medicamentos);
    }
    @PutMapping("/AttM")
    public medicamentosModel AttM(@RequestBody medicamentosModel medicamentos){
        return repository.save(medicamentos);
    }
}
