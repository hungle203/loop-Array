package Thuchanh;

import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("Không phải số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i < Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i ++;
            }
            if (check) {
                System.out.println("Đây là số nguyên tố");
            }
            else {
                System.out.println("Đây không phải số nguyên tố");
            }
        }
    }
}
