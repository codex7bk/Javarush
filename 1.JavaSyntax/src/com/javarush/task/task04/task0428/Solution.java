package com.javarush.task.task04.task0428;
import java.io.*;
/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
     InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int d1 = Integer.parseInt(bufferedReader.readLine());
        int d2 = Integer.parseInt(bufferedReader.readLine());
        int d3 = Integer.parseInt(bufferedReader.readLine());
        int sum=0;
        if (d1>0) {sum++;}
        if (d2>0) {sum++;}
        if (d3>0) {sum++;}
           System.out.println(sum);
     
        

    }
}
