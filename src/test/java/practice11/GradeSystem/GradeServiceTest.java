package practice11.GradeSystem;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest extends GradeServiceBase{

    public static Stream<Arguments> listOfStudentsGrades(){
        return Stream.of(
                Arguments.of("Ivan", "geo", 0),
                Arguments.of("Ruslan", "geo", 100),
                Arguments.of("Maxim", "geo", 99),
                Arguments.of("Marina", "geo", 1)
        );
    }


    public static Stream<Arguments> listOfStudentsIncorrectGrades(){
        return Stream.of(
                Arguments.of("Ivan", "geo", -1),
                Arguments.of("Ruslan", "geo", 101)
        );
    }

    @ParameterizedTest
    @MethodSource("listOfStudentsGrades")
    public void addCorrectGrade(String name, String subject, double grade){
        StudentGrade<Double> studentGrade = new StudentGrade<>(name, subject, grade);
        assertDoesNotThrow(() -> gradeService.addGrade(studentGrade));
    }

    @ParameterizedTest
    @MethodSource("listOfStudentsIncorrectGrades")
    public void addIncorrectGrade(String name, String subject, double grade){
        StudentGrade<Double> studentGrade = new StudentGrade<>(name, subject, grade);
        assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(studentGrade));
    }

    @Test
    public void checkAvgGrade(){
        gradeService.addGrade(new StudentGrade<>("Ivan", "geo", 0.1));
        gradeService.addGrade(new StudentGrade<>("Ivan", "geo", 9.9));
        gradeService.addGrade(new StudentGrade<>("Ivan", "math", 99.0));
        double expectedAvgGrade = 5.0;
        double actualAvgGrade = gradeService.avgGrade("geo");
        assertEquals(expectedAvgGrade, actualAvgGrade);
    }

    @Test
    public void checkAvgGradeWithOutSubject(){
        gradeService.addGrade(new StudentGrade<>("Ivan", "geo", 0.1));
        gradeService.addGrade(new StudentGrade<>("Ivan", "geo", 9.9));
        gradeService.addGrade(new StudentGrade<>("Ivan", "math", 99.0));
        assertThrows(InvalidGradeException.class, () ->gradeService.avgGrade("art"));
    }

    @Test
    public void checkSizeOfList() {
        gradeService.addGrade(new StudentGrade<>("Ivan", "geo", 0.1));
        gradeService.addGrade(new StudentGrade<>("Ivan", "geo", 9.9));
        gradeService.addGrade(new StudentGrade<>("Ivan", "math", 99.0));
        int expectedSize = 3;
        int actualSize = gradeService.getAll().size();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void checkElementCanNotBeDeleted(){
        gradeService.addGrade(new StudentGrade<>("Ivan", "geo", 0.1));
        gradeService.addGrade(new StudentGrade<>("Ivan", "geo", 9.9));
        assertThrows(UnsupportedOperationException.class, () -> gradeService.getAll().removeFirst());
    }

    @Test
    public void checkThreadsSafety() throws InterruptedException {
        GradeService<Integer> integerGradeService = new GradeService<>();
        int threadsCount = 5;
        int gradesPerThread = 100;
        List<Thread> threads = new ArrayList<>();
        for(int i = 0;  i < threadsCount; i++){
            Thread thread = new Thread(() -> {
                for(int j = 0; j < gradesPerThread; j++){
                    integerGradeService.addGrade(new StudentGrade<>("Ivan", "geo", j));
                }
            });
            thread.start();
            threads.add(thread);
        }
        for (Thread thread:threads){
            thread.join();
        }
        assertEquals(threadsCount * gradesPerThread, integerGradeService.getAll().size());
    }
}
