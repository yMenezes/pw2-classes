public class TestaConta {

	public static void main(String[] args) {
		Agencia age = new Agencia();
		age.numAgencia = "1993";
		
		Conta cont = new Conta();
		cont.limite = 5000;
		cont.numCont = 3213;
		cont.saldo = 4350;
		cont.numAgencia = age;	
				
		System.out.println("Numero da agencia: " + age.numAgencia);
	}
}
