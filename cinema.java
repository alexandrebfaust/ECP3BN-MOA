import java.util.Scanner;

public class cinema{
	
	private static void clear() {
		for(int i=0;i<100;i++) {
			System.out.print("\n");
		}
	}

	 private static void esperarTecla() { 
	        System.out.println("\nPressione ENTER para continuar...");
	        try{
	            System.in.read();
	        }  
	        catch(Exception e){

	        }  
	 }

	
	public static void main(String[] args)
	{
		int letras=5, numeros=9;
		int linha, coluna, opcao;
		char[] ltpoltrona = new char[letras];
		ltpoltrona[0] = 'A';
		ltpoltrona[1] = 'B';
		ltpoltrona[2] = 'C';
		ltpoltrona[3] = 'D';
		ltpoltrona[4] = 'E';
		int[][] poltronas = new int[letras][numeros];
		char letra;
		int numero=0, ingresso=0, opsessao=0;
		float ingressoint=28.0f;
		float ingressomeia=14.50f;
		float caixa=0f;
		float caixatotal=0f;
		int nletra=0, vendas=0, qntdint=0, qntdmeia=0;

		Scanner entrada = new Scanner(System.in);

		//limpa a tabela da sessao
		for (linha = 0; linha < letras; ++linha){
			for (coluna = 0; coluna < numeros; ++coluna){
				poltronas[linha][coluna]=0;
			}
		}

		do{
			clear();
			System.out.print("\n\n### HANE CINEMAS ### \n");
			System.out.print("Caixa atual: "+caixa+"\n");
			System.out.print("1-Vender Ingresso\n");
			System.out.print("2-Ver Sessao\n");
			System.out.print("3-Encerrar Sessao\n");
			System.out.print("9-Visualizar Relatorio\n");
			System.out.print("Selecione uma opcao: ");
			opcao = entrada.nextInt();

			switch(opcao){
				case 1:
					clear();
					System.out.print("\n\n## Vender Ingresso ##\n");
					System.out.print("-- Legenda - D=Disponivel | X=Vendido --\n");
					System.out.print("-----------------------------------------\n");
					System.out.print("| X | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");

					for (linha=0; linha<letras; linha++) {
						System.out.print("\n| "+ltpoltrona[linha]+" |"); //| A |);
						for(coluna = 0; coluna < numeros; coluna++){
							if(poltronas[linha][coluna]==0){
								System.out.print(" D |");
							}
							else{
								System.out.print(" X |");
							}
						}
					}
					do{
						System.out.print("\n(1 - Inteira - R$"+ingressoint+" | 2 - Meia - R$"+ingressomeia+")");
						System.out.print("\nSelecione o tipo de ingresso: ");
						ingresso = entrada.nextInt();
					}while(ingresso<=0||ingresso>2);

					do{
						System.out.print("\nSelecione uma letra: ");
						letra = entrada.next().charAt(0);
						switch(letra){
							case 'A':
								nletra=1;
								break;
							case 'B':
								nletra=2;
								break;
							case 'C':
								nletra=3;
								break;
							case 'D':
								nletra=4;
								break;
							case 'E':
								nletra=5;
								break;
							default: 
								System.out.print(" Letra invalida!");
						}
					}while(nletra<=0||nletra>5);
					do{
						System.out.print("\nSelecione um numero: ");
						numero = entrada.nextInt();
					}while(numero<=0||numero>9);
					nletra+=-1; //ajusta para vetor
					numero+=-1; //ajusta para vetor
					if(poltronas[nletra][numero]==1){
						System.out.print("\nEsta poltrona ja encontra-se ocupada! Reinicie a venda.");
					}
					else{
						poltronas[nletra][numero]=1;
						if(ingresso==1){
							caixatotal+=ingressoint;
							caixa+=ingressoint;
							qntdint++;
						}
						if(ingresso==2){
							caixatotal+=ingressomeia;
							caixa+=ingressomeia;
							qntdmeia++;
						}
						System.out.print("\nIngresso vendido com sucesso!");
					}
					esperarTecla();
					break;

				case 2:
					clear();
					System.out.print("\n\n## Ver Sessao ##\n");
					System.out.print("-- Legenda - D=Disponivel | X=Vendido --\n");
					System.out.print("-----------------------------------------\n");
					System.out.print("| X | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
					for (linha=0; linha<letras; linha++) {
						System.out.print("\n| "+ltpoltrona[linha]+" |"); //| A |);
						for(coluna = 0; coluna < numeros; coluna++){
							if(poltronas[linha][coluna]==0){
								System.out.print(" D |");
							}
							else{
								System.out.print(" X |");
							}
						}
					}
					esperarTecla();
					break;

				case 3:
					clear();
					System.out.print("\n\n## Encerrar Sessao ##\n");
		    		do{
						System.out.print("Encerrar sessao? (1 - Sim | 2 - Não): ");
			    		opsessao=entrada.nextInt();
					}while(opsessao!=1 && opsessao!=2);
					if(opsessao==1){
						//limpa a tabela da sessao
						for (linha = 0; linha < letras; ++linha){
							for (coluna = 0; coluna < numeros; ++coluna){
								poltronas[linha][coluna]=0;
							}
						}
						caixa=0;
					}
					else if(opsessao==2){
						break;
					}
					esperarTecla();
					break;

				case 9:
					clear();
					System.out.print("## RELATORIO DO CAIXA ## \n");
		    		System.out.print(qntdint+"x Ingresso Inteira - R$"+qntdint*ingressoint+"\n");
		    		System.out.print(qntdmeia+"x Ingresso Meia - R$"+qntdmeia*ingressomeia+"\n");
		    		System.out.print("Total de vendas: R$"+caixatotal+"\n");
		    		esperarTecla();
					break;

				default:
					System.out.print("Voce digitou o valor incorretamente!\n");

			}

		}while(1==1);
	}
}
