package fr.ubo.spi.projetAgileSpi.repository;


import fr.ubo.spi.projetAgileSpi.dao.PromotionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionRepository extends JpaRepository<PromotionEntity,String> {

    List<PromotionEntity> findBySiglePromotion(String SiglePromotion);
    List<PromotionEntity> findByLieuRentree(String LieuRentree);
}
