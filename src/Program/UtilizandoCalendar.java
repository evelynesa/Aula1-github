package Program;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilizandoCalendar {

	public static void main(String[] args) {

		Date data = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //formatador
		System.out.println("Data Formatada: "+sdf1.format(data));
		
		//Adicionando Tempo em Horas a uma Data:
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.HOUR_OF_DAY,4);
		cal.getTime();
		System.out.println("Data Adicionada de 4 horas: "+sdf1.format(cal.getTime()));
		
		//Buscando uma unidade de Tempo
		int minutos = cal.get(Calendar.MINUTE);
		int mes = cal.get(Calendar.MONTH)+1; //Sempre Adicione 01 porque para a classe Calendar, o mês de Janeiro equivale ao mês 0
		System.out.println("Minutos da Hora Atual: "+minutos);
		System.out.println("Mês Hora Atual: "+mes);
		
}
}