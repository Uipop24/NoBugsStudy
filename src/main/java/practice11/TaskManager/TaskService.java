package practice11.TaskManager;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TaskService <T>{

    private Map<T, Task<T>> tasks = new ConcurrentHashMap<>();

    public void addTask(Task<T> task){
        if(!tasks.containsKey(task.getId())){
            tasks.put(task.getId(), task);
        }else{
            throw new IdDuplicateException("Задача с таким id уже создана");
        }

    }

    public synchronized void deleteTask(T id){
        tasks.remove(id);
    }

    public List<Task<T>> filterByStatus(String status){
        return tasks.values().stream()
                .filter(tTask -> tTask.getStatus().equals(status))
                .toList();
    }

    public List<Task<T>> filterByPriority(String priority){
        return tasks.values().stream()
                .filter(tTask -> tTask.getPriority().equals(priority))
                .toList();
    }

    public List<Task<T>> sortByDate(){
        return tasks.values().stream()
                .sorted(Comparator.comparing(tTask -> tTask.getDate()))
                .toList();
    }

    public List<Task<T>> getAllTasks(){
        return List.copyOf(tasks.values());
    }
}
