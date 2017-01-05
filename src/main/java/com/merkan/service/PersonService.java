package com.merkan.service;

import com.merkan.dao.PersonDao;
import com.merkan.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by volodymyr on 05.01.17.
 */

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> getAllPersons() {
        return personDao.getAllPersons();
    }

    public void addPerson(Person person) {
        personDao.addPerson(person);
    }

    public void removePerson(Person person) {
        personDao.removePerson(person);
    }
}
