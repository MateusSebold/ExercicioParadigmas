import java.util.Scanner;
public class Atividade1 {
	public static void main(String[] args) {
	Scanner imput = new Scanner(System.in);
	
	System.out.println("Digite um Numero");
	int numero1 = imput.nextInt();
	System.out.println("Digite outro Numero");
	int numero2 = imput.nextInt();
	System.out.println("A soma dos numeros é = "+(numero1+numero2));
	imput.close();
	

}
}
