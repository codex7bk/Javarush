package com.javarush.task.task04.task0416;
import java.io.*;
import java.nio.file.Files;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {

    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    double t = Double.parseDouble(reader.readLine());
    double t2 = t%5;
    if (t2 >=0 && t2 < 3) {
        System.out.println("зелёный");
    }   else if (t2 >=3 && t2 < 4) {
        System.out.println("жёлтый");
        } else { System.out.println("красный");
            
        }
    
    

    }
}