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
		//Stream<Integer> st1 = list.stream();
		Stream<Integer> st1 = list.stream().map(x -> x * 10);// map aplica uma função a cada elemento da minha Stream.
		System.out.println(Arrays.toString(st1.toArray()));
		
		// Criar segunda Stream formato (String)
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		// Criar uma Stream para calcular os 10 primeiros elementos
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray())); // limite de 10 elementos
	
		// Criar uma Stream para calcular a sequencia de Fibonacci limitando a 20 elementos
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(20).toArray()));
	}

}
