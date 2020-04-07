package com.javarush.task.task04.task0413;
import java.io.*;
import java.nio.file.Files;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        String c = "";
        b = Integer.parseInt(reader.readLine());
       
        if (b == 1) {c = "понедельник";
        }   else if (b == 2) {c = "вторник";
            }   else if (b == 3) {c = "среда";
                }   else if (b == 4) {c = "четверг";
                    }   else if (b == 5) {c = "пятница";
                        }   else if (b == 6) {c = "суббота";
                            }   else if (b == 7) {c= "воскресенье";
                                } else c = "такого дня недели не существует";
                System.out.println(c);

    }
}