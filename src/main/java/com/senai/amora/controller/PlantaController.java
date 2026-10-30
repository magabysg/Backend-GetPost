package com.senai.amora.controller;

import com.senai.amora.entity.Planta;
import com.senai.amora.service.PlantaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planta")
public class PlantaController {

    private final PlantaService plantaService;

    public PlantaController(PlantaService plantaService) {
        this.plantaService = plantaService;
    }

    @GetMapping
    public List<Planta> mostrarPlanta(){
        return plantaService.mostrarPlanta();
    }

    @PostMapping
    public void criarPlanta(@RequestBody Planta plantaCriar){
        plantaService.cadastrarPlanta(plantaCriar);
    }
}
