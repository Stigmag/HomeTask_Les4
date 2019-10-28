package com.HomeTask_Les4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {


    public Task3 testTask3;

    @Before
    public void before()
    {
        System.out.println("Before running...");
        testTask3= new Task3();
    }
    @Test
    public void maxArea() {
        int[] arr={1,2,3,4,5,9,7,8,9,3,4,5,4,3,2,3,4};
        int result= testTask3.maxArea(arr);
        assertEquals(52,result);
    }

    @Test
    public void maxArea1() {
        int[] arr={1,2,3,4,5,9,7,8,9,3,4,5};
        int result= testTask3.maxArea(arr);
        assertEquals(35,result);
    }
    @Test
    public void maxArea2() {
        int[] arr={9,8,4,9,3,2,5,6};
        int result= testTask3.maxArea(arr);
        assertEquals(42,result);
    }

}