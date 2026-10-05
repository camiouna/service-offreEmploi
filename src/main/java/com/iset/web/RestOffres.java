package com.iset.web;

import com.iset.entities.Offre;
import com.iset.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Offres")
public class RestOffres {
    @Autowired
    OffreRepository offreRepository;
    @GetMapping
    public List<Offre> getAll(){
        return offreRepository.findAll();
    }
    @GetMapping("/{uid}")
    public Offre getOffre(@PathVariable Long uid){
        return offreRepository.findById(uid).get();
    }
    @PostMapping
    public Offre saveOffre(@RequestBody Offre newoffre){
        return offreRepository.save(newoffre);
    }
    @DeleteMapping("/{id}")
    public void deleteoffre(@PathVariable Long id){
        offreRepository.deleteById(id);
    }
}
