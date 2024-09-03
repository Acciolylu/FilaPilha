package estrutura;

import java.util.LinkedList;

import basica.Processos;

public class FilaLinked {
    
    LinkedList<Processos> filaL = new LinkedList<Processos>();


    public void adicionar(Processos p){
        filaL.addLast(p);
    }
    
    public void remover(){
        filaL.removeFirst();
    }

    public boolean verificar(){
        return filaL.isEmpty();
    }

    public void mostrar() {

		System.out.println(filaL.toString());

	}


}
