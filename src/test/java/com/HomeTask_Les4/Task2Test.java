package com.HomeTask_Les4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    public Task2 testTask2;

    @Before
    public void before()
    {
        System.out.println("Before running...");
        testTask2= new Task2();
    }

    @Test
    public void convert() {
        String s="hykiodfuo";
        int numRow=4;
        String result=testTask2.Convert(s,numRow);
        assertEquals("hfydukooi",result);
    }
}