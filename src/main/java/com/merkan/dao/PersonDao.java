package com.merkan.dao;

import com.merkan.entity.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by volodymyr on 05.01.17.
 */

@Repository
@Transactional
public class PersonDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getAllPersons() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> criteria = builder.createQuery(Person.class);

        return entityManager.createQuery(criteria).getResultList();
    }

    public void addPerson(Person person) {
        entityManager.persist(person);
    }

    public void removePerson(Person person) {
        entityManager.remove(person);
    }

    public void removeAll() {
        List<Person> persons = getAllPersons();
        for (Person p : persons) {
            Person person = persons.get(p.getId());
            entityManager.remove(person);
        }
    }

    public void findPerson(long id) {
        entityManager.find(Person.class, id);
    }





}
