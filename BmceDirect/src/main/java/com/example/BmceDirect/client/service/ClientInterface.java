package com.example.BmceDirect.client.service;

import com.example.BmceDirect.client.domain.Client;

import java.util.List;
import java.util.Optional;

public interface ClientInterface {
    public Client saveClient(Client client);
    public List<Client> findAllClients();
    public Optional<Client> findClient(Long id);
}
