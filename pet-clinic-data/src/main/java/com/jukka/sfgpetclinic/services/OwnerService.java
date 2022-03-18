package com.jukka.sfgpetclinic.services;

import com.jukka.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>
{
    Owner findByLastName(String lastName);
}
