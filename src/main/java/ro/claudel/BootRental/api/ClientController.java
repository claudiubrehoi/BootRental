package ro.claudel.BootRental.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.claudel.BootRental.dto.ClientDto;
import ro.claudel.BootRental.service.ClientService;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping(value = "/client", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity newClient(@ModelAttribute("clientDto") ClientDto clientDto) {
        return ResponseEntity.ok(clientService.newClient(clientDto));
    }

    @ModelAttribute(value = "clientDto")
    public ClientDto newClientDto()
    {
        return new ClientDto();
    }

}
