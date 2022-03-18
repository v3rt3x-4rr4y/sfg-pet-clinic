package com.jukka.sfgpetclinic.services;

import com.jukka.sfgpetclinic.model.Pet;

import java.util.Set;

public interface CrudService <T, ID>
{
    Set<T> findAll();
    T findById(Long id);
    T save(T pet);
    void delete(T object);
    void deleteById(Long id);
}
