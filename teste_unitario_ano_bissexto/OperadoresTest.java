package teste_unitario_ano_bissexto;
import static org.junit.Assert.*;
import org.junit.Test;

public class OperadoresTest {

	   @Test
	   public final void testAnoBissexto() {

	       int resultadoEsperado = 1;
	       
	       Operadores meuOperador = new Operadores();
	       int resultadoObtido = meuOperador.anoBissexto();

	       // resultadoEsperado deve ser igua ao resultadoObtido
	       assertTrue("Teste de soma com 1 mais 1",
	               resultadoObtido == resultadoEsperado);
	   }


	}