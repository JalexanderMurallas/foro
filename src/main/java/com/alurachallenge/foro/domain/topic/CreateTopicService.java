package com.alurachallenge.foro.domain.topic;

import com.alurachallenge.foro.domain.profile.Profile;
import com.alurachallenge.foro.domain.profile.ProfileRepository;
import com.alurachallenge.foro.domain.topic.dtos.DtoRegisterTopic;
import com.alurachallenge.foro.domain.topic.dtos.DtoTopicList;
import com.alurachallenge.foro.domain.topic.validations.TopicValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateTopicService {

    @Autowired
    private TopicRepository topicRepository;
    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    List<TopicValidator> validatorList;

    public DtoTopicList create(DtoRegisterTopic dtoRegisterTopic) {
        // validations
        validatorList.forEach(v -> v.validate(dtoRegisterTopic));
        // relations
        Profile profile = profileRepository.findById(dtoRegisterTopic.idAutor()).get();
        // instance of topic
        Topic topic = new Topic(dtoRegisterTopic.title(), dtoRegisterTopic.message(), profile);
        topicRepository.save(topic);

        return new DtoTopicList(topic);
    }
}
