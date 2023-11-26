package ar.mikellbobadilla.curita.supplier.repository;

import ar.mikellbobadilla.curita.supplier.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
