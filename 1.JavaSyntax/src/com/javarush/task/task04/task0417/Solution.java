package com.javarush.task.task04.task0417;
import java.io.*;
import java.nio.file.Files;
/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());
 
 if (a == b && a == c) {
     System.out.println(b + " " + b + " " + b);
    }   else if (b == c) {
        System.out.println(b + " " + b);
        } else if (a == b || a == c) {
           System.out.println(a + " " + a); 
        }

    }
}