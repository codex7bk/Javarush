package com.javarush.task.task04.task0420;
import java.io.*;
import java.nio.file.Files;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine()); 
    int b = Integer.parseInt(reader.readLine()); 
    int c = Integer.parseInt(reader.readLine());
    int max1, max2, max3;
    max1 = Math.max(Math.max(a,b),c);
    if (max1 == a) 
    {System.out.println(max1 + " " + Math.max(b,c) + " " + Math.min(b,c));}
    else if (max1 == b) 
    {System.out.println(max1 + " " + Math.max(a,c) + " " + Math.min(a,c));}
    else {System.out.println(max1 + " " + Math.max(a,b) + " " + Math.min(a,b));}

    }
}
