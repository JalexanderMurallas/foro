package com.alurachallenge.foro.domain.topic.validations;

import com.alurachallenge.foro.domain.topic.Topic;
import com.alurachallenge.foro.domain.topic.TopicRepository;
import com.alurachallenge.foro.domain.topic.dtos.DtoRegisterTopic;
import com.alurachallenge.foro.infra.errors.IntegrityValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TitleDuplicateValidation implements TopicValidator{
    @Autowired
    private TopicRepository topicRepository;

    @Override
    public void validate(DtoRegisterTopic dtoRegisterTopic) {
        Optional<Topic> topic = topicRepository.findByTitle(dtoRegisterTopic.title());

        if (topic.isPresent()) {
            throw new IntegrityValidation("There is already a topic with the same title");
        }
    }
}