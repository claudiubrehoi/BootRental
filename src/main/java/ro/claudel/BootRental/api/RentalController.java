package ro.claudel.BootRental.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.claudel.BootRental.dto.ProductDto;
import ro.claudel.BootRental.dto.RentalDto;
import ro.claudel.BootRental.service.ProductService;
import ro.claudel.BootRental.service.RentalService;

@RestController
@RequiredArgsConstructor
public class RentalController {

    private final RentalService rentalService;

    @PostMapping(value = "/rental", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity newRental(@ModelAttribute("rentalDto") RentalDto rentalDto) {
        return ResponseEntity.ok(rentalService.newRental(rentalDto));
    }

    @ModelAttribute(value = "rentalDto")
    public RentalDto newRentalDto()
    {
        return new RentalDto();
    }

}
