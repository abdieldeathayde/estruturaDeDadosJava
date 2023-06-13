package estruturaDeDadosJava;

public class BuscaBinaria {
	public static void main(String[] args) {
		int[] array = {9,4,5,6,7,8};
		System.out.println("Array antes da ordenação");
		printArray(array);
		bubbleSort(array);
		System.out.println("Array ordenado");
		printArray(array);
	}
	
	public static void bubbleSort(int[] array) {
		int number = array.length;
		
		
		for (int i = 0; i < number - 1; i++) {
			boolean ordenou = false;
			for (int j = 0; j < number - 1; j++) {
				if (array[j] > array[j+1]) {
					int flag = array[j];
					array[j] = array[j + 1];
					array[j+1] = flag;
					ordenou = true;
				}
				if (!ordenou) {
					break;
				}
			}
		}
	}
	
	public static void printArray(int[] array) {
		boolean trocou = false;
		
		for (int i = 0; i < array.length; i ++) { 
			System.out.println(array[i]);
		}
	}

}
