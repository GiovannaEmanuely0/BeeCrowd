import java.util.Scanner;
public class OMaior {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		int a,b,c,maior;
		
		a = Scanner.nextInt();
		b = Scanner.nextInt();
		c = Scanner.nextInt();
		
		maior = (a+b+Math.abs(a-b))/2;
		
		if(maior>c) {
			System.out.println(maior+" eh o maior");
		}else {
			System.out.println(c+" eh o maior");
		}
		Scanner.close();
	}

}
