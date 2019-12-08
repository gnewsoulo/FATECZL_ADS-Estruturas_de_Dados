import java.util.Scanner;

/*
	Em diversas competi��es acad�micas, como a Olimp�ada Brasileira de Inform�tica (OBI), uma certa
quantidade de competidores se classifica de uma fase para a fase seguinte, garantido uma das vagas
dispon�veis. Entretanto, normalmente essa quantidade � vari�vel, pois dada uma certa quantidade
m�nima de classificados, � frequente que haja empate na �ltima vaga de classifica��o. Neste caso, �
comum que todos os competidores empatados na �ltima coloca��o se classifiquem.
	Sua tarefa � ajudar a calcular o n�mero de competidores classificados para a pr�xima fase. Voc�
receber� uma lista de pontua��es obtidas pelos competidores e o n�mero m�nimo de vagas para a fase
seguinte e voc� deve decidir quantos competidores de fato v�o se classificar.

Entrada
	A primeira linha da entrada cont�m um n�mero inteiro N, 1 <= N <= 1000, representando o n�mero
de competidores. A segunda linha conter� um inteiro K, 1 <= K <= N, indicando o n�mero m�nimo de 
competidores que devem se classificar para a pr�xima fase. Em seguida, N linhas conter�o, cada uma
um n�mero entre 1 e 1000, inclusive, correspondente � pontua��o de um competidor.

Sa�da
	Seu programa deve imprimir uma linha, contendo o n�mero de classificados para a pr�xima fase.
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
