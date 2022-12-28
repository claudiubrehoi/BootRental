package ro.claudel.BootRental.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.claudel.BootRental.dto.ProductDto;
import ro.claudel.BootRental.dto.RentalDto;
import ro.claudel.BootRental.entity.Product;
import ro.claudel.BootRental.entity.Rental;
import ro.claudel.BootRental.repository.ClientRepository;
import ro.claudel.BootRental.repository.ProductRepository;
import ro.claudel.BootRental.repository.RentalRepository;

@Service
@RequiredArgsConstructor
public class RentalService {
    private final RentalRepository rentalRepository;
    private final ProductRepository productRepository;
    private final ClientRepository clientRepository;

    public RentalDto newRental(RentalDto rentalDto) {
        return mapToRentalDto(rentalRepository.save(mapToRental(rentalDto)));
    }

    private Rental mapToRental(RentalDto rentalDto) {
        Rental rental = new Rental();
        rental.setClient(clientRepository.findById(rentalDto.getClientId()).orElseThrow());
        rental.setProduct(productRepository.findById(rentalDto.getProductId()).orElseThrow());
        rental.setPrice(rentalDto.getPrice());
        rental.setStartDate(rentalDto.getStartDate());
        rental.setEndDate(rentalDto.getEndDate());
        return rental;
    }

    private RentalDto mapToRentalDto(Rental rental) {
        RentalDto rentalDto = new RentalDto();
        rentalDto.setClientId(rental.getClient().getId());
        rentalDto.setProductId(rental.getProduct().getId());
        rentalDto.setPrice(rental.getPrice());
        rentalDto.setStartDate(rental.getStartDate());
        rentalDto.setEndDate(rental.getEndDate());
        return rentalDto;
    }

}
