package ro.claudel.BootRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.claudel.BootRental.entity.Client;
import ro.claudel.BootRental.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
