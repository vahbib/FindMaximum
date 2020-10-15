package com.cg.findmaximum;

public class FindMaximum {
    static  int max = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum Problem of GENERIC");
    }
    /* Usercase 1 */
    public static int maxInt( Integer a, Integer b, Integer c) {
        if (a.compareTo(b)>0 && a.compareTo(c)>0 ) {
            max = a;
        } else if (b.compareTo(a)>0 && b.compareTo(c)>0) {
            max =  b;
        } else {
            max = c;
        }
        System.out.println("Maximum of given Integers is: "+max);
        return max;
    }

}
