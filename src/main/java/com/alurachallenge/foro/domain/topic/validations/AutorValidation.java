package com.alurachallenge.foro.domain.topic.validations;

import com.alurachallenge.foro.domain.profile.ProfileRepository;
import com.alurachallenge.foro.domain.topic.dtos.DtoRegisterTopic;
import com.alurachallenge.foro.infra.errors.IntegrityValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutorValidation implements TopicValidator{
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public void validate(DtoRegisterTopic dtoRegisterTopic) {
        if (profileRepository.findById(dtoRegisterTopic.idAutor()).isEmpty()) {
            throw new IntegrityValidation("No profile was found with this id");
        }
    }
}
