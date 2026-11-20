package practice11.EntityManager;

import org.junit.jupiter.api.BeforeEach;

public class EntityManagerBase {
    protected EntityManager<Worker> entityManager;

    @BeforeEach
    protected void setUp(){
        entityManager = new EntityManager<>();
    }

}
