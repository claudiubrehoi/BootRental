package ro.claudel.BootRental.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length=50, nullable=false, unique=true)
    private String name;

    @Column(name="product_type", length=20, nullable=false, unique=false)
    private String productType;

    @Column(name = "size", length = 10, nullable = false)
    private String size;

    @Column(name="comments", length=150, nullable=true, unique=false)
    private String comments;
}
