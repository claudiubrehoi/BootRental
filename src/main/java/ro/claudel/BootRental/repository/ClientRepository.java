package ro.claudel.BootRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.claudel.BootRental.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
