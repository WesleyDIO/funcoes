package funcao;

	import java.util.Calendar;
	import java.util.Locale;
	import java.util.Scanner;

	public class atv3 {
		public static void main(String[] args) {
			String semana = "";
			int dias, semInt;
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Qual lingua você quer o dia da semana? (PT, FR, ES, EN...) ");
			Locale lugar = new Locale(entrada.nextLine());
			
			System.out.print("Quantos dias você quer adicionar? ");
			dias = entrada.nextInt();
			
			Calendar calendario = Calendar.getInstance();
			calendario.add( Calendar.DAY_OF_MONTH , dias );
			
			System.out.print("Daqui a " + dias + " dias será " + calendario.get(Calendar.DAY_OF_MONTH) + "/" + (calendario.get(Calendar.MONTH)+1) + "/" + calendario.get(Calendar.YEAR) + " (" + calendario.getDisplayName(Calendar.DAY_OF_WEEK, 2, lugar) + ")");

		}
	}
