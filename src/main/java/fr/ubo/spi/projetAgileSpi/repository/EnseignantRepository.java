package fr.ubo.spi.projetAgileSpi.repository;

import fr.ubo.spi.projetAgileSpi.dao.EnseignantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EnseignantRepository extends JpaRepository<EnseignantEntity,String> {
    List<EnseignantEntity> findByName(String name);
    List<EnseignantEntity> findByEmail(String email);


}
