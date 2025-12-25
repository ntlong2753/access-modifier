package HinhTron;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        double r;
        do {
            System.out.print("Nhập bán kính = ");
            r = input.nextDouble();
            circle.setRadius(r);
            if(r <= 0) {
                System.out.println("Bán kính không hợp lệ, vui lòng nhập lại!");
            }
        }while (r <= 0);
        circle.display();
    }
}
