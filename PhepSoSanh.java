import java.util.Scanner;

public class PhepSoSanh {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b;
	System.out.println("Nhap gia tri: a vs b");
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("So sanh bang: " + (a==b));
	System.out.println("So sanh lon be: "+ (a >= b));

	System.out.println("So sanh lon be: "+ (a <= b));
	System.out.println("Ca hai so la so chan: "+ (a%2==0 && b%2==0));
	System.out.println("Co it nhat 1 so chan: "+ (a%2==0 || b%2==0));
}
}
