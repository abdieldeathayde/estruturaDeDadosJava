package estruturaDeDadosJava;

import java.util.ArrayList;
import java.util.List;

/**
 * Implemente uma pilha (stack) em Java 
 * e escreva um método que determine se ela está vazia ou não. Status: doing
 * 
 * @author abdiel
 *
 */

public class Exercicio1 {
	public static void main(String[] args) {
		List<Integer> arrayInteiros = new ArrayList<Integer>(); 
		
		arrayInteiros.add(5);
		arrayInteiros.add(7);
		arrayInteiros.add(4);
		arrayInteiros.add(10);
		
		estaVazioOuNao(arrayInteiros);
		
		arrayInteiros.remove(0);
		
		arrayInteiros.clear();
		estaVazioOuNao(arrayInteiros);
	}

	public static void estaVazioOuNao(List<Integer> arrayInt) {
		boolean isEmpytOrNot;
		isEmpytOrNot = arrayInt.isEmpty();
		if (isEmpytOrNot == true) System.out.println("Está Vazio");
		else System.out.println("Não está vazio");
		
		
	}

}
