public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.nome = "Leticia";
		c1.status = StatusClienteEnum.ATIVO;
		
		
		Cartao credito = new Cartao();
		credito.numeracao = "432 321 432 654";
		credito.dataDeValidade = "02/29";
		credito.tipo = TipoCartao.CREDITO;
		credito.status = StatusClienteEnum.ATIVO;
		
		System.out.println(c1.nome + "\n " + credito.status);
		
	}
}
