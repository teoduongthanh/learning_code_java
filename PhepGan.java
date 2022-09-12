import java.util.Scanner;

public class PhepGan {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float a;
		System.out.println("nhâp gia trị");
		
		a = sc.nextFloat();
		System.out.println("a = " + a);
		// phép gán +=
		a+=3;
		System.out.println("a+=3 = " + a);		
		// phép gán -=
		a-=2;
		System.out.println("a-=2 = " + a);
		//Phép gán *=
		a*=4;
		System.out.println("a*4= = "+ a);
		//Phép gán /=
		a/=2;
		System.out.println("a/=2 = "+ a);
		//Phép gán %=
		a%=4;
		System.out.println("a%=4 = "+ a);
		
		
	}
}
