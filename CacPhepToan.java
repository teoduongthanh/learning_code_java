import java.util.Scanner;

public class CacPhepToan {
	public static void main(String[] args) {
		int a ,b;
		//nhap values a vs b
		System.out.println(" nhap values a vs b");	
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int tong = a + b;
		System.out.println("tong cua a va b= " + tong);
		int hieu = a - b;
		System.out.println("hieu cua a va b= " + hieu);
		int nhan = a * b;
		System.out.println("nhan cua a va b= " + nhan);
		float thuong = a / b;
		System.out.println("thuong cua a va b= " + thuong);
		int soDu = a % b;
		System.out.println("so du cua phep tinh = " + soDu);
	}
	
}
