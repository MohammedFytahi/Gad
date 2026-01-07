package com.example.BmceDirect.account.service.implementation;

import com.example.BmceDirect.account.domain.Account;
import com.example.BmceDirect.account.repository.AccountRepository;
import com.example.BmceDirect.account.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account create(Account account){

        if(accountRepository.existsByRib((account.getRib()))){
            throw new RuntimeException("RIB already existe");
        }
        account.setBalence(BigDecimal.ZERO);
        account.setActive(true);

      return  accountRepository.save(account);
    }

}
