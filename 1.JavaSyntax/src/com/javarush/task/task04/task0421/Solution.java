package com.javarush.task.task04.task0421;
import java.io.*;
import java.nio.file.Files;
/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String a = reader.readLine();
    String b = reader.readLine();
    int len1 = a.length();
    int len2 = b.length();
    
        if (a.equals(b)) {
            System.out.println("Имена идентичны");
        } else if (len1 == len2) {
            System.out.println("Длины имен равны");
        }
    
        
    }
}
