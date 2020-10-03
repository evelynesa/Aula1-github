package Program;

public class ForEach {

	public static void main(String[] args) {
		String vect[] = new String[] {"Evelyn", "Jorge", "Lincon", "Stella"};
		
		/* o laço for each é uma opção ao laço de repetição for para se percorrer coleções 
		 * que possui a sintaxe mais fácil e limpa
		 */
		
		for(String obj:vect) {
			System.out.println(obj);
		}
	}

}
