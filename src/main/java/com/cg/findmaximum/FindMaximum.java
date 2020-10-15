package com.cg.findmaximum;

public class FindMaximum {
    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum Problem of GENERIC");
//        maxInt(5,6,8);
//        maxFloat(5.0f, 6.0f, 8.0f);
    }
    /* Usercase 1 */
    public static int maxInt( Integer a, Integer b, Integer c) {
        int maxI = 0;
        if (a.compareTo(b)>0 && a.compareTo(c)>0 ) {
            maxI = a;
        } else if (b.compareTo(a)>0 && b.compareTo(c)>0) {
            maxI =  b;
        } else {
            maxI = c;
        }
        System.out.println("Maximum of given Integers is: "+maxI);
        return maxI;
    }
    /* Usercase 2 */
    public static float maxFloat( Float a, Float b, Float c) {
        float maxF = 0.0f;
        if (a.compareTo(b)>0 && a.compareTo(c)>0 ) {
            maxF = a;
        } else if (b.compareTo(a)>0 && b.compareTo(c)>0) {
            maxF =  b;
        } else {
            maxF = c;
        }
        System.out.println("Maximum of given Float Numbers is: "+maxF);
        return maxF;
    }
    /* Usercase 3 */
    public static String maxString( String a, String b, String c) {
        String maxS = " ";
        if (a.compareTo(b)>0 && a.compareTo(c)>0 ) {
            maxS = a;
        } else if (b.compareTo(a)>0 && b.compareTo(c)>0) {
            maxS =  b;
        } else {
            maxS = c;
        }
        System.out.println("Maximum of given String is: "+maxS);
        return maxS;
    }

}
