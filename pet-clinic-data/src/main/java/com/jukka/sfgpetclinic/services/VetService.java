package com.jukka.sfgpetclinic.services;

import com.jukka.sfgpetclinic.model.Pet;
import com.jukka.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService
{
    Vet findByLastName(String lastName);
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Pet> findAll();
}
