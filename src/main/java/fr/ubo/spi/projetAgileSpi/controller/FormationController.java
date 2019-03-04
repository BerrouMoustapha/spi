package fr.ubo.spi.projetAgileSpi.controller;

import fr.ubo.spi.projetAgileSpi.dao.FormationEntity;
import fr.ubo.spi.projetAgileSpi.exception.ResourceNotFoundException;
import fr.ubo.spi.projetAgileSpi.repository.FormationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public class FormationController {
    FormationRepository formationRepository;

    // Delete a Formation By Id
    @DeleteMapping("/formation/{id}")
    public ResponseEntity<?> deleteFormation(@PathVariable(value = "id") String codeFormation) {
        FormationEntity formation = formationRepository.findById(codeFormation)
                .orElseThrow(() -> new ResourceNotFoundException("Formation", "codeFormation", codeFormation));
        formationRepository.delete(formation);
        return ResponseEntity.ok().build();
        }

    // Get All Formation
    @GetMapping("/formation")
    public List<FormationEntity> getAllFormations() {
        return formationRepository.findAll();
    }

    // Create a new Formation
    @PostMapping("/formation")
    public FormationEntity createFormation(@Valid @RequestBody FormationEntity formation) {
        return formationRepository.save(formation);
    }
    //Get Formation By Name
    @GetMapping("/formations/nom/{nom}")
    public List<FormationEntity> getFormationByNom(@PathVariable(value = "nom") String name) {
        return formationRepository.findByNameFormation(name);
    }

    // Get a Single Formation By Id
    @GetMapping("/formation/{id}")
    public FormationEntity getFormationById(@PathVariable(value = "id") String codeFormation) {
        return formationRepository.findById(codeFormation)
                .orElseThrow(() -> new ResourceNotFoundException("formation", "codeFormation", codeFormation));
    }
}
