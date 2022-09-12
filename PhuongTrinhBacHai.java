import java.util.Scanner;

public class PhuongTrinhBacHai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * phuong trinh bac hai : ax^2 + bx + c =0 cac bien can co a,b,c,x1,x2, delta
		 * neu a == 0 thi bao loi. B1. delta = b^2 - 4ac b2. delta < 0 => Pt Trinh Vo
		 * nghiem b3. delta == 0 => PT Trinh Co nghiem kep. x1=x2=-b/2a b4. delta > 0 =>
		 * PT Trinh Co 2 nghie phan biet. x1 = (-b_sqrt(delta))/2a . x2 =
		 * (-b+sqrt(delta))/2a
		 * 
		 */
		double a, b, c, delta, x1,x2;
		System.out.println("nhap values a b c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		delta = (double)Math.pow(b, 2) - (4 * a * c);
		if (a != 0) {
			delta = (double)Math.pow(b, 2) - (4 * a * c);
			if (delta < 0) {
				System.out.println("PT vo nghiem");
			} else if (delta == 0) {
				x1= -b / (2 * a);
				System.out.println("PT trinh co nghiem kep: " + x1);
			} else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("PT trinh co 2 nghiem x1 = " + x1);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("PT trinh co 2 nghiem x2 = " + x2);
			}
		}else {
			System.out.println("PT trinh sai:");
		}
	}
}
