package Questao01;

public class Aluno {

	private String nomeCompleto;
	private int matricula;
	private String cpf;

	public Aluno() {
		this.nomeCompleto = "Maria paula";
		this.matricula = 987654;

		System.out.println("Aluno: " + this.nomeCompleto);
		System.out.println("Matricula: " + this.matricula);
	}

	public Aluno(String nomeCompleto, String cpf) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// Metodo exibir Nome
	public void exibirNomeCompleto() {
		System.out.println("Aluno: Ermerson Justino Tavora de Paula");
	}

	// Metodo exibir Matricula
	public void exibirMatricula() {
		System.out.println("Matricula: 00001");
	}

	// Metodo exibir CPF
	public void exibirCpf() {
		System.out.println("CPF: 000.000.000-01");
	}

}
