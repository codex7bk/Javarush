package com.javarush.task.task04.task0426;
import java.io.*;
/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int d1 = Integer.parseInt(bufferedReader.readLine());
        
        if (d1 < 0 && d1%2 == 0) {
        System.out.println("отрицательное четное число");
        } else if (d1 < 0 && d1%2 != 0) {
        System.out.println("отрицательное нечетное число");
        } else if (d1 == 0) {
        System.out.println("ноль");
        } else if (d1 > 0 && d1%2 == 0) {
        System.out.println("положительное четное число");
        } else if (d1 > 0 && d1%2 != 0) {
        System.out.println("положительное нечетное число");
        }
        
    }
}
