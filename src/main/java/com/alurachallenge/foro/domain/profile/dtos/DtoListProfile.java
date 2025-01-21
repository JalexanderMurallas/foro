package com.alurachallenge.foro.domain.profile.dtos;

import java.util.List;

public record DtoListProfile (
        Long id,
        String name,
        String email,
        Long id_user,   // Se añade el campo id_user
        Boolean active,
        List<String> topics
){}
