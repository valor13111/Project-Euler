package Projects;

/**
 * Project 3 Question:
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Tyler Reed
 * @version 2016.9.20
 */
public class PrimeFactor {

    private final long LARGEST_PRIME_FACTOR = 600851475143L;
    private long lpf;

    public PrimeFactor() {
        long lpf = findLPF(LARGEST_PRIME_FACTOR);
    }

    /**
     * Returns the largest prime factor from a given long.  The method loops through
     * the size of the given long, and if long % num (starts with 2, being smallest prime
     * number) equals zero, then we divide the long by num (initially 2) and set itself
     * equal to this.
     *
     * In general, the algorithm is to divide the long number starting with 2, and
     * if the remainder is zero, the long number is set to long divided by 2.  If however,
     * it is not equal to zero, increment 2, and do long divided by 3.  If the remainder is zero,
     * then set long = long / 3.  Then reset the number dividing by, to 2.  Repeat this process
     * until the end of the loop, and you will find the largest prime factor.
     *
     * This algorithm doesn't need an array of prime numbers to compare to, or have a need
     * to find any prime numbers.
     *
     * @param l
     * @return  largest prime factor
     */
    private long findLPF(long l) {
        // start with smallest prime number, but every increase is not to the next
        // prime number
        // it is incrementally increased by 1
        int num = 2;

        for (long i = 0; i <= l; i++) {
            // if no remainder
            if (l % num == 0) {
                l = l / num;
                // reset num to 2
                num = 2;
            } else {
                num++;
            }
        }

        return lpf = l;
    }

    /**
     * Returns a formatted string of the largest prime factor.
     *
     * @return  output string
     */
    public String print() {
        String output = "Largest Prime Factor of " + LARGEST_PRIME_FACTOR + " : " + lpf;

        return output;
    }


}
