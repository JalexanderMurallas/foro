package com.alurachallenge.foro.domain.profile.dtos;

import jakarta.validation.constraints.NotNull;

public record DtoUpdateProfile(
        @NotNull
        Long id,
        String name,
        String email
) {}