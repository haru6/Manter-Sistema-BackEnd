package com.br.mantersistemabackend.controller;

import com.br.mantersistemabackend.model.System;
import com.br.mantersistemabackend.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "api/system")
public class SystemController {

    @Autowired
    private SystemService systemService;

    @PostMapping()
    public ResponseEntity<Void>save(@Valid @RequestBody System system){
        System sys = systemService.save(system);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sys.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<System>getOne (@PathVariable ("id") Long id){
        return ResponseEntity.ok(systemService.getOne(id));
    }

    @PutMapping("{id}")
    public ResponseEntity<Void>update(@PathVariable ("id") final Long id,
                                      @Valid @RequestBody System system){
        systemService.update(id, system);
        return ResponseEntity.noContent().build();
    }


}
