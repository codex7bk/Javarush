package com.javarush.task.task04.task0429;
import java.io.*;
/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int d1 = Integer.parseInt(bufferedReader.readLine());
        int d2 = Integer.parseInt(bufferedReader.readLine());
        int d3 = Integer.parseInt(bufferedReader.readLine());
        int pol=0, otr=0;
        if (d1>0) {pol++;} else if (d1<0) {otr++;}
        if (d2 > 0) {pol++;} else if (d2<0) {otr++;}
        if (d3 > 0) {pol++;} else if (d3<0) {otr++;}
   
   System.out.println("количество отрицательных чисел: " + otr);
   System.out.println("количество положительных чисел: " + pol);
    }
}
