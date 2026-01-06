package com.example.grpcspringboot.repositories;

import com.example.grpcspringboot.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, String> {
}
