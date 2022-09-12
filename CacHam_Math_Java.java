import java.util.Scanner;

public class CacHam_Math_Java {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a, b;
		System.out.println("Nhap values a = ");
		a = sc.nextFloat();
		System.out.println("Nhap values b = ");
		b = sc.nextFloat();
		// hàm tuyệt đối
		System.out.println("|a|" + Math.abs(a));
		// hàm cân bặc 2
		System.out.println("cân bậc 2 của a = " + Math.sqrt(a));
		// luy thừa a^b
		System.out.println("a ^ b = " + Math.pow(a, b));
		// ham ceil
		System.out.println("ceil a " + Math.ceil(a));
	}
}
