package ro.claudel.BootRental.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name", length=30, nullable=false, unique=false)
    private String firstName;

    @Column(name="last_name", length=30, nullable=false, unique=false)
    private String lastName;

    @Column(name="phone", length=30, nullable=false, unique=false)
    private String phone;

    @Column(name="address", length=100, nullable=false, unique=false)
    private String address;

    @Column(name="client_type", length=30, nullable=false, unique=false)
    private String client_type;
}
