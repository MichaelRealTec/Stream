package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		// Stream = fluxo
		
		// Criando uma lista
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		// Criar um Stream inteiro
		Stream<Integer> st1 = list.stream();
		
		System.out.println(Arrays.toString(st1.toArray()));
	}

}
