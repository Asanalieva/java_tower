package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
//
public class nineth_class {
    public static void main(String[] args) {
        System.out.println(method(10));
//        System.out.println(main2(new int[]{235,0,312}));
//    }
//    static int main2(int[] a){
//        Arrays.sort(a);
//        for (int i : a){
//            System.out.println(i);
//        }
//}}


//}
//    public static void main(String[] args) {
//        System.out.println(method(4,7,9));
//    }
//    static  double method(int a,int b, int c){
//        return (a+b+c)/3d; //d болгондо точкадан кийинки сандар чыгат
//    }


//
//        System.out.println(method(4));
    }

    static int method(int a) {
        int esep = 0;
        for (int i = 0; i <= a; i++) {
            esep += i;

        }
        return esep;
    }
}
