package com.bl.maimumnumber;

public class MaximumNumber {
    public static Integer getMaximum(Integer a,Integer b,Integer c){
        Integer max=a;
        if (a.compareTo(b)>0 && a.compareTo(c)>0 )
            return a;
        else if (b.compareTo(c)>0)
            return b;
        else
            return c;
    }
}
