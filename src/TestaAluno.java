
public class TestaAluno {
	
	public static void main(String[] args) {
		
		Aluno al = new Aluno();
		
		al.nome = "Maria Clara";
		al.dataNasc = "23/01/2006";
		
		System.out.println("Nome: " + al.nome + "\nData de nascimento: " + al.dataNasc);
	}
}
