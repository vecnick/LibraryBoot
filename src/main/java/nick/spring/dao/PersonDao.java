package nick.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class PersonDao {

    private final EntityManager entityManager;

    @Autowired
    public PersonDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

//    @Transactional(readOnly = true)
//    public void testNPlus1(){
//        Session session = entityManager.unwrap(Session.class);
//
//        Set<Person> people = new HashSet<Person>(session.createQuery("select p from Person p LEFt JOIN FETCH p.books")
//                .getResultList());
//        for (Person person:people)
//            System.out.println("Person " + person.getName() + " has: " +person.getBooks());
//    }
}
