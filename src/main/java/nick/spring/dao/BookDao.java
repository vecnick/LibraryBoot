package nick.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class BookDao {
    private final EntityManager entityManager;

    @Autowired
    public BookDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

//    @Transactional(readOnly = true)
//    public Optional<Person> getBookOwner(int id){
//        Session session = entityManager.unwrap(Session.class);
//        Set<Person> people = new HashSet<Person>(session.createQuery("SELECT b FROM Book b LEFT JOIN FETCH b.owner ").getResultList());
//    }
}
