package com.javarush.task.task04.task0418;
import java.io.*;
import java.nio.file.Files;

/* 
Минимум двух чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine()); 
    int b = Integer.parseInt(reader.readLine());

        System.out.println(Math.min(a, b));
    
        
    }
}