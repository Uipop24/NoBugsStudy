package practice11.TaskManager;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    public void checkAddTaskWithIntId() {
        Task<Integer> task = new Task<>(12345, "resolved", "low", LocalDate.of(2026, 11, 16));
        TaskService<Integer> taskService = new TaskService<>();
        taskService.addTask(task);
        List<Task<Integer>> actual = taskService.getAllTasks();
        List<Task<Integer>> expected = List.of(task);
        assertEquals(expected, actual);
    }

    @Test
    public void checkAddTaskWithStringId() {
        Task<String> task = new Task<>("12345", "resolved", "low", LocalDate.of(2026, 11, 16));
        TaskService<String> taskService = new TaskService<>();
        taskService.addTask(task);
        List<Task<String>> actual = taskService.getAllTasks();
        List<Task<String>> expected = List.of(task);
        assertEquals(expected, actual);
    }

    @Test
    public void checkAddTaskWithDuplicateId() {
        Task<String> task = new Task<>("12345", "resolved", "low", LocalDate.of(2026, 11, 16));
        Task<String> task2 = new Task<>("12345", "readyToTest", "low", LocalDate.of(2026, 11, 16));
        TaskService<String> taskService = new TaskService<>();
        taskService.addTask(task);
        assertThrows(IdDuplicateException.class, () -> taskService.addTask(task2));
    }

    @Test
    public void checkDeleteTask() {
        Task<String> task = new Task<>("12345", "resolved", "low", LocalDate.of(2026, 11, 16));
        TaskService<String> taskService = new TaskService<>();
        taskService.addTask(task);
        taskService.deleteTask("12345");
        List<Task<String>> actual = taskService.getAllTasks();
        List<Task<String>> expected = List.of();
        assertEquals(expected, actual);
    }

    @Test
    public void checkFilterByStatus() {
        Task<String> task = new Task<>("12345", "resolved", "low", LocalDate.of(2026, 11, 16));
        Task<String> task2 = new Task<>("123456", "resolved", "low", LocalDate.of(2026, 11, 16));
        Task<String> task3 = new Task<>("123457", "readyToTest", "low", LocalDate.of(2026, 11, 16));
        TaskService<String> taskService = new TaskService<>();
        taskService.addTask(task);
        taskService.addTask(task2);
        taskService.addTask(task3);
        List<Task<String>> actual = taskService.filterByStatus("resolved");
        int actualSize = actual.size();
        int expectedSize = 2;
        assertEquals(expectedSize, actualSize);
        assertTrue(actual.contains(task));
        assertTrue(actual.contains(task2));
        assertFalse(actual.contains(task3));
    }

    @Test
    public void checkFilterByStatusEmptyResult() {
        Task<String> task = new Task<>("12345", "resolved", "low", LocalDate.of(2026, 11, 16));
        TaskService<String> taskService = new TaskService<>();
        taskService.addTask(task);
        List<Task<String>> actual = taskService.filterByStatus("readyToTest");
        List<Task<String>> expected = List.of();
        assertEquals(expected, actual);
    }

    @Test
    public void checkFilterByPriority() {
        Task<String> task = new Task<>("12345", "resolved", "low", LocalDate.of(2026, 11, 16));
        Task<String> task2 = new Task<>("123456", "resolved", "low", LocalDate.of(2026, 11, 16));
        Task<String> task3 = new Task<>("123457", "resolved", "high", LocalDate.of(2026, 11, 16));
        TaskService<String> taskService = new TaskService<>();
        taskService.addTask(task);
        taskService.addTask(task2);
        taskService.addTask(task3);
        List<Task<String>> actual = taskService.filterByPriority("low");
        int actualSize = actual.size();
        int expectedSize = 2;
        assertEquals(expectedSize, actualSize);
        assertTrue(actual.contains(task));
        assertTrue(actual.contains(task2));
        assertFalse(actual.contains(task3));
    }

    @Test
    public void checkFilterByPriorityEmptyList() {
        Task<String> task = new Task<>("12345", "resolved", "low", LocalDate.of(2026, 11, 16));
        TaskService<String> taskService = new TaskService<>();
        taskService.addTask(task);
        List<Task<String>> actual = taskService.filterByPriority("high");
        List<Task<String>> expected = List.of();
        assertEquals(expected, actual);
    }

    @Test
    public void checkSortByDate() {
        Task<String> task = new Task<>("12345", "resolved", "low", LocalDate.of(2026, 10, 12));
        Task<String> task2 = new Task<>("123456", "resolved", "low", LocalDate.of(2026, 11, 20));
        Task<String> task3 = new Task<>("123457", "resolved", "low", LocalDate.of(2026, 9, 30));
        TaskService<String> taskService = new TaskService<>();
        taskService.addTask(task);
        taskService.addTask(task2);
        taskService.addTask(task3);
        List<Task<String>> actual = taskService.sortByDate();
        List<Task<String>> expected = List.of(task3, task, task2);
        assertEquals(expected, actual);
    }


}
