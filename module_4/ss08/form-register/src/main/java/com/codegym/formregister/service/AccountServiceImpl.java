package com.codegym.formregister.service;

import com.codegym.formregister.entity.Account;
import com.codegym.formregister.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService{
    private  IAccountRepository accountRepository ;
    @Autowired
    public AccountServiceImpl(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void createAccount(Account account) {
        accountRepository.save(account);
    }

}
