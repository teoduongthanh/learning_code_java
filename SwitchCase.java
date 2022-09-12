import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("nhap ngay ");
		n = sc.nextInt();
		switch (n) {
		case 2: {
			System.out.println("ngay thu 2");
			break;
		}case 3: {
			System.out.println("ngay thu 3");break;
		}case 4: {
			System.out.println("ngay thu 4");break;
		}case 5: {
			System.out.println("ngay thu 5");break;
		}case 6: {
			System.out.println("ngay thu 6");break;
		}case 7: {
			System.out.println("ngay thu 7");break;
		}case 8: {
			System.out.println("ngay thu 8");break;
		}
		default:
			System.out.println("nhap sai du lieu");
		}
	}
}
