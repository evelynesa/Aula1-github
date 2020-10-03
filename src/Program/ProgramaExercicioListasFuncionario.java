package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Entities.ExercicioListasFuncionario;

public class ProgramaExercicioListasFuncionario {

	public static void main(String[] args) {
		
		ExercicioListasFuncionario funcionario  = new ExercicioListasFuncionario();
		Scanner sc = new Scanner(System.in);
		List<ExercicioListasFuncionario> listaFuncionarios = new ArrayList<>();
				
		System.out.print("Digite a quantidade de Funcionários a serem Cadastrados: ");
		int qtd = sc.nextInt();
		
		for(int i=0; i<qtd; i++) {
			
			funcionario = new ExercicioListasFuncionario();
			
			System.out.print("Digite o Id do funcionário: ");
			funcionario.setIdFuncionario(sc.nextInt());
			sc.nextLine();
			//funcionario.setNmFuncionario(sc.nextLine());
			
			System.out.print("Digite o nome do funcionário: ");
			funcionario.setNmFuncionario(sc.nextLine());
			//String nmFunc = sc.nextLine();
			
			System.out.print("Digite o salário atual do funcionário: ");
			funcionario.setSalarioFuncionario(sc.nextDouble());
			//double salarioFunc = sc.nextDouble();
			System.out.println();
			
			//ExercicioListasFuncionario funcionario = new ExercicioListasFuncionario(nmFunc, idFunc, salarioFunc);
			listaFuncionarios.add(funcionario);
			
		}
		
		/*for(ExercicioListasFuncionario c: listaFuncionarios) {
			System.out.println(c.toString(listaFuncionarios));
		}*/
		
		
		
		System.out.println("Digite o Id do Funcionário para Aumento de Salário");
		int idFuncionario = sc.nextInt();
		sc.nextLine();
		
		ExercicioListasFuncionario emp = listaFuncionarios.stream().filter(x -> x.getIdFuncionario() == idFuncionario).findFirst().orElse(null);
		
		if (emp==null) {
			System.out.println("Funcionário não identificado. Este Id não existe.");
		}else {
			System.out.println("Digite o Percentural de Aumento de Salario");
			double percentAumento = sc.nextDouble();
			sc.nextLine();
			emp.aumentaSalario(percentAumento);
		}
		
		System.out.println();
		System.out.println("******************************************************");
		for (ExercicioListasFuncionario c: listaFuncionarios) {
			System.out.println(c.toString(listaFuncionarios));
			System.out.println();
			}
		sc.close();
	}

}
