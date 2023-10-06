package com.blyndon;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
