package ar.mikellbobadilla.curita.industry.repository;

import ar.mikellbobadilla.curita.industry.entity.Industry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndustryRepository extends JpaRepository<Industry, Long> {
}
