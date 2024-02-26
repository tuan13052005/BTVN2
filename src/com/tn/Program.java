package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu nguyen: ");
        int n = sc.nextInt();

        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i+1) + ": ");
            Array[i] = sc.nextInt();
        }

        Student student = new Student();
        student.Bai1(Array, n);

        System.out.println();
        student.Bai2(Array, n);

        student.Bai3(Array, n);

        System.out.println();
        student.Bai4(Array, n);
    }
}
