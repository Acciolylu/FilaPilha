package estrutura;

import java.util.Stack;

import basica.Processos;

public class Pilha {

    Stack<Processos> pilha = new Stack<Processos>();

	public void inserirP(Processos p) {

		pilha.push(p);

	}

	public Processos removerP() {

		return pilha.pop();

	}



	public boolean verificaP() {

		return pilha.isEmpty();
	}

	public void mostrarP() {

		System.out.println(pilha.toString());

	}
    
}
