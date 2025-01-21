package com.alurachallenge.foro.domain.topic.dtos;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DtoUpdateTopic(
        @NotNull
        Long id,
        String title,
        String message,
        Boolean status,
        LocalDateTime updateDate // Nuevo campo

) {
}
