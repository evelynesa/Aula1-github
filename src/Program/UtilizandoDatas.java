package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class UtilizandoDatas {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
				
		Date data1 = sdf1.parse("25/06/2018");
		Date data2 = sdf2.parse("25/06/2018 12:45:07");
		
		System.out.println("");
		System.out.println("Datas sem formatação (Formato Padrão do Java)");
		System.out.println(data1);
		System.out.println(data2);
		
		System.out.println();
		System.out.println("Datas formatadas de acordo com o objeto sdf2");
		
		System.out.println(sdf2.format(data1));
		System.out.println(sdf2.format(data2));
		
		System.out.println();
		System.out.println("Datas Formatadas de acordo com o objeto sdf1");
		
		System.out.println(sdf1.format(data1));
		System.out.println(sdf1.format(data2));
		
		System.out.println();
		System.out.println("Pegando a hora atual do Sistema ");
		Date horaAtual = new Date();
		Date horaAtual2 = new Date(System.currentTimeMillis());
		
		System.out.println("Data e Hora Atual: "+sdf2.format(horaAtual2)); //formata a data
		System.out.println("Data e Hora Atual: "+sdf2.format(horaAtual));
		
		System.out.println();
		System.out.println("Utilizando o Padrão ISO 8601 ");
		
		Date dataHora = new Date();
		System.out.println(sdf3.format(dataHora));
	}

}
