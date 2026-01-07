package com.example.BmceDirect.account.domain;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@XmlRootElement(name = "account")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "ACCOUNT")
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String rib;

    @Enumerated(EnumType.STRING)
    private AccountType type;

    public Account() {
    }

    public Account(Long id, String rib, AccountType type, BigDecimal balence, boolean active, Long clientId) {
        this.id = id;
        this.rib = rib;
        this.type = type;
        this.balence = balence;
        this.active = active;
        this.clientId = clientId;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public void setBalence(BigDecimal balence) {
        this.balence = balence;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public BigDecimal getBalence() {
        return balence;
    }

    public boolean isActive() {
        return active;
    }

    private BigDecimal balence;

    private  boolean active;

    @Column(name = "CLIENT_ID")
    private Long clientId;
}
