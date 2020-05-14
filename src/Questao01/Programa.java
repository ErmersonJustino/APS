package Questao01;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------");		
		System.out.println("\nDados do Primeiro Aluno: ");
		Aluno aluno01 = new Aluno();		
		System.out.println("------------------------------------");	
		
		
		System.out.println("\nDados do Segundo Aluno: ");
		aluno01.exibirNomeCompleto();
		aluno01.exibirMatricula();
		aluno01.exibirCpf();
		
		System.out.println("------------------------------------");	
		System.out.println("\nDados do Terceiro Aluno: ");
		Aluno aluno02 = new Aluno("Carlos Pereira da silva", "000.000.000-02");
		System.out.println("Nome Aluno: " + aluno02.getNomeCompleto());
		System.out.println("CPF: " + aluno02.getCpf());
		System.out.println("------------------------------------");	
	}

}
