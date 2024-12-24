import java.util.Scanner;
public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		int dia = Scanner.nextInt();
	
		int	ano = dia/365;
		int	resto = dia%365;
		int	mes = resto/30;
		int	dias = resto%30;
			
			System.out.println(ano+" ano(s)");
			System.out.println(mes+" mes(es)");
			System.out.println(dias+" dia(s)");
	
		Scanner.close();
	}

}
