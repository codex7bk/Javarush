package com.javarush.task.task04.task0419;
import java.io.*;
import java.nio.file.Files;
/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine()); 
    int b = Integer.parseInt(reader.readLine()); 
    int c = Integer.parseInt(reader.readLine());
    int d = Integer.parseInt(reader.readLine()); 
    
    int max = Math.max(Math.max(Math.max(a,b),c),d);
System.out.println(max);
    }
}
