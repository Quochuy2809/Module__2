package _3_mang_and_phuong_thuc.thuchanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        //    Bước 4: Khai báo mảng chứa danh sách sinh viên
        String[] students = {"Nga","Huy","Tu"};

//    Bước 5: Khai báo biến lưu tên tìm kiếm và  gán với giá trị nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của học sinh: ");
        String input_name = scanner.nextLine();

//        Bước 6: Duyệt mảng sinh viên đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào

        boolean isExist = false;
        for (int i = 0;i <students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
            }
        };
