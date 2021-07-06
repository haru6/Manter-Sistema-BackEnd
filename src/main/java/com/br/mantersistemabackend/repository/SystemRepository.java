package com.br.mantersistemabackend.repository;

import com.br.mantersistemabackend.model.System;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemRepository extends JpaRepository<System, Long> {
}
