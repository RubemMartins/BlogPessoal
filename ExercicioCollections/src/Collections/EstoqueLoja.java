package Collections;

import java.util.ArrayList;
import java.util.List;


public class EstoqueLoja {

	public static void main(String[] args) {
		
		//Criando a lista como ArrayList e populando com valores String
		List <String> produtos = new ArrayList();
		produtos.add("Camisa");
		produtos.add("Calça");
		produtos.add("Sapato");
		
		//Apresenta todos os dados da lista
		System.out.println("Lista de produtos: "+produtos);
		
		//Removendo um dos produtos da lista
		produtos.remove("Camisa");
		
		//Apresentando lista novamente 
		System.out.println("Lista de produtos: "+produtos);
		
		//Atualizando item sapato para Sapatenis 
	    produtos.set(1,"Sapatenis");
	    
		//Apresentando lista novamente 
		System.out.println("Lista de produtos: "+produtos);
		
	}

}
