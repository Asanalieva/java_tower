package com.company;

public class sixth_hw {
    public static void main(String[]args){
        int num = 4;      //Бул жактан кайсы сандын факториалы керек болсо, ошону жазыңыз
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
