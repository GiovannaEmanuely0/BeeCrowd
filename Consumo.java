import java.util.Scanner;
public class Consumo {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		int km = Scanner.nextInt();
		double l = Scanner.nextDouble();
		
		double consumo = km/l;
		
		System.out.printf("%.3f km/l%n",consumo);
		
		Scanner.close();

	}

}
