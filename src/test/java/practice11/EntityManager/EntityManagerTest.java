package practice11.EntityManager;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest extends EntityManagerBase {

    @Test
    public void addElementIntoEmptyCollection() {
        Worker worker = new Worker(20, "Anna", true);
        entityManager.addEntity(worker);
        assertTrue(entityManager.getAll().contains(worker));
    }

    @Test
    public void checkCollectionSizeAfterOneAdd() {
        Worker worker = new Worker(20, "Anna", true);
        entityManager.addEntity(worker);
        int expectedSize = 1;
        assertEquals(expectedSize, entityManager.getAll().size());
    }

    @Test //не уверен что такой тест нужен, на проверку нескольких добавлений
    public void checkCollectionSizeAfterSomeAdd() {
        Worker worker = new Worker(20, "Anna", true);
        Worker worker1 = new Worker(20, "Anna1", true);
        Worker worker2 = new Worker(20, "Anna2", true);
        entityManager.addEntity(worker);
        entityManager.addEntity(worker1);
        entityManager.addEntity(worker2);
        int expectedSize = 3;
        assertEquals(expectedSize, entityManager.getAll().size());
    }

    @Test
    public void removeElementFromCollection() {
        Worker worker = new Worker(20, "Anna", true);
        entityManager.addEntity(worker);
        assertTrue(entityManager.removeEntity(worker));
    }

    @Test
    public void removeElementFromEmptyCollection() {
        Worker worker = new Worker(20, "Anna", true);
        assertFalse(entityManager.removeEntity(worker));
    }

    @Test
    public void chekCetAllAfterRemoveElement() {
        Worker worker = new Worker(20, "Anna", true);
        Worker worker1 = new Worker(20, "Anna1", true);
        Worker worker2 = new Worker(20, "Anna2", true);
        entityManager.addEntity(worker);
        entityManager.addEntity(worker1);
        entityManager.addEntity(worker2);
        entityManager.removeEntity(worker1);
        int expectedSize = 2;
        assertEquals(expectedSize, entityManager.getAll().size());
    }

    @Test
    public void checkRemoveFromCopyOfList() {
        Worker worker = new Worker(20, "Anna", true);
        entityManager.addEntity(worker);
        List<Worker> copyList = entityManager.getAll();
        assertThrows(UnsupportedOperationException.class, () -> copyList.remove(worker));
    }

    @Test
    public void checkOverRideEqualsAndHashCode() {
        Worker worker = new Worker(20, "Anna", true);
        Worker worker1 = new Worker(20, "Anna", true);
        assertEquals(worker, worker1);
    }

    @Test
    public void checkAgeFilter() {
        Worker worker = new Worker(0, "Anna", true);
        Worker worker1 = new Worker(100, "Anna1", true);
        Worker worker2 = new Worker(99, "Anna2", true);
        entityManager.addEntity(worker);
        entityManager.addEntity(worker1);
        entityManager.addEntity(worker2);
        List<Worker> actualList = entityManager.filterByAge(0, 99);
        List<Worker> expectedList = List.of(worker, worker2);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkNegativeAge() {
        assertThrows(IllegalArgumentException.class, () -> new Worker(-1, "Anna", true));
    }

    @Test
    public void checkAgeOver100() {
        assertThrows(IllegalArgumentException.class, () -> new Worker(101, "Anna", true));
    }

    @Test
    public void checkAgeFilterEmptyList() {
        Worker worker = new Worker(25, "Anna", true);
        Worker worker1 = new Worker(26, "Anna1", true);
        Worker worker2 = new Worker(27, "Anna2", true);
        entityManager.addEntity(worker);
        entityManager.addEntity(worker1);
        entityManager.addEntity(worker2);
        List<Worker> actualList = entityManager.filterByAge(28, 99);
        List<Worker> expectedList = List.of();
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkFilterByName() {
        Worker worker = new Worker(25, "Anna", true);
        Worker worker1 = new Worker(26, "Anna1", true);
        Worker worker2 = new Worker(27, "Anna", true);
        entityManager.addEntity(worker);
        entityManager.addEntity(worker1);
        entityManager.addEntity(worker2);
        List<Worker> actualList = entityManager.filterByName("Anna");
        List<Worker> expectedList = List.of(worker, worker2);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkFilterByNameEmptyList() {
        Worker worker = new Worker(25, "Anna", true);
        Worker worker1 = new Worker(26, "Anna1", true);
        Worker worker2 = new Worker(27, "Anna2", true);
        entityManager.addEntity(worker);
        entityManager.addEntity(worker1);
        entityManager.addEntity(worker2);
        List<Worker> actualList = entityManager.filterByName("Victor");
        List<Worker> expectedList = List.of();
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkActivityTrue() {
        Worker worker = new Worker(25, "Anna", true);
        Worker worker1 = new Worker(26, "Anna1", true);
        Worker worker2 = new Worker(27, "Anna2", false);
        entityManager.addEntity(worker);
        entityManager.addEntity(worker1);
        entityManager.addEntity(worker2);
        List<Worker> actualList = entityManager.filterByActive(true);
        List<Worker> expectedList = List.of(worker, worker1);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkActivityFalse() {
        Worker worker = new Worker(25, "Anna", true);
        Worker worker1 = new Worker(26, "Anna1", false);
        Worker worker2 = new Worker(27, "Anna2", false);
        entityManager.addEntity(worker);
        entityManager.addEntity(worker1);
        entityManager.addEntity(worker2);
        List<Worker> actualList = entityManager.filterByActive(false);
        List<Worker> expectedList = List.of(worker1, worker2);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkActivityEmptyList() {
        Worker worker = new Worker(25, "Anna", true);
        Worker worker1 = new Worker(26, "Anna1", true);
        Worker worker2 = new Worker(27, "Anna2", true);
        entityManager.addEntity(worker);
        entityManager.addEntity(worker1);
        entityManager.addEntity(worker2);
        List<Worker> actualList = entityManager.filterByActive(false);
        List<Worker> expectedList = List.of();
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkRaceCondition() throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int index = i;
            threads.add(new Thread(() ->{
                for (int j = 0; j < 100; j++) {
                    entityManager.addEntity(new Worker(25, "Anna", true));
                }
            }));
        }
        for(Thread thread: threads){
            thread.start();
        }

        for(Thread thread: threads){
            thread.join();
        }
        assertEquals(1000, entityManager.getAll().size());
    }
}

