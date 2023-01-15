package com.shakiroye.springbootmongodb.service;

import com.shakiroye.springbootmongodb.collection.Person;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> getPersonStartsWith(String name);

    void delete(String id);
}
