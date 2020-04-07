package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
       String b="";
        if (month >= 1 && month <= 2 || month == 12) { b = "зима";
        }   else if (month >= 3 && month <= 5) { b = "весна";
            }   else if (month >= 6 && month <= 8) { b = "лето";
                }  else if (month >= 9 && month <= 11) { b = "осень";
            } 
         System.out.println(b);
    }
}