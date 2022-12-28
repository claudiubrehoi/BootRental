package ro.claudel.BootRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.claudel.BootRental.entity.Product;
import ro.claudel.BootRental.entity.Rental;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
