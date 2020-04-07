package com.javarush.task.task04.task0427;
import java.io.*;
/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int d1 = Integer.parseInt(bufferedReader.readLine());
        
        if (d1 <= 999 && d1 >= 100 && d1%2 == 0) {
        System.out.println("четное трехзначное число");
        } else if (d1 <= 999 && d1 >= 100 && d1%2 != 0) {
        System.out.println("нечетное трехзначное число");
        } else if (d1 < 100 && d1 >= 10 && d1%2 == 0) {
        System.out.println("четное двузначное число");
        } else if (d1 < 100 && d1 >= 10 && d1%2 != 0) {
        System.out.println("нечетное двузначное число");
        } else if (d1 < 10 && d1 >0 && d1%2 == 0) {
        System.out.println("четное однозначное число");
        } else if (d1 <10 && d1>0 && d1%2 != 0) {
        System.out.println("нечетное однозначное число");
        }

    }
}
