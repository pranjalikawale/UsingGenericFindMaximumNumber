package com.bl.maimumnumber;

public class MaximumNumber<T extends Comparable>{
    //Variable declared
    private T a,b,c;

    //Default constructor
    public MaximumNumber(){ }

    //Parameterized constructor
    public MaximumNumber(T a,T b,T c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

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
        T max;
        if (a.compareTo(b)>0 && a.compareTo(c)>0 )
            max=a;
        else if (b.compareTo(c)>0)
            max=b;
        else
            max=c;
        printMax(max);
        return max;
    }

    //Compare object and return max
    public <T extends Comparable<T>> Comparable<T> getMaximum(){
         return (Comparable<T>) getMaximum(a, b, c);
    }

    //Print maximum
    public static <T extends Comparable<T>> void printMax(T max){
        System.out.println(max);
    }


}
