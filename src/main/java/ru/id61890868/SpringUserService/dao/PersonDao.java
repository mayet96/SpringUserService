package ru.id61890868.SpringUserService.dao;

import ru.id61890868.SpringUserService.model.Person;

import java.util.List;

public interface PersonDao {

    void add(Person o) throws Exception;

    void delete(Integer id) throws Exception;

    List<Person> getByEmail(String email) throws Exception;

    Person getById(Integer id) throws Exception;

}
