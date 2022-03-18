package com.jukka.sfgpetclinic.services;

import com.jukka.sfgpetclinic.model.Vet;

public interface VetService  extends CrudService<Vet, Long>
{
    Vet findByLastName(String lastName);
}
