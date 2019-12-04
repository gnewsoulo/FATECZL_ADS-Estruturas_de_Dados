import java.util.Scanner;

/*
	O novo prédio da empresa FZL possui 3 andares. Em determinadas épocas do ano, os funcionários 
bebem muito café. Por conta disso, o Diretor decidiu presentear os funcionários e professores com
uma nova máquina de expresso. Esta máquina deve ser instalada em um dos 3 andares, mas a
instalação deve ser feita de forma que as pessoas não percam muito tempo subindo e descendo
escadas.

	Cada funcionário bebe 1 café expresso por dia. Ele precisa ir do andar onde trabalha até o andar onde
está a máquina e voltar para seu posto de trabalho. Todo funcionário leva 1 minuto para subir ou
descer um andar. Como a FZL se importa muito com a eficiência, ela quer posicionar a máquina de
forma a minimizar o tempo total gasto subindo e descendo escadas.
Sua tarefa é ajudar a diretoria a posicionar a máquina de forma a minimizar o tempo total gasto pelos
funcionários subindo e descendo escadas.

Entrada
	A entrada consiste em 3 números, A1, A2, A3 (0 <= A1, A2, A3 <= 1000), um por linha, onde Ai representa 
	o número de pessoas que trabalham no i-ésimo andar.

Saída
	Seu programa deve imprimir uma única linha, contendo o número total de minutos a serem gastos com o melhor 
	posicionamento possível da máquina.
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
