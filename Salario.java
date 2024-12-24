import java.util.*;
public class Salario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, h;
		double salario, vh;  
		
		a = in.nextInt();
		h = in.nextInt();
		vh = in.nextDouble();
		
		salario = h*vh;
		
		System.out.println("NUMBER = "+a);
		System.out.printf("SALARY = U$ %.2f",salario);
		
		in.close();
	}

}
