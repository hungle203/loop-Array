package Baitap;

public class SoChiaHetChoBay {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 7 nhỏ hơn 200");
        for (int i = 0; i<= 200; i ++ ) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
