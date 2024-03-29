package miniLeilao;

import jade.core.*;

public class CompradorDeLivros extends Agent{
	
	private String livrosComprar;
	
	protected void setup(){
		
		System.out.println("Olá! Sou o comprador"+getLocalName()+"Quero comprar!");
		//Captura o título do livro que comprará, que foi passado como argumento de inicialiação
		Object[] argumento = getArguments();
		
		if(argumento!= null && argumento.length > 0){
			//argumento[0] = "Pequeno Principe";
			//argumento[1] = "É só isso";
			
			livrosComprar = (String) argumento[0];
			System.out.println("Pretendo comprar o livro"+livrosComprar);
		}
		else{
			//finaliza o agente
			System.out.println("Não tenho livros para comprar!");
			doDelete();
		}
	}
	
	protected void takeDown(){
		System.out.println("Agente comprador+"+getAID().getName()+"está finalizado!");
		
	}
}