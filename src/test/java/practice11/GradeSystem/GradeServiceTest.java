package practice11.GradeSystem;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {

    public static Stream<Arguments> listOfStudentsIntGrades() {
        return Stream.of(
                Arguments.of("Виктор", "география", 0),
                Arguments.of("Виктор", "химия", 1),
                Arguments.of("Виктор", "математика", 99),
                Arguments.of("Виктор", "физика", 100)
        );
    }

    public static Stream<Arguments> listOfStudentsDoubleGrades() {
        return Stream.of(
                Arguments.of("Виктор", "география", 0.1),
                Arguments.of("Виктор", "химия", 99.9)
        );
    }


    public static Stream<Arguments> listOfStudentsIncorrectIntGrades() {
        return Stream.of(
                Arguments.of("Виктор", "география", -1),
                Arguments.of("Виктор", "химия", 101)
        );
    }

    public static Stream<Arguments> listOfStudentsIncorrectDoubleGrades() {
        return Stream.of(
                Arguments.of("Виктор", "география", -0.1),
                Arguments.of("Виктор", "химия", 100.1)
        );
    }

    @ParameterizedTest
    @MethodSource("listOfStudentsIntGrades")
    public void addCorrectIntGrade(String name, String subject, int grade) {
        GradeService<Integer> gradeService = new GradeService<>();
        StudentGrade<Integer> studentGrade = new StudentGrade<>(name, subject, grade);
        assertDoesNotThrow(() -> gradeService.addGrade(studentGrade));
    }

    @ParameterizedTest
    @MethodSource("listOfStudentsDoubleGrades")
    public void addCorrectDoubleGrade(String name, String subject, double grade) {
        GradeService<Double> gradeService = new GradeService<>();
        StudentGrade<Double> studentGrade = new StudentGrade<>(name, subject, grade);
        assertDoesNotThrow(() -> gradeService.addGrade(studentGrade));
    }


    @ParameterizedTest
    @MethodSource("listOfStudentsIncorrectIntGrades")
    public void addIncorrectIntGrade(String name, String subject, int grade) {
        GradeService<Integer> gradeService = new GradeService<>();
        StudentGrade<Integer> studentGrade = new StudentGrade<>(name, subject, grade);
        assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(studentGrade));
    }

    @ParameterizedTest
    @MethodSource("listOfStudentsIncorrectDoubleGrades")
    public void addIncorrectDoubleGrade(String name, String subject, double grade) {
        GradeService<Double> gradeService = new GradeService<>();
        StudentGrade<Double> studentGrade = new StudentGrade<>(name, subject, grade);
        assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(studentGrade));
    }

    @Test
    public void checkAvgIntGrade() {
        GradeService<Integer> gradeService = new GradeService<>();
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 0));
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 10));
        double expectedGrade = 5.0;
        double actualGrade = gradeService.avgGrade("география");
        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void checkAvgDoubleGrade() {
        GradeService<Double> gradeService = new GradeService<>();
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 0.1));
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 9.9));
        double expectedGrade = 5.0;
        double actualGrade = gradeService.avgGrade("география");
        assertEquals(expectedGrade, actualGrade);

    }

    @Test
    public void checkAvgGradeWithoutSubject() {
        GradeService<Double> gradeService = new GradeService<>();
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 0.1));
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 9.9));
        assertThrows(InvalidGradeException.class, () -> gradeService.avgGrade("химия"));
    }

    @Test
    public void checkAvgIntGradeInOneOfSubjectInList() {
        GradeService<Integer> gradeService = new GradeService<>();
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 0));
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 10));
        gradeService.addGrade(new StudentGrade<>("Виктор", "химия", 25));
        gradeService.addGrade(new StudentGrade<>("Виктор", "химия", 50));
        double expectedGrade = 37.5;
        double actualGrade = gradeService.avgGrade("химия");
        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void checkSizeOfList() {
        GradeService<Integer> gradeService = new GradeService<>();
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 0));
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 10));
        gradeService.addGrade(new StudentGrade<>("Виктор", "химия", 25));
        gradeService.addGrade(new StudentGrade<>("Виктор", "химия", 50));
        int expectedSize = 4;
        int actualSize = gradeService.getAll().size();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void checkElementCantBeDeleted() {
        GradeService<Integer> gradeService = new GradeService<>();
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 0));
        gradeService.addGrade(new StudentGrade<>("Виктор", "география", 10));
        assertThrows(UnsupportedOperationException.class, () -> gradeService.getAll().removeFirst());
    }

    @Test
    public void checkThreadSafety() throws InterruptedException {
        GradeService<Integer> gradeService = new GradeService<>();
        int threadsCount = 5;
        int gradesPerThread = 100;
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < threadsCount; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < gradesPerThread; j++) {
                    gradeService.addGrade(new StudentGrade<>("Поток", "география", j));
                }
            });
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
        }
        assertEquals(threadsCount * gradesPerThread, gradeService.getAll().size());
    }


}
