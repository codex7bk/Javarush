package com.javarush.task.task05.task0507;
import java.io.*;
/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
          
        double sum = 0;
        int k = 0;
        while (true) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String d1 = bufferedReader.readLine();
        int dd1 = Integer.parseInt(d1);
        
            if (dd1 == -1) break;
            else
            {
                k++;
                sum = (sum + dd1);
            }
        }

        System.out.print(sum /k);
    }
}

