package ru.id61890868.SpringUserService.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.id61890868.SpringUserService.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {


    final private EntityManager em;

    @Autowired
    public PersonDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void add(Person o) throws Exception {
        try {
            em.persist(o);
        } catch (Exception e) {
            throw new Exception("PersonDao: on save error", e);
        }

    }

    @Override
    public void delete(Integer id) throws Exception {
        Person o = getById(id);
        em.remove(o);
        em.flush();
    }

    @Override
    public List<Person> getByEmail(String filter) throws Exception {
        if (filter == null || filter.isEmpty()) {
            throw new Exception("PersonDao: empty filter");
        }
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Person> criteriaQuery = criteriaBuilder.createQuery(Person.class);
        Root<Person> root = criteriaQuery.from(Person.class);
        criteriaQuery.where(criteriaBuilder.equal(root.get("email"), filter));
        TypedQuery<Person> query = em.createQuery(criteriaQuery);

        return query.getResultList();
    }

    @Override
    public Person getById(Integer id) throws Exception {

        Person o = em.find(Person.class, id);
        if (o == null) {
            throw new Exception("PersonDao: person not found");
        }
        return o;

    }
}
