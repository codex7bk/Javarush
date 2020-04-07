package com.javarush.task.task04.task0412;
import java.io.*;

/*
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
  InputStream inputStream = System.in;
       Reader inputStreamReader = new InputStreamReader(inputStream);
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b= 0;
        b = Integer.parseInt(reader.readLine());
        if (b>0) {b = b*2;
        }   else if (b<0) {b = b + 1;
            }
                System.out.println(b);
        
    }

}