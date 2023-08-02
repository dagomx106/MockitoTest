import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class StudentScoreCalculatorTestParams {

    public void StudentScoreCalculator(int mathScore, int literacyScore, int expectedScore){
        StudentScoreCalculator sc = new StudentScoreCalculator();
        sc.calculateSATScore(mathScore,literacyScore);
        assertEquals(expectedScore,sc.getSatScore());
    }
}
