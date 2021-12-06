package Thuchanh;

import java.util.Scanner;

public class UocChung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("số đó không phải là ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b ) {
                a = a - b;
            }
            else {
                b = b - a;
            }

        }
        System.out.println("Ước chung lớn nhất là " + a);
    }
}
