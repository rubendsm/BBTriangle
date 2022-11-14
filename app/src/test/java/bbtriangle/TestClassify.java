package bbtriangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestClassify {
    private Triangle triangle;
    int MAX_INT = 999999999;
    int MIN_INT = 1;
    
    //ECP Testes
    @Test
    public void TestClassifyEquilateral(){
        triangle = new Triangle(3,3,3);
        String expectedOutput = "equilateral";
        assertEquals(expectedOutput, triangle.classify());
    }

    @Test
    public void TestClassifyIsosceles(){
        triangle = new Triangle(2, 2, 4);
        String expectedOutput = "isossceles";
        assertEquals(expectedOutput, triangle.classify());
    }

    @Test
    public void TestClassifyScalene(){
        triangle = new Triangle(3, 5, 4);
        String expectedOutput = "scalene";
        assertEquals(expectedOutput, triangle.classify());
    }

    @Test
    public void TestClassifyRightAngled(){
        triangle = new Triangle(15, 9, 12);
        String expectedOutput = "right-angled";
        assertEquals(expectedOutput, triangle.classify());
    }

    @Test
    public void TestClassifyImpossible(){
        triangle = new Triangle(0, 4, 0);
        String expectedOutput = "impossible";
        assertEquals(expectedOutput, triangle.classify());
    }

    // BVA Testes
    @Test
    public void TestClassifyAllZero(){
        triangle = new Triangle(0, 0, 0);
        String expectedOutput = "impossible";
        assertEquals(expectedOutput, triangle.classify());
    }

    @Test
    public void TestClassifyTwoZeroMaxInt(){
        triangle = new Triangle(0, 0, MAX_INT);
        String expectedOutput = "impossible";
        assertEquals(expectedOutput, triangle.classify());
    }

    @Test
    public void TestClassifyOneZeroMaxIntOneZero(){
        triangle = new Triangle(0, MAX_INT,0);
        String expectedOutput = "impossible";
        assertEquals(expectedOutput, triangle.classify());
    }

    @Test
    public void TestClassifyMaxIntTwoZero(){
        triangle = new Triangle(MAX_INT,0,0);
        String expectedOutput = "impossible";
        assertEquals(expectedOutput, triangle.classify());
    }

    @Test
    public void TestClassifyTwoMaxIntZero(){
        triangle = new Triangle(MAX_INT,MAX_INT,0);
        String expectedOutput = "impossible";
        assertEquals(expectedOutput, triangle.classify());
    }

    @Test
    public void TestClassifyMaxIntZeroMaxInt(){
        triangle = new Triangle(MAX_INT,0,MAX_INT);
        String expectedOutput = "impossible";
        assertEquals(expectedOutput, triangle.classify());
    }

    @Test
    public void TestClassifyZeroTwoMaxInt(){
        triangle = new Triangle(0,MAX_INT,MAX_INT);
        String expectedOutput = "impossible";
        assertEquals(expectedOutput, triangle.classify());
    }

    @Test
    public void TestClassifyAllMaxInt(){
        triangle = new Triangle(MAX_INT,MAX_INT,MAX_INT);
        String expectedOutput = "equilateral";
        assertEquals(expectedOutput, triangle.classify());
    }
}

