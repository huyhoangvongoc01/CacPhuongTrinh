package PhuongTrinhBac1;
import java.util.Scanner;
import java.lang.Math;

public class Bac1 {
	public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        float x;

        System.out.println("Nhap vao a = ");
        int a = scanner.nextInt();//1 2 3 14

        System.out.println("Nhap vao b = ");
        int b = scanner.nextInt();

        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                System.out.println("Phương trình có vô số nghiệm");
            }
        }else{
            x = -b / (float)a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
}