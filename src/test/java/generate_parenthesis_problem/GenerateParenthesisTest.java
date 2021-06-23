package generate_parenthesis_problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateParenthesisTest {

    private GenerateParenthesis sut;
    private List<String> parenthesis;

    @BeforeEach
    public void setUp() {
        sut = new GenerateParenthesis();
        parenthesis = new ArrayList<>();
    }

    @Test
    public void testCase1() {
        sut.solution(parenthesis, 1);

        assertEquals(1, parenthesis.size());
        String first = parenthesis.get(0);
        assertEquals("()", first);
    }

    @Test
    public void testCase2() {
        sut.solution(parenthesis, 3);

        assertEquals(5, parenthesis.size());
        String first = parenthesis.get(0);
        String second = parenthesis.get(1);
        String third = parenthesis.get(2);
        String fourth = parenthesis.get(3);
        String fifth = parenthesis.get(4);
        assertEquals("((()))", first);
        assertEquals("(()())", second);
        assertEquals("(())()", third);
        assertEquals("()(())", fourth);
        assertEquals("()()()", fifth);
    }

}