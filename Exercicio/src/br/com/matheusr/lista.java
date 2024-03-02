package br.com.matheusr;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class lista {

	public static void main(String[] args) {
		
		Set<String> lista = new TreeSet<>();
		lista.add("Victor");
		lista.add("Mathues");
		lista.add("Roberto");
		lista.add("Nara");
		System.out.println(lista);
		
		
		
	 String texto = ("matheus=M, roberta-F, joao-M, ana-F");
	 String[] valoresArray = texto.split(",");
	 
	 System.out.print(valoresArray[0]);
	 System.out.print(valoresArray[1]);
	 System.out.print(valoresArray[2]);
	 System.out.println(valoresArray[3]);
	 
	 System.out.println(" Grupo FEMININO: "+ valoresArray[1] + valoresArray[3]);
	 System.out.println(" Grupo MASCULINOs: "+ valoresArray[0] + valoresArray[2]);
	 
	
	}
}
