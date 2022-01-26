package com.company;

import java.util.Scanner;

public class toSendCodeDraft {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        int a = integer.nextInt();
        switch (a){
            case(1):
                System.out.println("Java");
                break;
            case(2):
                System.out.println("Практика жана soft skills");
                break;
            case(3):
                System.out.println("Java");
                break;
            case(4):
                System.out.println("Практика жана English");
                break;
            case(5):
                System.out.println("Event жана Java");
                break;
            default:
                System.out.println("Сабак жок");
        }
///if else менен чыгардым
       //int a = integer.nextInt();
       if (a==1){
           System.out.println("Java");
       }
       else if (a ==2){
           System.out.println("Практика жана soft skills");
       } else if (a ==3){
           System.out.println("Java");
       } else if (a ==4){
           System.out.println("Практика жана English");
       }
        else if (a ==5){
           System.out.println("Event жана Java");
       }
        else {
           System.out.println("Сабак жок");
       }

    }
}
