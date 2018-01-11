//Justin Yeh
import java.util.ArrayList;
public class EmperorsNewGrove {

	public static void main(String[] args) {
		ArrayList <String> emperorCast = new ArrayList <String> ();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		String pacha = emperorCast.get(1);
		emperorCast.remove(1);
		emperorCast.add(2, "Chaca");
		emperorCast.add(3, "Tipo");
		emperorCast.add("Bucky");
		emperorCast.add(pacha);
		System.out.println(emperorCast);

	}

}
