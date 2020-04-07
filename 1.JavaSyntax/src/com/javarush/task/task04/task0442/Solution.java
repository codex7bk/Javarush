package com.javarush.task.task04.task0442;
import java.io.*;
/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        int sum = 0;
        while (true) {
            InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String d1 = bufferedReader.readLine();
        int dd1 = Integer.parseInt(d1);
        if (dd1 == -1) {
        break;
        } else {sum = sum + dd1;}
        }
          System.out.print(sum-1); 

    }
}
