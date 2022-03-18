package com.jukka.sfgpetclinic.services;

import com.jukka.sfgpetclinic.model.Pet;

public interface PetService extends CrudService<Pet, Long>
{
    Pet findByName(String name);
}
