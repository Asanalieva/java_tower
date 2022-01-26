package com.company;

public class nineth_hw {
    public static void main(String[] args) {
        System.out.println(main2());
    }
    static int main2() {
        int a = 300;
        int esep = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                esep+=i;
            }
        }
        return esep;
    }
}