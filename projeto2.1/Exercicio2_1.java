import java.util.*;
public class Exercicio2_1 {

	public static void main(String[] args) {
		// 1 - variaveis
		byte idade;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.println("Digite a idade: ");
		idade = leia.nextByte();
		
		// 3 - calculos e saida de dados
		if (idade >= 18) {
			System.out.println("Voce eh maior de idade!");
		} else {
			System.out.println("Voce eh menor de idade");
		}

	}

}
