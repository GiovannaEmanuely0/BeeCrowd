import java.util.Scanner;
public class Media1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a, b, somaPeso, media, peso1=3.5, peso2=7.5;
		somaPeso = peso1+peso2;
		
		a = in.nextDouble();
		
		b = in.nextDouble();
		
		media = (a*peso1+b*peso2)/somaPeso;
		
		System.out.printf("MEDIA = %.5f%n",media);
		
		in.close();
		
	}

}
