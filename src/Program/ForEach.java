package Program;

public class ForEach {

	public static void main(String[] args) {
		String vect[] = new String[] {"Evelyn", "Jorge", "Lincon", "Stella"};
		
		/* o la�o for each � uma op��o ao la�o de repeti��o for para se percorrer cole��es 
		 * que possui a sintaxe mais f�cil e limpa
		 */
		
		for(String obj:vect) {
			System.out.println(obj);
		}
	}

}
