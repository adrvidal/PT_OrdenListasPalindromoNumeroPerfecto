package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {


	public void ordenalistaASC(List<Integer> slist) {
		Collections.sort(slist);
		System.out.println("After Sorting: " + slist + "\n\n");
	}

	private Integer determinaorden(List<Integer> list) {
		List<Integer> listaASC = new ArrayList<>(list);
		List<Integer> listaDESC = new ArrayList<>(list);
		Collections.sort(listaASC);
		Collections.sort(listaDESC, Collections.reverseOrder());

		if (list.equals(listaASC)) {
			return 1;
		} else if (list.equals(listaDESC)) {
			return -1; //comentaaaaaaaaaaaa

		} else {
			return 0;
		}
	}

	public String orden(List<Integer> list) {
		if (determinaorden(list).equals(1)) {
			return "ASC";
		} else if (determinaorden(list).equals(-1)) {
			return "DESC";
		} else {
			return "NO ORD";
		}
	}

}
