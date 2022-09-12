import java.util.Scanner;

public class NhapDuLieu {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("nhap gia tri a:");
		String hoVaTen = scaner.nextLine();
		
		System.out.println("nhap diem: ");
		float diem = scaner.nextFloat();
		
		System.out.println("diem thi: " + diem);	
	}
}
