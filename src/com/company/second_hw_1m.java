package com.company;
import java.util.Scanner;
public class second_hw_1m {
    public static void main(String[] args){

        Scanner firstDigit = new Scanner(System.in);

        int a = firstDigit.nextInt();

        Scanner secondDigit = new Scanner(System.in);

        int b = secondDigit.nextInt();

        Scanner thirdDigit = new Scanner(System.in);

        int c = thirdDigit.nextInt();
        int result1 = a+b+c;
        int result2 = a*b*c;
        double result3 = (a+b+c)/3.0;

        System.out.printf("%d %s %d %s %d %s %d\n",a,"+",b,"+",c,"=",result1);
        System.out.printf("%d %s %d %s %d %s %d\n",a,"*",b,"*",c,"=",result2);
        System.out.printf("%s %d %s %d %s %d %s %s %s %s %.10f\n","(",a,"+",b,"+",c,")","/","3","=",result3);

//           int a = 4;
//           int b = 5;
//
//           System.out.println(a+b); homework from pesentation
    }
}
/*public class Main {
  public static void main(String args[]) {
    int firstName = 4;
    int lastName = 4;
    System.out.println(firstName + " + " + lastName + " = " + (firstName + lastName));
  }
}
*/