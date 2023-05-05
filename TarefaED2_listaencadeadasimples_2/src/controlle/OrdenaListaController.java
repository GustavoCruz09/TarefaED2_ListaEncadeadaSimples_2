package controlle;

import GustavoCruz.ListaInt.Lista;
import GustavoCruz.QuickSort.QuickSort;

public class OrdenaListaController {

	public OrdenaListaController() {
		super();
	}

	public void OrdenaLista(Lista P, Lista S) {
		
		Lista T = new Lista();
		int ctd = 0;
		int tam = P.size() + S.size();

		for (int i = 0; i < tam; i++) {
			if (i == 0) {
				try {
					T.addFirst(P.get(i));
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (i == 1) {
				try {
					T.addLast(P.get(i));
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					T.addLast(S.get(ctd));
				} catch (Exception e) {
					e.printStackTrace();
				}
				ctd++;
			}

		}
		System.out.println("Lista Terciaria");
		T.Mostra();
		
		Ordena(T);
		
	}

	private void Ordena(Lista T) {
		QuickSort qs = new QuickSort();
		
		int tam = T.size();
		int[] vt = new int [tam]; 
		
		for(int i = 0; i < tam; i++) {
			try {
				vt[i] = T.get(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		qs.QuickSort(vt, 0, tam - 1);
		
		System.out.println("\nLista Terciaria Ordenada");
		
		for(int i = 0; i < tam; i++) {
			System.out.println(vt[i]);
		}
		
	}
}
