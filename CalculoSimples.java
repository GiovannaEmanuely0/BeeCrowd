import java.util.Scanner;
public class CalculoSimples {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		double total=0, c; 
		
		final int TAM = 2;
		int cod[] = new int [TAM];
		int un[] = new int [TAM];
		double valor[] = new double [TAM];
		
		for(int i=0;i<TAM;i++) {
			cod[i] = Scanner.nextInt();
			un[i] = Scanner.nextInt();
			valor[i] = Scanner.nextDouble();
			c = valor[i]*un[i];
			total = total+c;
		}
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
		
		Scanner.close();

	}

}
