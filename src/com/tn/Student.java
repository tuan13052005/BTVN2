package com.tn;

import java.sql.Array;

public class Student {
    public void Bai1(int[] Array, int n) {
        System.out.print("Mang " + n + " so nguyen la:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + Array[i]);
        }
    }

    public void Bai2(int[] Array, int n) {
        int min = Array[0];
        int max = Array[0];
        for (int i = 1; i < n; i++) {
            if (min > Array[i])
                min = Array[i];
            if (max < Array[i])
                max = Array[i];
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    public void Bai3(int[] Array, int n) {
        int[] T = new int[n];
        int t = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 2; j < Array[i]; j++) {
                if (Array[i] % j == 0) {
                    temp++;
                }
            }
            if (temp == 0) {
                T[t] = Array[i];
                t++;
            }
        }
        System.out.print("Cac so nguyen to la:");
        for (int i = 0; i < t; i++) {
            System.out.print(" " + T[i]);
        }
    }

    public void Bai4(int[] Array, int n) {
        System.out.print("Sap xep mang theo thu tu tang dan:");
        for (int i = 0; i < (n-1); i++) {
            for (int j = 0; j < (n-i-1); j++) {
                if (Array[j] > Array[j+1]){
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + Array[i]);
        }
    }

}
