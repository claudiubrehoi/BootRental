package ro.claudel.BootRental.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String clientType;
}
