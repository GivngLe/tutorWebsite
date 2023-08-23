package com.vti.templaterestfulapi.service;


import com.vti.templaterestfulapi.models2.Profile;
import com.vti.templaterestfulapi.models.ProductType;
import com.vti.templaterestfulapi.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Configurable
@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    public Profile insert(Profile profile){
        profile.setId(sequenceGeneratorService.generateSequence(Profile.SEQUENCE_NAME));
        return profileRepository.insert(profile);
    }

    public List<Profile> findAll(){
        return profileRepository.findAllByName();
    }

}