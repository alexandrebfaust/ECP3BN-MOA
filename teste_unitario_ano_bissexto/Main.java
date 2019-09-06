package teste_unitario_ano_bissexto;

public class Main {

	   public static void main(String[] args) {
	           
	       Operadores meuOperador = new Operadores();
	       int dois = meuOperador.anoBissexto();
	       if(dois==1) {
	    	   System.out.println("O ano é Bissexto");
	       }
	       else {
	    	   System.out.println("Erro");
	       }
	   }
	}
