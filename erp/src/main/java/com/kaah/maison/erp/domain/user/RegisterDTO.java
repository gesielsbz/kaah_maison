package com.kaah.maison.erp.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}