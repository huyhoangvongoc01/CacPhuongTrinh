package PhuongTrinhBac2;
import java.util.Scanner;
import java.lang.Math;

public class Bac2 {
	public static void main(String[] args) {
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao a = ");
		a = sc.nextDouble();
		System.out.println("Nhap vao b = ");
		b = sc.nextDouble();
		System.out.println("Nhap vao c = ");
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) {
			System.out.println("Nhập dữ liệu sai!");} 
		else {
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm!");
			} else if (delta == 0) {
				x1 = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x1=x2=" + x1);
			} else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có nghiệm");
				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
			}
		}
	}

}
