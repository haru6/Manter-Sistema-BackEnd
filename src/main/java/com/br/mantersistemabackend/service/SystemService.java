package com.br.mantersistemabackend.service;

import com.br.mantersistemabackend.configuration.MessageError;
import com.br.mantersistemabackend.model.System;
import com.br.mantersistemabackend.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class SystemService {

    @Autowired
    private SystemRepository systemRepository;

    public System save(System system){
//        if(system.getId() == null){
//            systemRepository.save(system);
//            return system;
//        }
//        return systemRepository.save(system);
        return systemRepository.save(system);
    }

    public System getOne(Long id){
        return systemRepository.findById(id).orElseThrow(
                ()-> new ResponseStatusException(HttpStatus.NOT_FOUND, MessageError.SYSTEM_NOT_FOUND));
    }

    public System update(Long id, System system){
        system.setId(id);
        return systemRepository.save(system);
    }


}
