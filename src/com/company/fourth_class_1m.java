package com.company;

import java.util.Scanner;

public class fourth_class_1m {
    public static void main(String[] args) {
        int budget = 700;
        switch (budget){
            case 300:
                System.out.println("Tursiaga Baram");
                break;
            case 700:
                System.out.println("Egipetke baram");
                break;
            case 1000:
                System.out.println("Fransiaga baram");
                break; //break колдонбосо кийинки case озу эле жазылып кетет
            default:
                System.out.println("Uido oturam");
        }
//        int age =  19;
//        String  sellOrNot = age >=18 ? "Satylat":"Stylbait";
//        System.out.println(sellOrNot);
//        int zarplata = 300;
//        String workOrNot = zarplata >=300 ? "Work":"No thank you";
//        System.out.println(workOrNot);


//        int time = 20;
//        String result =(time < 18)?"Good day.":"Good evening.";
//        System.out.println(result);


//        Scanner integers = new Scanner(System.in);
//        int int1 = integers.nextInt();
//        int int2 = integers.nextInt();
//        int int3 = integers.nextInt();
//        if (int1>int2 && int1>int3){
//            System.out.println(int1);
//        }
//        else if (int2>int1 && int2>int3){
//            System.out.println(int2);
//        }
//        else if (int3>int1 && int3 > int2){
//            System.out.println(int3);
//        }
//        else{
//            System.out.println("Equal digits");
//        }

//        int cholponbekageForArmia = 25;
//        if (cholponbekageForArmia >=18 && cholponbekageForArmia<=25){
//            System.out.println("Cholponbek baike kettik armiaga");
//        }
//        else{
//            System.out.println("Cholponbek baike sizdin jashynyz armiaga tuura kelbeit eken!");
//        }

//        Scanner integers = new Scanner(System.in);
//        int int1 = integers.nextInt();
//        int int2 = integers.nextInt();
//        int balance = 0;
//        int akcha = 12121;
//        int summa = 1500;
//
//        if (balance>=summa || akcha>=summa ) {
//            System.out.println("berilet");
//        }
//
//        else if ((balance+akcha)>=summa){
//            System.out.println("Yes please");
//        }
//        else {
//            System.out.println("No pain no gain");
//        }

    }
}
