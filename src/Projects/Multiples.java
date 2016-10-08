package Projects;

/**
 * Project 1 Question:
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * This class finds the unique multiples of 3 and 5, and returns the sum of those below 1000.
 *
 * @author Tyler Reed
 * @version 2016.9.15
 */
public class Multiples {

    private final int FIRST_LCD = 3;
    private final int SECOND_LCD = 5;
    private final int MAX_RANGE = 1000;

    private int total;
    private String output = "";

    public Multiples() {
        output += multiples(FIRST_LCD, SECOND_LCD, MAX_RANGE);
    }

    /**
     * Returns the sum of the multiples a and b less than max.  Since there will be intersections
     * of both multiples, we have to subtract where the numbers are counted twice.  This is
     * done by finding the greatest common denominator, and adding all denominations of that GCD
     * and subtracting it from the sum of the multiples.
     *
     * @param a
     * @param b
     * @param max
     * @return  sum - GCD(a, b, max)
     */
    private int multiples(int a, int b, int max) {
        int count = 1;

        while (count < max) {
            if (count % a == 0) {
                total += count;
            }
            if (count % b == 0) {
                total += count++;
            } else {
                count++;
            }
        }

        return total = (total - GCD(a, b, max));
    }

    /**
     * Returns the sum of the greatest common denominator increments of a and b less than the max.
     * I.E. Find multiples of 3 and 5 less than 1000
     *      multiples are 3, 5, 6, 9, 10...etc., but 15 will appear twice from the 3 and 5,
     *      so we need to only count for one of them.  Add all incrementations of the GCD, which
     *      is multiple a * multiple b, and return that sum.
     *
     * @param a
     * @param b
     * @return  sum of GCD increments up to max
     */
    private int GCD(int a, int b, int max) {
        int gcdSum = 0;
        int count = a * b;

        while (count < max) {
            gcdSum += count;
            count += a * b;
        }

        return gcdSum;
    }

    /**
     * Returns a formatted output.
     *
     * @return  output
     */
    public String print() {
        output = "Sum of multiples " + FIRST_LCD + ", " + SECOND_LCD +
                  " less than " + MAX_RANGE + " : " + total;

        return output;
    }
}

