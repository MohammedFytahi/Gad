package com.example.BmceDirect.client.service.implmentation;

import com.example.BmceDirect.client.domain.Client;
import com.example.BmceDirect.client.repository.ClientRepository;
import com.example.BmceDirect.client.service.ClientInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ClientImpl implements ClientInterface {
    private final ClientRepository clientRepository;
    public ClientImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client client){
        return clientRepository.save(client);
    }

    @Override
    public List<Client> findAllClients(){
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findClient(Long id){
        return clientRepository.findById(id);
    }
}
