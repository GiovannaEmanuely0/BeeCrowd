import java.util.Scanner;
public class FormulaDeBhaskara {

	public static void main(String[] args) {
		Scanner Lendo = new Scanner(System.in);
		
		double a ,b , c, delta, r1, r2;
		
		a = Lendo.nextDouble();
		b = Lendo.nextDouble();
		c = Lendo.nextDouble();

		delta = (b*b)-4*a*c;
		
		if(delta < 0 || a == 0) {
			System.out.println("Impossivel calcular");
		}else if(delta == 0) {
			r1 = (-b+Math.sqrt(delta))/(2*a);
			r2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.printf("R1 = %.5f%n",r1);
			System.out.printf("R1 = %.5f%n",r2);
			//r1 = (-b)/(2*a);
			//System.out.println(r1);
			
		}else {
			r1 = (-b+Math.sqrt(delta))/(2*a);
			r2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.printf("R1 = %.5f%n",r1);
			System.out.printf("R1 = %.5f%n",r2);
		}
		
		Lendo.close();
	}

}
