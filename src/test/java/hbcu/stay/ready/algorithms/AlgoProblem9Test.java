package hbcu.stay.ready.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoProblem9Test {

    @Test
    public void testOne(){
        AlgoProblem9 algoProblem9 = new AlgoProblem9();

        String expected = "KKaalleebb";
        String actual = algoProblem9.seeingDouble("Kaleb");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        AlgoProblem9 algoProblem9 = new AlgoProblem9();

        String expected = "TTaarriiqq";
        String actual = algoProblem9.seeingDouble("Tariq");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        AlgoProblem9 algoProblem9 = new AlgoProblem9();

        String expected = "HHeelllloo  WWoorrlldd";
        String actual = algoProblem9.seeingDouble("Hello World");

        Assertions.assertEquals(expected,actual);
    }



}
