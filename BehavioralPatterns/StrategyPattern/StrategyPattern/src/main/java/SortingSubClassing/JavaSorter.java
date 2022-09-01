package SortingSubClassing;

import java.util.Arrays;

public class JavaSorter extends QuickSorter {
	
	@Override
	public void sort(double[] array) {
		System.out.println("Using JavaSorter!");
		Arrays.sort(array);
	}
}
