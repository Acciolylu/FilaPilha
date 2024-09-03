package main;

import basica.Processos;
import estrutura.Fila;
import estrutura.FilaLinked;
import estrutura.Pilha;

public class Principal {

    public static void main(String[] args) {

         FilaLinked buffer = new FilaLinked(); 
         Pilha p = new Pilha();

    
       Processos p1 = new Processos(2145, "DOCUMENTO A");
       Processos p2 = new Processos(56785478, "DOCUMENTO B");
       Processos p3 = new Processos(12490, "DOCUMENTO C");
       Processos p4 = new Processos(34566, "DOCUMENTO D");


       buffer.adicionar(p1);
       buffer.adicionar(p2);
       buffer.adicionar(p3);
       buffer.adicionar(p4);

       while (!buffer.verificar()){
        p.inserirP(buffer.remover());
       }

       buffer.mostrar();




     
		
}
	
    }
    

