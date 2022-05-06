import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Digite o Valor a Pagar");
		int valor = imput.nextInt();
		System.out.println("Digite o percentual de Desconto");
		int desconto = imput.nextInt();
		float operação = (valor-(valor*desconto)/100);
		System.out.println("A porcentagem de desconto é: "+desconto+"%");
		System.out.println("O valor a pagar é: "+operação);
		imput.close();	
	}
}
