package com.senai.amora.service;

import com.senai.amora.entity.Planta;
import com.senai.amora.repository.PlantaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlantaService {

    private final PlantaRepository plantaRepository;

    public PlantaService(PlantaRepository plantaRepository) {
        this.plantaRepository = plantaRepository;
    }

    public List<Planta> mostrarPlanta(){
        List<Planta> plantaList = new ArrayList<>();
        return plantaList = plantaRepository.findAll();
    }

    public void cadastrarPlanta(Planta plants){
        Planta planta = new Planta();
        planta.setTemperaturaIdeal(plants.getTemperaturaIdeal());
        planta.setOrigem(plants.getOrigem());
        planta.setCadastro(plants.getCadastro());
        planta.setCategoria(plants.getCategoria());
        planta.setEspecie(plants.getEspecie());
        planta.setIluminacao(plants.getIluminacao());
        planta.setFrequenciaRega(plants.getFrequenciaRega());
        planta.setNomeCientifico(plants.getNomeCientifico());
        planta.setNomePopular(plants.getNomePopular());
        planta.setObcervacao(plants.getObcervacao());
        plantaRepository.save(planta);
    }
}
