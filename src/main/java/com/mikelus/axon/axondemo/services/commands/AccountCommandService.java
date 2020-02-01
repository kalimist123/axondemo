package com.mikelus.axon.axondemo.services.commands;

import com.mikelus.axon.axondemo.dto.commands.AccountCreateDTO;
import com.mikelus.axon.axondemo.dto.commands.MoneyCreditDTO;
import com.mikelus.axon.axondemo.dto.commands.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
