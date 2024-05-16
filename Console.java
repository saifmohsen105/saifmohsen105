package algorithm;

import java.util.Scanner;

public class Console {
    
    /**
     * scan string value
     * @return String
     */

    public static String scanStr() {
        return new Scanner(System.in).next();
    }
    
    /**
     * scan boolean value
     * @return boolean
     */

    public static boolean scanBool() {
        return new Scanner(System.in).nextBoolean();
    }
    
    /**
     * scan integer value
     * @return int
     */

    public static int scanInt() {
        return new Scanner(System.in).nextInt();
    }
    
    /**
     * scan long value 
     * @return long
     */

    public static long scanLong() {
        return new Scanner(System.in).nextLong();
    }
    
    /**
     * scan float value
     * @return float
     */

    public static float scanFloat() {
        return new Scanner(System.in).nextFloat();
    }
    
    /**
     * scan double value
     * @return double
     */

    public static double scanDouble() {
        return new Scanner(System.in).nextDouble();
    }
    
    /**
     * print message to console
     * @param val 
     */

    public static void print(Object val) {
        System.out.print(val);
    }
    
    /**
     * print line message to console
     * @param val 
     */

    public static void println(Object val) {
        System.out.println(val);
    }
    
    /**
     * print error message to console
     * @param val 
     */

    public static void eprint(Object val) {
        System.err.print(val);
    }
    
    /**
     * print line error message to console
     * @param val 
     */

    public static void eprintln(Object val) {
        System.err.println(val);
    }
    
}
