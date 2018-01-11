// Justin Yeh
import java.util.Random;
public class ZeroElements {

	public static void main(String[] args) {
		int [] randomArray = new int [20];
		int zeroCounter = 0;
		int total = 0;
		Random r = new Random();

		System.out.print("randomArray [] = ");
		for (int i = 0; i < randomArray.length; i++) {
			randomArray [i] = r.nextInt(10) + 0;
			System.out.print(randomArray[i] + " ");
			if (randomArray[i] == 0) {
				zeroCounter++;
			}
			total = total + randomArray[i];
		}

		double average = 0;
		if (randomArray.length > 0) {
			average = total / randomArray.length;
		}

		System.out.println("\nNumber of elements in array equal to zero: " + zeroCounter);
		System.out.println("Sum: " + total);
		System.out.println("Average: " + average);

	}

}