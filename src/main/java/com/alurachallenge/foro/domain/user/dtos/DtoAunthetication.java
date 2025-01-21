package com.alurachallenge.foro.domain.user.dtos;

import jakarta.validation.constraints.NotNull;

public record DtoAunthetication (
        @NotNull
        String username,
        @NotNull
        String password
) {}
