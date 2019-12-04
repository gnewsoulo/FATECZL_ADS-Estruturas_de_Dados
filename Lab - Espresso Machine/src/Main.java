import java.util.Scanner;

/*
	O novo pr�dio da empresa FZL possui 3 andares. Em determinadas �pocas do ano, os funcion�rios 
bebem muito caf�. Por conta disso, o Diretor decidiu presentear os funcion�rios e professores com
uma nova m�quina de expresso. Esta m�quina deve ser instalada em um dos 3 andares, mas a
instala��o deve ser feita de forma que as pessoas n�o percam muito tempo subindo e descendo
escadas.

	Cada funcion�rio bebe 1 caf� expresso por dia. Ele precisa ir do andar onde trabalha at� o andar onde
est� a m�quina e voltar para seu posto de trabalho. Todo funcion�rio leva 1 minuto para subir ou
descer um andar. Como a FZL se importa muito com a efici�ncia, ela quer posicionar a m�quina de
forma a minimizar o tempo total gasto subindo e descendo escadas.
Sua tarefa � ajudar a diretoria a posicionar a m�quina de forma a minimizar o tempo total gasto pelos
funcion�rios subindo e descendo escadas.

Entrada
	A entrada consiste em 3 n�meros, A1, A2, A3 (0 <= A1, A2, A3 <= 1000), um por linha, onde Ai representa 
	o n�mero de pessoas que trabalham no i-�simo andar.

Sa�da
	Seu programa deve imprimir uma �nica linha, contendo o n�mero total de minutos a serem gastos com o melhor 
	posicionamento poss�vel da m�quina.
*/

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many employees are there on the 1st Floor?");
		int f1 = scanner.nextInt();
		System.out.println("How many employees are there on the 2nd Floor?");
		int f2 = scanner.nextInt();
		System.out.println("How many employees are there on the 3rd Floor?");
		int f3 = scanner.nextInt();
		scanner.close();
		
		int pos1 = (f2 * 2) + (f3 * 4);
		int pos2 = (f1 * 2) + (f3 * 2);
		int pos3 = (f1 * 4) + (f2 * 2);
		
		if ( (pos1 < pos2) && (pos1 < pos3) ){
			System.out.println("Total displacement time: " + pos1 + ". Optimal positioning: 1st Floor.");		
		} else if ( (pos2 < pos1) && (pos2 < pos3)) {
			System.out.println("Total displacement time: " + pos2 + ". Optimal positioning: 2nd Floor.");
		} else {
			System.out.println("Total displacement time: " + pos3 + ". Optimal positioning: 3rd Floor.");
		}
	}
}
