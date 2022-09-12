import java.util.Scanner;

public class PhuongTinh_ax_cong_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			/*PTBN: ax+b=0
			 neu a = 0;
			 		neu b = 0 => Pt vo so nghiem
			 		neu b!= 0 => PT vo nghiem
			 neu a != 0
			 	co nghiem x = -b/a
			 */
		int a, b, x;
		System.out.println("nhap Values a b:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a == 0){
			if(b==0) {
				System.out.println("PT vo so nghiem");
			}else {
				System.out.println("PT vo nghiem");
			}
		}else{
			x = (-b)/a;
			System.out.println("PT co nghiem la: " + x);
	
		}
		
	}
}
