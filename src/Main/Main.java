package Main;

import Projects.Fibonacci;
import Projects.Multiples;
import Projects.PrimeFactor;

/**
 * @author Tyler Reed
 * @version 2016.9.16
 */
public class Main {

    public static void main(String args[]) {
        Multiples multiples = new Multiples();
        Fibonacci fibonacci = new Fibonacci();
        PrimeFactor primeFactor = new PrimeFactor();

        System.out.println(multiples.print());
        System.out.println(fibonacci.print());
        System.out.println(primeFactor.print());
    }
}
