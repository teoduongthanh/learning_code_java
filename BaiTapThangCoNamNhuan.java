import java.util.Scanner;

public class BaiTapThangCoNamNhuan {
	public static void main(String[] args) {
		int n, years;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap thang ");
		n = sc.nextInt();
		System.out.println("nhap nam ");
		years = sc.nextInt();
		switch (n) {
		case 2: {
			if (years % 4 == 0) {
				System.out.println("thang " + n + " " + years + " co 29 ngay");
			} else {
				System.out.println("thang " + n + " " + years + " co 28 ngay");
			}
			break;
		}
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
			System.out.println("tháng " + n + " " + years + "co 31 ngay");
			break;
		}
		
		case 4:
		case 6:
		case 9:
		case 11:{
			System.out.println("thang " + n + " " + years + " co 30 ngay");break;
		}
		
		default:
			System.out.println("nhap du lieu sai");
			break;
		}
	}
}
