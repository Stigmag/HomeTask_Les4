package com.HomeTask_Les4;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public String Convert(String s, int numRow) {
        List<StringBuilder> text = new ArrayList<StringBuilder>();
        for (int index = 0; index < Math.min(s.length(), numRow); index++)

            text.add(new StringBuilder());
        int currentRow = 0;
        boolean isFull = false;
        for (char i : s.toCharArray()) {
            text.get(currentRow).append(i);
            if (currentRow == 0 || currentRow == numRow - 1)
                isFull = !isFull;
            if (isFull)
                currentRow += 1;
            else
                currentRow += -1;
        }
        StringBuilder out = new StringBuilder();
        for (StringBuilder row : text)
            out.append(row);

        return out.toString();
    }
}