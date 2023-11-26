package ar.mikellbobadilla.curita.account.repository;

import ar.mikellbobadilla.curita.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByUsername(String username);
    boolean existsByUsername(String username);
}
