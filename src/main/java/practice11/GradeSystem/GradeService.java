package practice11.GradeSystem;

import practice11.Validator.InvalidUserException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class GradeService<T extends Number> {
    private List<StudentGrade<T>> gradeList = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> studentGrade){
        if(studentGrade.getGrade().doubleValue() < 0 || studentGrade.getGrade().doubleValue() > 100){
            throw new InvalidGradeException("Оценка неверна");
        }else {
            gradeList.add(studentGrade);
        }
    }

    public double avgGrade(String subject){
        OptionalDouble avg = gradeList.stream()
                .filter(s -> s.getSubject().equals(subject))
                .mapToDouble(s -> s.getGrade().doubleValue())
                .average();
        if(avg.isPresent()){
            return avg.getAsDouble();
        }else {
            throw new InvalidGradeException("Оценок нет");
        }
    }

    public List<StudentGrade<T>> getAll(){
        return List.copyOf(gradeList);
    }
}
