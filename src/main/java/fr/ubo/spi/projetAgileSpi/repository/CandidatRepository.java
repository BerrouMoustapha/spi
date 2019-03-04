package fr.ubo.spi.projetAgileSpi.repository;

import fr.ubo.spi.projetAgileSpi.dao.CandidatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidatRepository extends JpaRepository<CandidatEntity,String>{

    List<CandidatEntity> findByName(String name);
    List<CandidatEntity> findByUniversity(String university);


}
