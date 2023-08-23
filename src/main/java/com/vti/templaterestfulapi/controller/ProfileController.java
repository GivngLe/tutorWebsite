package com.vti.templaterestfulapi.controller;

import com.vti.templaterestfulapi.models2.Profile;
import com.vti.templaterestfulapi.models.ProductType;
import com.vti.templaterestfulapi.models.ResponseObject;
import com.vti.templaterestfulapi.service.ProfileService;
import com.vti.templaterestfulapi.service.SequenceGeneratorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @PostMapping("/insert")
    public ResponseEntity<?> insert(@RequestBody Profile profile) {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject(200, "Ok",
                        profileService.insert(profile)));
    }
    @PostMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject(200, "Ok",
                        profileService.findAll()));
    }
}
