package exercise_java_ChuViVSDienTich_HinhTron;

import java.util.Scanner;

public class ChuVI_DienTich_HinhTron {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R;
		System.out.println("nhập bán kính hình chữ nhật: ");
		R = sc.nextInt();
		
		float ChuVi = (float) ((R * 2) * Math.PI);
		System.out.println("Chu vi Hình Tròn " + ChuVi);
		
		float DienTich = (float) (Math.pow(R,2) * Math.PI);
		System.out.println("Dien Tich Hình Tròn " + DienTich);
	}
}
