package com.alurachallenge.foro.domain.topic.validations;

import com.alurachallenge.foro.domain.topic.dtos.DtoRegisterTopic;

public interface TopicValidator {
    void validate(DtoRegisterTopic dtoRegisterTopic);

}