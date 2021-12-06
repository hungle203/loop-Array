package Thuchanh;

import java.util.Scanner;

public class LaiSuat {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double money;
       int month;
       double laiSuat;
        System.out.println("Nhập số tiền muốn gửi");
        money = input.nextDouble();
        System.out.println("Nhập số tháng muốn gửi");
        month = input.nextInt();
        System.out.println("Nhập lãi suất");
        laiSuat = input.nextDouble();
        double laiSuatNhan = 0;
        for (int i = 0; i < month; i++) {
            laiSuatNhan += money * (laiSuat/100)/2 * month;
        }
        System.out.println("Lãi suất của bạn là" + laiSuatNhan);
    }
}
