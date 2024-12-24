import java.util.Scanner;
public class Media2 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		double a, b, c, media;
		double peso1 = 2, peso2 = 3, peso3 = 5, somaPeso;
		somaPeso = peso1+peso2+peso3;
		
		a = Scanner.nextDouble();
		b = Scanner.nextDouble();
		c = Scanner.nextDouble();
		
		media = (a*peso1+b*peso2+c*peso3)/somaPeso;
		
		System.out.printf("MEDIA = %.1f%n",media);
		Scanner.close();

	}

}
