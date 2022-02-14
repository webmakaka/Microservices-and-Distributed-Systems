package org.javadev.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {}
