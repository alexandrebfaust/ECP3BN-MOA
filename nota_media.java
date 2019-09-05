package aula3;

import java.util.Scanner;

public class nota_media {

	public static void main(String[] args) {
		
		int x = 0; //Tamanho do vetor
		float media = 0; //Variavel flutuante do vetor

		Scanner entrada = new Scanner(System.in);
		do {
			System.out.print("Informe o número de provas: ");
			x = entrada.nextInt();
		} while(x<1);

		System.out.print("Tamanho selecionado: " + x + "\n");
		float vetor[] = new float[x];

		for (int i=0; i<x; i++) {
			System.out.print("Informe a nota da prova " + (i+1) + ": ");
			vetor[i] = entrada.nextFloat();
		}

		for (int i=0; i<x; i++) {
			media += vetor[i];
		}

		media = media/x;
		System.out.print("Nota media: "+media+"\n\n");

		System.out.println( media >= 7 ? "Aprovado" : "Reprovado");

	}

}
