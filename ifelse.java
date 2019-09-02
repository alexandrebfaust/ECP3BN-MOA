import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {

		do {
			int x = 0;
			Scanner entrada = new Scanner(System.in);
			do {
				System.out.print("Informe uma nota de 0 a 100: ");
				x = entrada.nextInt();
			} while((x<0)||(x>100));

			if (x>=90) {
				System.out.print("Nota A");
			}
			else if(x>=80){
				System.out.print("Nota B");
			}
			else if(x>=70){
				System.out.print("Nota C");
			}
			else if(x>=60){
				System.out.print("Nota D");
			}
			else if(x>=50){
				System.out.print("Nota E");
			}
			else{
				System.out.print("Nota F");
			}
			System.out.print("\n\n\n");
		} while(1==1);
		
	}

}
