package com.example;

public class Methods {
    public static int[] leastOfPairs(int[] array1, int[] array2)
    {
        int[] array3=new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]<array2[i])
            {
                array3[i]=array1[i];
            }
            else
            {
                array3[i]=array2[i];
            }
        }
        return array3;
    }
    public boolean isSingleWord(String word)
    {
        return !word.trim().contains(" ");
    }

}
