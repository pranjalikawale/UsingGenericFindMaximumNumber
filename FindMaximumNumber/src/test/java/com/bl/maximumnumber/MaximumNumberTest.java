package com.bl.maximumnumber;

import com.bl.maimumnumber.MaximumNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    private MaximumNumber maximumNumber;
    //Invoke default constructor
    @Before
    public void initialize() {
        maximumNumber =new MaximumNumber();
    }
    //Test for integer
    @Test
    public void givenThreeInteger_ShouldReturnMaximumNumber(){
        Assert.assertEquals(Integer.valueOf(3),maximumNumber.getMaximum(1,2,3));
    }
    //Test for float
    @Test
    public void givenThreeFloat_ShouldReturnMaximumNumber(){
        Assert.assertEquals(Double.valueOf(3.3),maximumNumber.getMaximum(1.1,2.2,3.3));
    }
    //Test for string
    @Test
    public void givenThreeString_ShouldReturnMaximumNumber(){
        Assert.assertEquals(String.valueOf("c"),maximumNumber.getMaximum("a","b","c"));
    }
    //Test for Object
    @Test
    public void givenThreeObject_ShouldReturnMaximumObject(){
        Assert.assertEquals(Integer.valueOf(3),maximumNumber.getMaximum(1,2,3));
        Assert.assertEquals(Double.valueOf(3.3),maximumNumber.getMaximum(1.1,2.2,3.3));
        Assert.assertEquals(String.valueOf("c"),maximumNumber.getMaximum("a","b","c"));
    }
    //Test using parameterized constructor
    @Test
    public void givenThreeObjectToConstructor_ShouldReturnMaximumObject(){
        Assert.assertEquals(Integer.valueOf(3),new MaximumNumber(1,2,3).getMaximum());
        Assert.assertEquals(Double.valueOf(3.3),new MaximumNumber(3.3,2.2,1.1).getMaximum());
        Assert.assertEquals(String.valueOf("c"),new MaximumNumber("a","c","b").getMaximum());
    }
}
