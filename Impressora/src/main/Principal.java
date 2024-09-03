package main;

import basica.Processos;
import estrutura.Fila;
import estrutura.Pilha;

public class Principal {

    public static void main(String[] args) {

         Fila buffer = new Fila(); 

    
        buffer.inserir("Documento A");
        buffer.inserir("Documento B");
        buffer.inserir("Documento C");

     
		if(!buffer.verifica()) {
			System.out.println("Lista com elementos");
			System.out.println("====================");
		}

		buffer.mostrar();

		System.out.println("====================");

      
        Pilha bufferP = new Pilha(); 

      
        bufferP.inserirP("Documento D");
        bufferP.inserirP("Documento E");
        bufferP.inserirP("Documento F");
  

        System.out.println("Pilha inicial:");
        bufferP.pegarElemento(); 

    
 
}
	
    }
    

