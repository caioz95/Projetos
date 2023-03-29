package projeto;

import java.util.Random;

import java.util.Scanner;

public class AdivinheONumero {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Random random = new Random();

		int palpite,

				sorteado,

				tentativas = 2;
		sorteado = random.nextInt(100) + 1;
		try {
			System.out.println("************************");

			System.out.println("************************");

			System.out.println("***** Jogo da Sorte ****");

			System.out.println("************************");

			System.out.println("************************");

			System.out.println("");

			System.out.println("");

			System.out.println("Regras: você terá 3 tentativas, e para cada uma daremos dicas. Então, se prepare!");

			System.out.println("");

			System.out.println("Os números sorteados serão de 1 até 100.");

			System.out.println("");

			System.out.print("Digite o seu palpite: ");

			palpite = scan.nextInt();

			while (tentativas > 0 || palpite == sorteado) {

				if (palpite == sorteado) {

					System.out.println("\nParabéns você ACERTOU na sua " + (3 - tentativas) + "/3 tentativas.");

					break;

				} else if (sorteado < 50 && palpite > 50) {

					System.out.println(" Seu palpite é maior que o número sorteado \n");

					System.out.println(
							"\"Dica: O número é menor do que 50.\" Mas você tem apenas " + tentativas + " Chances.");

					System.out.print("Digite o seu palpite novamente: ");

					palpite = scan.nextInt();

				} else if (sorteado > 50 && palpite < 50) {

					System.out.println("Seu palpite é menor que o número sorteado.\n");

					System.out.println(
							"Dica: O número é maior do que 50. Mas você tem apenas " + tentativas + " Chances.");

					System.out.print("Digite o seu palpite novamente: ");

					palpite = scan.nextInt();
				} else if (palpite == (sorteado - 1) || palpite == (sorteado + 1)) {

					System.out.println(
							"Dica: Quuuaaaaase!!!.. Não acertou por um número... à mais ou a menos? \n Lembresse tem apenas "
									+ tentativas + " Chances. \n");

					System.out.print("Digite o seu palpite novamente: ");

					palpite = scan.nextInt();

				} else if (sorteado < 20 && sorteado > 10) {
					// De 10 ao 20 \/

					System.out.println("Dica: O número é maior do que 10 e menor do que 20. Mas você tem apenas "
							+ tentativas + " Chances.\n");

					System.out.print("\nDigite o seu palpite novamente: ");

					palpite = scan.nextInt();

				} else if (sorteado < 60 && sorteado > 49) {
					// Do 60 ao 50

					System.out.println("\nDica: O numero é maior do que 50 e menor do que 60. Mas você tem apenas "
							+ tentativas + " chances. \n");

					System.out.print("Digite o seu palpite novamente: ");

					palpite = scan.nextInt();

				} else if (sorteado < 100 && sorteado > 90) {
					// Do 100 ao 90

					System.out.println("\nDica: O número é maior do que 90 e menor do que 100. Mas você tem apenas "
							+ tentativas + " Chances.\n");

					System.out.print("Digite o seu palpite novamente: ");

					palpite = scan.nextInt();

				} else if (sorteado < 89 && sorteado > 62) {
					// Do 89 ao 61

					System.out.println("\nDica: O número é maior do que 61 e menor do que 90. Mas você tem apenas "
							+ tentativas + " Chances.\n");

					System.out.print("Digite o seu palpite novamente: ");

					palpite = scan.nextInt();

				} else if (sorteado < 70 && sorteado > 62) {
					// Do 70 ao 62

					System.out.println("\nDica: O número é maior do que 61 e menor do que 70. Mas você tem apenas "
							+ tentativas + " Chances.\n");

					System.out.print("Digite o seu palpite novamente: ");

					palpite = scan.nextInt();

				} else if (sorteado >1 && sorteado < 10) {
					// Do 10 ao 1

					System.out.println("\nDica: O número é maior do que 1 e menor do que 10. Mas você tem apenas "
							+ tentativas + " Chances.\n");

					System.out.print("Digite o seu palpite novamente: ");

					palpite = scan.nextInt();
				} else if (sorteado < 41 && sorteado > 21) {
					// Do 41 ao 21;

					System.out.println("\nDica: O número é maior do que 20 e menor do que 40. Mas você tem apenas "
							+ tentativas + " Chances.\n");

					System.out.print("Digite o seu palpite novamente: ");

					palpite = scan.nextInt();

				} else {

					System.out.println("Você tem apenas " + tentativas + " Chances.");

					System.out.print("Digite o seu palpite novamente: ");

					palpite = scan.nextInt();

				}

				tentativas--;

				if (tentativas == 0 && palpite != sorteado) {

					System.out.println(" ");

					System.out.println("****************** Você perdeu *****************");

				}

			}

			System.out.println("");
			System.out.println("********************** Número Sorteado: " + sorteado + " ***********************");

			scan.close();

		} catch (Exception e) {
			System.out.println("Digite valores válidos - Erro: " + e);

		}
	}
}