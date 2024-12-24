import java.util.Scanner;
public class SalarioBonus {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		String nome;
		double venda, salario, comissao;
		
		nome = Scanner.next();
		salario = Scanner.nextDouble();
		venda = Scanner.nextDouble();
		
		comissao = (venda*15)/100;
		salario = comissao+salario;
		
		System.out.printf("TOTAL = R$ %.2f%n", salario);
		Scanner.close();

	}

}
