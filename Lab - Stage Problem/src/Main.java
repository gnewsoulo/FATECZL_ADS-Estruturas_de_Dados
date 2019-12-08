import java.util.Scanner;

/*
	Em diversas competições acadêmicas, como a Olimpíada Brasileira de Informática (OBI), uma certa
quantidade de competidores se classifica de uma fase para a fase seguinte, garantido uma das vagas
disponíveis. Entretanto, normalmente essa quantidade é variável, pois dada uma certa quantidade
mínima de classificados, é frequente que haja empate na última vaga de classificação. Neste caso, é
comum que todos os competidores empatados na última colocação se classifiquem.
	Sua tarefa é ajudar a calcular o número de competidores classificados para a próxima fase. Você
receberá uma lista de pontuações obtidas pelos competidores e o número mínimo de vagas para a fase
seguinte e você deve decidir quantos competidores de fato vão se classificar.

Entrada
	A primeira linha da entrada contém um número inteiro N, 1 <= N <= 1000, representando o número
de competidores. A segunda linha conterá um inteiro K, 1 <= K <= N, indicando o número mínimo de 
competidores que devem se classificar para a próxima fase. Em seguida, N linhas conterão, cada uma
um número entre 1 e 1000, inclusive, correspondente à pontuação de um competidor.

Saída
	Seu programa deve imprimir uma linha, contendo o número de classificados para a próxima fase.
*/

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many competitors are there?");
		int total = scanner.nextInt();
		System.out.println("What's the minimum amount of competitors to move to the next stage?");
		int toNext = scanner.nextInt();
		
		int[] scores = new int[total];
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Insert score for competitor " + (i + 1) + ":");
			scores[i] = scanner.nextInt();
		}
		scanner.close();
		
		for (int i = 0; i < scores.length - 1 ; i++) {
			for (int j = i+1; j < scores.length; j++) {
				if (scores[i] < scores[j]) {
					int aux = scores[j];
					scores[j] = scores[i];
					scores[i] = aux;
				}
			}
		}
		
		int draws = 0;
		for (int i = toNext -1; i < scores.length - 1 ; i++) {
			for (int j = i+1; j < scores.length; j++) {
				if (scores[i] == scores[j]) {
					draws++;
				} else {
					j = scores.length;
					i = scores.length;
				}
			}
		}
		
		int[] passing = new int[toNext + draws];
		
		if (passing.length > scores.length) {
			for (int i = 0; i < scores.length; i++) {
				passing[i] = scores[i];
			}
			System.out.println(scores.length + " competitors shall advance to the next stage.");
		} else {
			for (int i = 0; i < passing.length; i++) {
				passing[i] = scores[i];
			}
			System.out.println(passing.length + " competitors shall advance to the next stage.");
		}
		
	}
}
