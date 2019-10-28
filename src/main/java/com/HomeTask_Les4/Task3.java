package com.HomeTask_Les4;

import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public int maxArea(int[] height) {

        ArrayList<Integer> test = new ArrayList<Integer>();
        for(int index=0;index<height.length;index++)
        {
            for(int j =index+1;j<height.length;j++)
            { if(height[index]>height[j])
                test.add((j-index)*height[j]);
            else test.add((j-index)*height[index]);}

        }
        Integer i= Collections.max(test);

        return i;
    }
}
