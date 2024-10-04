package com.example.proxy;

import java.math.BigDecimal;

import com.example.model.Account;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;

@Client(id="account-service-springboot")
public interface AccountServiceClient {

    @Get("/accounts/{accountId}")
    Account getAccountById(@PathVariable Long accountId);

    @Put("/accounts/{accountId}/balance")
    @Header(name = "Content-Type", value = "application/json")
    void updateAccountBalance(@PathVariable Long accountId, @QueryValue BigDecimal newBalance);
}
