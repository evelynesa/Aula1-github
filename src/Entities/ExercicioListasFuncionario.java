package Entities;

import java.util.List;

public class ExercicioListasFuncionario {

	private String nmFuncionario;
	private int idFuncionario;
	private double salarioFuncionario;
	
	public ExercicioListasFuncionario() {
		super();
	}

	public String getNmFuncionario() {
		return nmFuncionario;
	}

	public void setNmFuncionario(String nmFuncionario) {
		this.nmFuncionario = nmFuncionario;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public void setSalarioFuncionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}

	public double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public double aumentaSalario(double percentAumento) {
		this.salarioFuncionario += (this.salarioFuncionario * percentAumento / 100);
		return this.salarioFuncionario;
	}

	public int posFunc(List<ExercicioListasFuncionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getIdFuncionario() == id) {
				return i;
			}
		}
		return -1;
	}

	public String toString(List<ExercicioListasFuncionario> listFunc) {
		
		for (int i=0; i<listFunc.size(); i++) {
			return "Id do Funcionário: " + getIdFuncionario() + "\nNome do Funcionário: " + getNmFuncionario()
			+ "\nSalario Atual do Funcionário: " + String.format("%.2f", getSalarioFuncionario());
		}
		return null;
	}

}
