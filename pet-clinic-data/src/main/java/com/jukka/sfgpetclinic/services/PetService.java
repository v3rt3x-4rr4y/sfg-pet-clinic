package com.jukka.sfgpetclinic.services;

import com.jukka.sfgpetclinic.model.Owner;
import com.jukka.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService
{
    Pet findByLastName(String lastName);
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
