package com.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWs")
public class BankAccountService {
    @WebMethod(operationName = "conversionEuroToDh")
    public double convertToDh(
            @WebParam(name = "montant")
            double amount
    )
    {
        return amount * 10;
    }
    @WebMethod(operationName = "getAccount")
    public Account getAccount(int code) {
        return new Account(code, 43800, new Date());
    }

    @WebMethod
    public List<Account> getAccounts() {
        return List.of(
                new Account(1, 1000, new Date()),
                new Account(2, 2000, new Date()),
                new Account(3, 3000, new Date())
        );
    }
}
