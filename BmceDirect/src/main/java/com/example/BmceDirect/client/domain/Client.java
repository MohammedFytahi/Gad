package com.example.BmceDirect.client.domain;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;


@XmlRootElement(name = "client")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name ="CLIENT")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;

    private String nom;
    private String prenom;
    private String cin;
    private String email;
    private String telephone;
    private LocalTime dateCreation;

}
