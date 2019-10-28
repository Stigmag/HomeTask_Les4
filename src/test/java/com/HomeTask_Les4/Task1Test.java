package com.HomeTask_Les4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {
 public Task1 testTask1;


    @Before
    public void before()
    {
        System.out.println("Before running...");
        testTask1= new Task1();
    }

    @Test
    public void lengthOfLongestSubstring() {
        String ourString="opkp";
        int result=testTask1.lengthOfLongestSubstring(ourString);
        assertEquals(3,result);

    }
    @Test
    public void lengthOfLongestSubstring2() {
        String ourString="kolpmnlop";
        int result=testTask1.lengthOfLongestSubstring(ourString);
        assertEquals(6,result);

    }
    @Test
    public void lengthOfLongestSubstring3() {
        String ourString="mkphu";
        int result=testTask1.lengthOfLongestSubstring(ourString);
        assertEquals(5,result);

    }
}