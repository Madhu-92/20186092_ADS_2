import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class client {
	public static void main(String[] args) {

		System.out.println("1. Half data '0' and Half data '1'");
		System.out.println("2. Half the data is 0s, half the remainder is 1s, half the remainder is 2s ");
		System.out.println("3. Half the data is 0s, half random int values.");
		Scanner scan = new Scanner(System.in);
		int[] a = new int[1000];

		Random rand = new Random();

		switch (scan.nextInt()) {
		case 1 :
			for (int i = 0; i < 1000; i++)
				a[i] = i < 500 ? 0 : 1;
			break;

		case 2 :
			for (int i = 0; i < 750; i++)
				a[i] = i < 500 ? 0 : 1;
			for (int i = 750; i < 1000; i++)
				a[i] = 2;
			break;
		case 3 :
			for(int i = 0; i < 500; i++)
				a[i] = 0;
			for(int i = 500; i < 1000; i++)
				a[i] = rand.nextInt();
			break;
		default:
			System.out.println(":P");
		}
		// System.out.println(Arrays.toString(a));
		final long startTime = System.nanoTime();
		InsertionSort.sort(a);
		final long endTime = System.nanoTime();

		System.out.println("Time taken: " + (endTime - startTime) + "mS");
		// System.out.println();
	}
}