package practice11.GradeSystem;

import org.junit.jupiter.api.BeforeEach;

public class GradeServiceBase {
    protected GradeService<Double> gradeService;

    @BeforeEach
    protected void setUp(){
        gradeService = new GradeService<>();
    }

}
