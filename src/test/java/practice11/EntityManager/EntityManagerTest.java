package practice11.EntityManager;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {

    @Test
    public void addElementIntoEmptyCollection() {
        Worker workerAnna = new Worker(20, "Anna", true);
        EntityManager<Worker> emptyList = new EntityManager<>();
        emptyList.addEntity(workerAnna);
        assertTrue(emptyList.getAll().contains(workerAnna));
    }

    @Test
    public void addElementIntoEmptyCollectionSizeCheck() {
        Worker workerAnna = new Worker(20, "Anna", true);
        EntityManager<Worker> emptyList = new EntityManager<>();
        emptyList.addEntity(workerAnna);
        int expectedSize = 1;
        assertEquals(expectedSize, emptyList.getAll().size());
    }

    @Test
    public void addElementIntoCollectionWithSomeElements() {
        Worker workerAnna = new Worker(20, "Anna", true);
        Worker workerVictor = new Worker(22, "Victor", true);
        Worker workerDog = new Worker(90, "Dog", true);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        workerList.addEntity(workerVictor);
        workerList.addEntity(workerDog);
        int expectedSize = 3;
        assertEquals(expectedSize, workerList.getAll().size());
    }

        @Test
    public void removeElementFromList() {
        Worker workerAnna = new Worker(20, "Anna", true);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        assertTrue(workerList.remove(workerAnna));
    }

    @Test
    public void removeElementFromEmptyList() {
        Worker workerAnna = new Worker(20, "Anna", true);
        EntityManager<Worker> workerList = new EntityManager<>();
        assertFalse(workerList.remove(workerAnna));
    }

    @Test
    public void checkSizeAfterRemove() {
        Worker workerAnna = new Worker(20, "Anna", true);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        workerList.remove(workerAnna);
        int expectedSize = 0;
        assertEquals(expectedSize, workerList.getAll().size());
    }

    @Test
    public void checkGetAllFromListWithDeletedElement() {
        Worker workerAnna = new Worker(20, "Anna", true);
        Worker workerVictor = new Worker(22, "Victor", true);
        Worker workerDog = new Worker(90, "Dog", true);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        workerList.addEntity(workerVictor);
        workerList.addEntity(workerDog);
        workerList.remove(workerVictor);
        assertFalse(workerList.getAll().contains(workerVictor));
    }

    @Test
    public void removeFromCopyOfList() {
        Worker workerAnna = new Worker(20, "Anna", true);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        List<Worker> copyList = workerList.getAll();
        assertThrows(UnsupportedOperationException.class, () -> copyList.remove(workerAnna));
    }

    @Test
    public void checkOverrideEqualsAndHashCode() {
        Worker workerAnna = new Worker(20, "Anna", true);
        Worker workerAnnaTheSecond = new Worker(20, "Anna", true);
        assertEquals(workerAnna, workerAnnaTheSecond);
    }

    @Test
    public void checkFilterByAge() {
        Worker workerAnna = new Worker(0, "Anna", true);
        Worker workerVictor = new Worker(99, "Victor", true);
        Worker workerDog = new Worker(100, "Dog", true);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        workerList.addEntity(workerVictor);
        workerList.addEntity(workerDog);
        List<Worker> expectedList = List.of(workerAnna, workerVictor);
        List<Worker> actualList = workerList.filterByAge(0, 99);
        assertEquals(expectedList, actualList);

    }

    @Test
    public void checkNegativeAge() {
        assertThrows(IllegalArgumentException.class, () -> new Worker(-1, "Anna", true));

    }

    @Test
    public void checkAgeMoreThan100() {
        assertThrows(IllegalArgumentException.class, () -> new Worker(101, "Anna", true));

    }

    @Test
    public void checkFilterByAgeEmptyList() {
        Worker workerAnna = new Worker(20, "Anna", true);
        Worker workerVictor = new Worker(22, "Victor", true);
        Worker workerDog = new Worker(90, "Dog", true);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        workerList.addEntity(workerVictor);
        workerList.addEntity(workerDog);
        List<Worker> expectedList = List.of();
        List<Worker> actualList = workerList.filterByAge(23, 89);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkFilterByName() {
        Worker workerAnna = new Worker(20, "Anna", true);
        Worker workerVictor = new Worker(22, "Victor", true);
        Worker workerDog = new Worker(90, "Dog", true);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        workerList.addEntity(workerVictor);
        workerList.addEntity(workerDog);
        List<Worker> expectedList = List.of(workerVictor);
        List<Worker> actualList = workerList.filterByName("Victor");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkFilterByNameGetEmptyList() {
        Worker workerAnna = new Worker(20, "Anna", true);
        Worker workerVictor = new Worker(22, "Victor", true);
        Worker workerDog = new Worker(90, "Dog", true);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        workerList.addEntity(workerVictor);
        workerList.addEntity(workerDog);
        List<Worker> expectedList = List.of();
        List<Worker> actualList = workerList.filterByName("Ivan");
        assertEquals(expectedList, actualList);
    }


    @Test
    public void checkFilterByNameDuplicateNames() {
        Worker workerAnna = new Worker(20, "Anna", true);
        Worker workerAnnaTheSecond = new Worker(22, "Anna", true);
        Worker workerDog = new Worker(90, "Dog", false);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        workerList.addEntity(workerAnnaTheSecond);
        workerList.addEntity(workerDog);
        List<Worker> expectedList = List.of(workerAnna, workerAnnaTheSecond);
        List<Worker> actualList = workerList.filterByName("Anna");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkFilterByActivityTrue() {
        Worker workerAnna = new Worker(20, "Anna", true);
        Worker workerVictor = new Worker(22, "Victor", true);
        Worker workerDog = new Worker(90, "Dog", false);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        workerList.addEntity(workerVictor);
        workerList.addEntity(workerDog);
        List<Worker> expectedList = List.of(workerAnna, workerVictor);
        List<Worker> actualList = workerList.filterByActive(true);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkFilterByActivityFalse() {
        Worker workerAnna = new Worker(20, "Anna", true);
        Worker workerVictor = new Worker(22, "Victor", true);
        Worker workerDog = new Worker(90, "Dog", false);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        workerList.addEntity(workerVictor);
        workerList.addEntity(workerDog);
        List<Worker> expectedList = List.of(workerDog);
        List<Worker> actualList = workerList.filterByActive(false);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void checkFilterByActivityEmptyList() {
        Worker workerAnna = new Worker(20, "Anna", true);
        Worker workerVictor = new Worker(22, "Victor", true);
        Worker workerDog = new Worker(90, "Dog", true);
        EntityManager<Worker> workerList = new EntityManager<>();
        workerList.addEntity(workerAnna);
        workerList.addEntity(workerVictor);
        workerList.addEntity(workerDog);
        List<Worker> expectedList = List.of();
        List<Worker> actualList = workerList.filterByActive(false);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void raceCondition() throws InterruptedException {
        EntityManager<Worker> workerList = new EntityManager<>();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int index = i;
            threads.add(new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    workerList.addEntity(new Worker(20, "Worker-" + index + "-" + j, true));
                }
            }));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        assertEquals(1000, workerList.getAll().size());
    }


}
