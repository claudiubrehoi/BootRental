package ro.claudel.BootRental.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RentalDto {
    private Long clientId;
    private Long prouctId;
    private BigDecimal price;
    private LocalDateTime startDate;

    private LocalDateTime endDate;
}
