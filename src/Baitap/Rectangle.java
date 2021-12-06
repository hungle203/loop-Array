package Baitap;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Vẽ hình vuông");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j ++) {
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
        System.out.println("Vẽ hình tam giác vuông");
             for (int i = 1; i <= 5; i ++) {
                 for (int j = 1; j < i; j ++) {
                     System.out.print(" *");
                 }
                 System.out.println(" *");
             }
        System.out.println("Vẽ hình tam giác vuông 2");
              for (int i = 1; i <= 6; i ++) {
                  for (int j = 5; j >= i; j --) {
                      System.out.print(" *");
                  }
                  System.out.println(" *");
              }
    }
}
