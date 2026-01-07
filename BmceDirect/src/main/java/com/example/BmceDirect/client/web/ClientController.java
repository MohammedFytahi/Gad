package com.example.BmceDirect.client.web;

import com.example.BmceDirect.client.domain.Client;
import com.example.BmceDirect.client.service.ClientInterface;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
        value = "/api/clients",
        consumes = "application/xml",
        produces = "application/xml"
)
@CrossOrigin("*")
public class ClientController {
    private final ClientInterface clientInterface;

    public ClientController(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    @PostMapping(
            value = "/create",
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE
    )
    public Client creatClient(@RequestBody Client client) {
        return clientInterface.saveClient(client);
    }

    @GetMapping
    public List<Client> getAllClients(){
        return clientInterface.findAllClients();
    }


}
