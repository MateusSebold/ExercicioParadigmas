
public class Atividade3 {
	public static void main(String[] args) {
	
	int[] array={11,12,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,1,2,3,4,5,6,7,8,9,10,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,816,87,8856,829,970,901,892,93,2294,95,96,97,9821,995,10013,14,15,16,17,18,19,20,21};
	int maior=0;
	int menor=0;
	for (int i=0; i<array.length;i++) {
		if(i==0) {
			 menor = array[i]; 
			 maior = array[i];
		}
		else if(array[i]>maior) {
			maior=array[i];
		}
		else if(array[i]<menor) {
			menor=array[i];
		}
	}
	System.out.println("O maior é: "+maior);
	System.out.println("O menor é: "+menor);
}
}