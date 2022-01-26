package com.company;

public class eighth_hw {
    public static void main(String[] args) {
        mainMin();
        mainMax();
    }

    static void mainMax() {
        int[] array = {1, 8, 3, 3, 4, 4, 9, 12};
        int max = array[0];
        for (int i =1; i<array.length;i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.print("Максимальный элемент: ");
        System.out.println(max);
    }

    static void mainMin () {
        int[] array = {1, 8, 3, 3, 4, 4, 9, 12};
        int min = array[0];
        for (int i = 1; i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.print("Минимальный элемент: ");
        System.out.println(min);
    }


}
