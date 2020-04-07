package com.javarush.task.task04.task0436;
import java.io.*;
/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

       
        String d1 = bufferedReader.readLine();
          String d2 = bufferedReader.readLine();
        int d3 = Integer.parseInt(d1);
        int d4 = Integer.parseInt(d2);
        for (int i = 1; i <= d3; i++) {
            for (int k = 1; k <= d4; k++) {
                System.out.print(8);
            }
            System.out.println();
        }
        

    }
}
