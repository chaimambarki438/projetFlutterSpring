package org.isetn.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.isetn.entities.Absence;
import org.isetn.entities.Classe;
import org.isetn.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsenceRepository extends JpaRepository<Absence, Long> {
    // You can add custom query methods here if needed
    List<Absence> findByEtudiantId(Long codClass);

    List<Absence> findByMatiereMatiereIdAndDateBetween(Long matiereId, LocalDateTime startDate, LocalDateTime endDate);

   
}
