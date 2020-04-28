package com.bl.maimumnumber;

public class MaximumNumber<T extends Comparable<T>>{
    /*//Compare integer number and return max
    public static Integer getMaximum(Integer a,Integer b,Integer c){
        if (a.compareTo(b)>0 && a.compareTo(c)>0 )
            return a;
        else if (b.compareTo(c)>0)
            return b;
        else
            return c;
    }
    //Compare float number and return max
    public static Double getMaximum(Double a,Double b,Double c){
        if (a.compareTo(b)>0 && a.compareTo(c)>0 )
            return a;
        else if (b.compareTo(c)>0)
            return b;
        else
            return c;
    }
    //Compare string and return max
    public static String getMaximum(String a,String b,String c){
        if (a.compareTo(b)>0 && a.compareTo(c)>0 )
            return a;
        else if (b.compareTo(c)>0)
            return b;
        else
            return c;
    }
     */
    //Compare object and return max
    public static <T extends Comparable<T>> Comparable<T> getMaximum(T a, T b, T c){
        if (a.compareTo(b)>0 && a.compareTo(c)>0 )
            return a;
        else if (b.compareTo(c)>0)
            return b;
        else
            return c;
    }
    
}
