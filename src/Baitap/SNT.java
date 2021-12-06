package Baitap;

import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố");
        int num = scanner.nextInt();
        int count = 0;
        int number = 2;
       while (count < num) {
           boolean check = true;
           for (int i = 2; i<= Math.sqrt(number); i++) {
               if (number % i == 0) {
                   check = false;
                   break;
               }
           }
           if (check) {
               count ++;
               System.out.println(number);

           }
           number ++;
       }

    }
}
