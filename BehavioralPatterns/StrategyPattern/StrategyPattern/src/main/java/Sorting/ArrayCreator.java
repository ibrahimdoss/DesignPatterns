package Sorting;

public class ArrayCreator {

	public static double[] createArray(int n) {
		double[] array = new double[n];

		for (int i = 0; i < n; i++) {
			array[i] = i * Math.random();
		}

		return array;
	}
}
