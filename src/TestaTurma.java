
public class TestaTurma {
	
	public static void main(String[] args) {
		
		Turma trm = new Turma();
		
		trm.periodo = "Manh�";
		trm.serie = "Segundo ano";
		trm.sigla = "2 AI-DS";
		trm.tipoen = "Novotec";
		
		System.out.println("Periodo: " + trm.periodo + "\nTipo do ensino: " + trm.tipoen
				+ "\nS�rie do ensino: " + trm.serie + "\nSigla da turma: " + trm.sigla);
	
	}
}
