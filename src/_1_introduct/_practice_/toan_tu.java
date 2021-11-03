package _1_introduct._practice_;

import java.util.Scanner;

public class toan_tu {
    public static void main(String[] args) {
        float width ;
        float height;

        //Khai báo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter width: ");
        //Nhập chiều rộng
        width = scanner.nextFloat();

        System.out.println("Enter height");
        //Nhập chiều dài
        height = scanner.nextFloat();
        //tính toán
        float area = width * height;

        System.out.println("Area :"+ area);
    }
}
