package unidade4;

import java.util.ArrayList;

public class NoteBook {
	
	static ArrayList<String> anotacoes;

	public static void main(String[] args) {
		
		anotacoes = new ArrayList<>();
		anotacoes.add("Comprar P�o");
		anotacoes.add("Vender Carro");
		anotacoes.add("Encontro �s 11h30");
		
		long t1 = System.currentTimeMillis();
		for(int i= 3; i<10003; i++)
			anotacoes.add("texto_"+ i);
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		//System.out.println(anotacoes);		
	}

}
