package view;

import GustavoCruz.ListaInt.Lista;
import controlle.OrdenaListaController;

public class Main {

	public static void main(String[] args) {

	OrdenaListaController contrl = new OrdenaListaController();
	
	Lista P = new Lista();
	Lista S = new Lista();
	
	P.addFirst(1);
	try {
		P.addLast(7);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	S.addFirst(3);
	try {
		S.addLast(4);
		S.addLast(8);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	contrl.OrdenaLista(P, S);

	}

}
