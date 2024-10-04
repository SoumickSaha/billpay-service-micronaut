package com.example.proxy;

import com.example.model.Payee;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

@Client(id="payee-service-springboot")
public interface PayeeServiceClient {

    @Get("/payees/{payeeId}")
    Payee getPayeeById(@PathVariable Long payeeId);
}
