package highestprimefactor;

/*
https://projecteuler.net/problem=3

The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */
public class HighestPrimeFactor {

    public long getHighestPrimeFactor(Long n) {
        return solution(n);
    }

    private long solution(long number) {
        if (number < 2)
            return 1L;
        else if (number == 2)
            return 2L;
        else {
            long tempHighestPrimeFactor = 2L;
            if (number % 2 == 0) {
                while (number % 2 == 0)
                    number = number / 2;
            }
            long divider = 3;
            while (divider * divider <= number) {
                if (number % divider == 0) {
                    tempHighestPrimeFactor = divider;
                    number = number / divider;
                }
                divider += 2;
            }
            if (number == 1)
                return tempHighestPrimeFactor;
            else
                return number;
        }
    }
}
