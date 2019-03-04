package fr.ubo.spi.projetAgileSpi.repository;


import fr.ubo.spi.projetAgileSpi.dao.FormationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FormationRepository extends JpaRepository<FormationEntity,String> {
    List<FormationEntity> findByNameFormation(String name);
}
