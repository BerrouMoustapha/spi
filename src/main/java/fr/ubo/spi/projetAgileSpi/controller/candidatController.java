package fr.ubo.spi.projetAgileSpi.controller;

import fr.ubo.spi.projetAgileSpi.dao.CandidatEntity;
import fr.ubo.spi.projetAgileSpi.exception.ResourceNotFoundException;
import fr.ubo.spi.projetAgileSpi.repository.CandidatRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class candidatController {

    CandidatRepository candidatRepository;

    // Delete a Candidat By Id
    @DeleteMapping("/candidats/{id}")
    public ResponseEntity<?> deleteCandidatById(@PathVariable(value = "id") String noCandidat) {
        CandidatEntity candidat = candidatRepository.findById(noCandidat)
                .orElseThrow(() -> new ResourceNotFoundException("Candidat", "noCandidat", noCandidat));
        candidatRepository.delete(candidat);
        return ResponseEntity.ok().build();
    }

    // Get All Candidats
    @GetMapping("/candidats")
    public List<CandidatEntity> getAllCandidats() {
        return candidatRepository.findAll();
    }

    // Create a new Candidat
    @PostMapping("/candidats")
    public CandidatEntity createCandidat(@Valid @RequestBody CandidatEntity candidat) {
        return candidatRepository.save(candidat);
    }

    // Get a Candidat By Name
    @GetMapping("/candidats/nom/{nom}")
    public List<CandidatEntity> getCandidatByName(@PathVariable(value = "Name") String name) {
        return candidatRepository.findByName(name);
    }
    // Get a Candidat By University
    @GetMapping("/candidats/universite/{universite}")
    public List<CandidatEntity> getCandidatByUniversity(@PathVariable(value = "universite") String university) {
        return candidatRepository.findByUniversity(university);
        }

    // Delete all Candidats
    @DeleteMapping("/candidats")
    public ResponseEntity<?> deleteCandidats() {
        candidatRepository.deleteAll();
        return ResponseEntity.ok().build();
    }

    // Get a Single Candidat By Id
    @GetMapping("/candidats/{id}")
    public CandidatEntity getCandidatById(@PathVariable(value = "id") String noCandidat) {
        return candidatRepository.findById(noCandidat)
                .orElseThrow(() -> new ResourceNotFoundException("Candidat", "noCandidat", noCandidat));
    }

}
