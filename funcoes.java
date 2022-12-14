"# funcoes" 

  package funções;
import java.util.Scanner;
public class atv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner entrada = new Scanner (System.in);
      double valor=0.0;
      double opçao=0.1;
      
     
      System.out.println("Digite o valor em reais que deseja converter:");
      valor = entrada.nextDouble();
      
      System.out.println("Qual é a forma que deseja:\n1(Dolares)\n2(Yenes)\n0(Sair)\n>");
      opçao = entrada.nextInt();
      
      if(opçao==0) {
    	  System.out.println("Programa encerrado");
      }
      if(opçao==1) {
    	  opçao = dolar(valor);	
    	  
      }
      if(opçao==2) {
    	  opçao = yenes(valor);
      }
      }
	

	public static double dolar (double dolares) {
		Scanner entrada = new Scanner (System.in);
		
		dolares = dolares*0.3;
		System.out.println("O valor em Dolares é: "+dolares);
		return Integer.parseInt(entrada.nextLine());
	}
	public static double yenes (double yenes) {
		Scanner entrada = new Scanner (System.in);
		
		 yenes = yenes*30;
		 System.out.println("O valor em Yenes é: "+yenes);
		 return Integer.parseInt(entrada.nextLine());
	}
	
}
