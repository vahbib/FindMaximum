package com.cg.findmaximum;

public class FindMaximum<E extends Comparable> {
    E a,b,c;
    public FindMaximum(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public E maxOf() {

        if(a.compareTo(b)>0 && a.compareTo(c)>0){
            return a;
        }
        else if(b.compareTo(a)>0 && b.compareTo(c)>0){
            return b;
        }
        else {
            return c;
        }
    }

}
