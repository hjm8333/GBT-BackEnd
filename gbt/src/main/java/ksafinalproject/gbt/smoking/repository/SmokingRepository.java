package ksafinalproject.gbt.smoking.repository;

import ksafinalproject.gbt.smoking.model.Smoking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SmokingRepository extends JpaRepository<Smoking, Long> {
    Optional<Smoking> findSmokingByUserId(Long userId);
}
