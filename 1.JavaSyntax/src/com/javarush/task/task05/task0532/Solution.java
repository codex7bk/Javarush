package com.javarush.task.task05.task0532;
import java.io.*;
import java.lang.*;
import java.util.*;
/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        if (n>0) {

            int[] arr = new int[n];

            for (int i = 0; i <= n-1; i++) {
            int d = Integer.parseInt(reader.readLine());
            arr[i] = d;
            }

            OptionalInt max = Arrays.stream(arr).max();

            System.out.println(max.getAsInt());
        }
    }
}
