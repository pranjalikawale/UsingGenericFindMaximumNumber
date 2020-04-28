package com.bl.maximumnumber;

import com.bl.maimumnumber.MaximumNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    private MaximumNumber maximumNumber;
    @Before
    public void initialize() {
        maximumNumber =new MaximumNumber();
    }
    //Test for Integer
    @Test
    public void givenThreeInteger_ShouldReturnMaximumNumber(){
        Assert.assertEquals(Integer.valueOf(3),maximumNumber.getMaximum(1,2,3));
    }

}
