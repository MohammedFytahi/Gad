package com.example.BmceDirect.client.repository;

import com.example.BmceDirect.client.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
