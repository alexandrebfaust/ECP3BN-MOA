package teste_unitario_ano_bissexto;

public class Operadores {

	   //Este metodo deve retornar a soma do numero1 (1) com o numero2 (1)
	   public int anoBissexto() {

	       int ano = 2016;
	       if((ano % 400 == 0 || !(ano % 100 == 0)) && ano % 4 == 0){
	           ano = 1;
	       }
	       else {
	    	   System.out.println("nao e bissexto");
	       }
	       
		return ano;
	       
	       

	   }
	}