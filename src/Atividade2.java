import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Digite o Valor a Pagar");
		int valor = imput.nextInt();
		System.out.println("Digite o percentual de Desconto");
		int desconto = imput.nextInt();
		float opera��o = (valor-(valor*desconto)/100);
		System.out.println("A porcentagem de desconto �: "+desconto+"%");
		System.out.println("O valor a pagar �: "+opera��o);
		imput.close();	
	}
}
