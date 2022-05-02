public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.nome = "Leticia";
		c1.status = StatusClienteEnum.ATIVO;
		
		Cartao credito = new Cartao();
		credito.numeracao = "432 321 432 654";
		
	}
}
