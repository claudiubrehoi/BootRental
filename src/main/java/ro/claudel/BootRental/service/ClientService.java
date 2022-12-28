package ro.claudel.BootRental.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.claudel.BootRental.dto.ClientDto;
import ro.claudel.BootRental.entity.Client;
import ro.claudel.BootRental.repository.ClientRepository;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientDto newClient(ClientDto clientDto) {
        return mapToClientDto(clientRepository.save(mapToClient(clientDto)));
    }

    private Client mapToClient(ClientDto clientDto) {
        Client client = new Client();
        client.setFirstName(clientDto.getFirstName());
        client.setLastName(clientDto.getLastName());
        client.setPhone(clientDto.getPhone());
        client.setAddress(clientDto.getAddress());
        client.setClient_type(clientDto.getClientType());
        return client;
    }

    private ClientDto mapToClientDto(Client client) {
        ClientDto clientDto = new ClientDto();
        clientDto.setFirstName(client.getFirstName());
        clientDto.setLastName(client.getLastName());
        clientDto.setPhone(client.getPhone());
        clientDto.setAddress(client.getAddress());
        clientDto.setClientType(client.getClient_type());
        return clientDto;
    }

}
