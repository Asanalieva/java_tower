package com.company;

import java.util.Scanner;

public class practice_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for(int i = 0; i<=input;i++) {
            for (int k = input; k >= i; k--) {
                if (i == k) {
                    System.out.print(" ");}
            }
        }
        System.out.println("@#");
        for (int i = 1; i < input; i++) {
            for (int k = input; k >= i; k--) {
                System.out.print(" ");
                if (i == k) {
                    System.out.print(" ");
                    }
                }
            System.out.println("#");
        }
    }
}
