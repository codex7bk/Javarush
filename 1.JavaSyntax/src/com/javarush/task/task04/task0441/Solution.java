package com.javarush.task.task04.task0441;
import java.io.*;
import java.util.Arrays;
/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String d1 = bufferedReader.readLine();
        int dd1 = Integer.parseInt(d1);
        String d2 = bufferedReader.readLine();
        int dd2 = Integer.parseInt(d2);
        String d3 = bufferedReader.readLine();
        int dd3 = Integer.parseInt(d3);

       int[] arr = {dd1, dd2, dd3};
        

        for (int i = 0; i < arr.length; i++ ) {
        int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
        
            int tmp;
            tmp = arr[i];
            arr[i]=arr[min];
            arr[min]=tmp;
        }    

       System.out.print(arr[1]); 
        

    }
}
