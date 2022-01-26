package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class eighth_class_1 {
    //sorting
    public static void main(String[] args) {
        main2(90,55,2);
    }

    static void main2(int y,int u, int t) {
      int[] r = {y,u,t};
      Arrays.sort(r);
      for(int i : r){
          System.out.println(i);
      }
    }

}











// public static void main(String[] args) {
//        mtable();
//    }
//
//    static void mtable() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Кайсы сандын таблицасы керек? ");
//        int a = scanner.nextInt();
//        for (int i = 1; i <= 10; ++i) {
//            System.out.printf("%d * %d = %d\n", a, i, a * i);
//        }
//    }


/*
//методго массив берип,терминалга чыгруу
    public static void main(String[] args) {
       method(new int[]{31,33,56,631});
    }
    static void method(int[] intarray){
        for(int i : intarray) {
            System.out.println(i);
        }
    }
 */


    //Орточо арифметикалык сан
//    public static void main(String[] args) {
//        main2(2,4);
//    }
//    static void main2(int q, int w){
//        System.out.println((q+w)/2);
//    }



//    public static void main(String[] args) {
//        main2(19);
//    }
//
//    static void main2(int t) {
//        for (int i = 0; i < t; i++) {
//            System.out.print(" * ");
//        }
//    }

