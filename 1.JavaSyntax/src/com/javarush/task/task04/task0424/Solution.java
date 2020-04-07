package com.javarush.task.task04.task0424;
import java.io.*;
import java.nio.file.Files;
/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine()); 
    int b = Integer.parseInt(reader.readLine()); 
    int c = Integer.parseInt(reader.readLine());
    
    if (a == b){
            System.out.println("3");
        } else if (b == c) {
            System.out.println("1");
        } else if (a == c) {
            System.out.println("2");
        }

    }
}
