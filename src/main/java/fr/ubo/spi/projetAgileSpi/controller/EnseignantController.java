package fr.ubo.spi.projetAgileSpi.controller;

import fr.ubo.spi.projetAgileSpi.dao.EnseignantEntity;
import fr.ubo.spi.projetAgileSpi.exception.ResourceNotFoundException;
import fr.ubo.spi.projetAgileSpi.repository.EnseignantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class EnseignantController {

    EnseignantRepository enseignantRepository;

    // Delete a Enseignant
    @DeleteMapping("/enseignants/{id}")
    public ResponseEntity<?> deleteEnseignant(@PathVariable(value = "id") Integer noEnseignant) {
        EnseignantEntity enseignant = enseignantRepository.findById(Integer.toString(noEnseignant))
                .orElseThrow(() -> new ResourceNotFoundException("Enseignant", "noEnseignant", noEnseignant));
        enseignantRepository.delete(enseignant);
        return ResponseEntity.ok().build();
       }

    // Get All Enseignants
    @GetMapping("/enseignants")
    public List<EnseignantEntity> getAllEnseignants() {
        return enseignantRepository.findAll();
    }

    // Create a new Enseignant
    @PostMapping("/enseignant")
    public EnseignantEntity createEnseignant(@Valid @RequestBody EnseignantEntity enseignant) {
        return enseignantRepository.save(enseignant);
    }
    //Get Enseignant By Name
    @GetMapping("/enseignants/nom/{nom}")
    public List<EnseignantEntity> getEnseignantByName(@PathVariable(value = "nom") String name) {
        return enseignantRepository.findByName(name);
      }
    //Get Enseignant By Email
    @GetMapping("/enseignants/emailUbo/{emailUbo}")
    public List<EnseignantEntity> getEnseignantByEmailUbo(@PathVariable(value = "emailUbo") String email) {
        return enseignantRepository.findByEmail(email);
        }
    // Get a Single Enseignant By Id : noEnseignant
    @GetMapping("/enseignant/{id}")
    public EnseignantEntity getEnseignantById(@PathVariable(value = "id") String noEnseignant) {
        return enseignantRepository.findById(noEnseignant)
                .orElseThrow(() -> new ResourceNotFoundException("enseignant", "noEnseignant", noEnseignant));
    }

}
