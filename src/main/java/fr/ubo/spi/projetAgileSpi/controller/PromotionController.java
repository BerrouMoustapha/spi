package fr.ubo.spi.projetAgileSpi.controller;

import fr.ubo.spi.projetAgileSpi.dao.PromotionEntity;
import fr.ubo.spi.projetAgileSpi.exception.ResourceNotFoundException;
import fr.ubo.spi.projetAgileSpi.repository.PromotionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/api")
public class PromotionController {

    PromotionRepository promotionRepository;
    // Delete All Promotion
    @DeleteMapping("/promotions")
    public ResponseEntity<?> deletePromotion() {
        promotionRepository.deleteAll();
        return ResponseEntity.ok().build();
    }

    // Get All Promotion
    @GetMapping("/promotions")
    public List<PromotionEntity> getAllPromotions() {
        return promotionRepository.findAll();
    }

    // Create a new Promotion
    @PostMapping("/promotion")
    public PromotionEntity createPromotion(@Valid @RequestBody PromotionEntity promotion) {
        return promotionRepository.save(promotion);
    }

    // Get Promotion By Sigle
    @GetMapping("/promotions/sigle/{siglePromotion}")
    public List<PromotionEntity> getPromotionBySigle(@PathVariable(value = "siglePromotion") String siglePromotion) {
        return promotionRepository.findBySiglePromotion(siglePromotion);
    }

    // Get a Single Promotion By Id
    @GetMapping("/promotion/{id}")
    public PromotionEntity getPromotionById(@PathVariable(value = "id") String anneeUniversitaire) {
        return promotionRepository.findById(anneeUniversitaire)
                .orElseThrow(() -> new ResourceNotFoundException("Promotion", "anneeUniversitaire", anneeUniversitaire));
    }
}
