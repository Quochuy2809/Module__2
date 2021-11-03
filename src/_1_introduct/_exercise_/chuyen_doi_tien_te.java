package _1_introduct._exercise_;
import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền cần đổi: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("số tiề quy đổi là:" +quydoi);
    }
}
