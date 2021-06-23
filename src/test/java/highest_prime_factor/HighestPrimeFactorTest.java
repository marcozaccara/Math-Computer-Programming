package highest_prime_factor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HighestPrimeFactorTest {

    private HighestPrimeFactor sut;

    @BeforeEach
    public void setUp() {
        sut = new HighestPrimeFactor();
    }

    @Test // 13195 = 5*7*13*29
    public void testCase1() {
        long result = sut.getHighestPrimeFactor(13195L);
        assertEquals(29, result);
    }

    @Test // 600851475143 = 71*839*1471*6857
    public void testCase2() {
        long result = sut.getHighestPrimeFactor(600851475143L);
        assertEquals(6857, result);
    }

    @Test // 2 = 2*1
    public void testCase3() {
        long result = sut.getHighestPrimeFactor(2L);
        assertEquals(2, result);
    }

    @Test // 1 = 1*1
    public void testCase4() {
        long result = sut.getHighestPrimeFactor(1L);
        assertEquals(1, result);
    }

    @Test // 31 = 31*1
    public void testCase5() {
        long result = sut.getHighestPrimeFactor(31L);
        assertEquals(31, result);
    }

}