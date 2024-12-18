package com.example.Spring5_0.controllers;

import com.example.Spring5_0.dto.TransferRequest;
import com.example.Spring5_0.model.Account;
import com.example.Spring5_0.services.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class AccountController {

    private final TransferService transferService;

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest request) {
        transferService.transferMoney(
                request.getSenderAccountId(),
                request.getReceiverAccountId(),
                request.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts (@RequestParam(required = false) String name) {
        if (name == null) {
            return transferService.getAllAccounts();
        }else {
            return transferService.findAccountsByName(name);
        }
    }
}
