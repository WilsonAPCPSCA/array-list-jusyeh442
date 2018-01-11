// Justin Yeh
import java.util.ArrayList;
public class RandomZeros {

	public static void main(String[] args) {
		ArrayList <Integer> numsRandom = new ArrayList <Integer> ();
		for (int i = 0; i < 10; i++) {
			numsRandom.add((int)(Math.random()*100));
		}
		System.out.println(numsRandom);
		for (int i = 0; i < numsRandom.size(); i++) {
			numsRandom.set(i, 0);
		}
		System.out.println(numsRandom);

	}

}
