package funcao;
import java.util.Scanner;
import java.util.*;
import java.util.Calendar;
public class funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String semana = "";
				int dias, semInt;
				Scanner entrada = new Scanner(System.in);
				
				Locale lugar = new Locale("PT");
				
				System.out.print("Quantos dias você quer adicionar? ");
				dias = entrada.nextInt();
				
				Calendar calendario = Calendar.getInstance();
				calendario.add( Calendar.DAY_OF_MONTH , dias );
				
				System.out.print("Daqui a " + dias + " dias será " + calendario.get(Calendar.DAY_OF_MONTH) + "/" + (calendario.get(Calendar.MONTH)+1) + "/" + calendario.get(Calendar.YEAR) + " (" + calendario.getDisplayName(Calendar.DAY_OF_WEEK, 2, lugar) + ")");

			}
}
