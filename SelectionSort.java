
public class SelectionSort {
	public static void main(String[] args) {
		int[] input = {9, 6, 7, 3, 5};
		int n = 0;
		
		for(int i = 0; i < input.length; i++) {
			int min = i;
			if (i == input.length - 1) {
				break;
			}
			for (int j = i + 1; j < input.length; j++) {
				if (input[min] > input[j]) {
					min = j;
				}
				n++;
			}
			int temp = input[i];
			input[i] = input[min];
			input[min] = temp;
		}
		
		
		for(int i : input) {
			System.out.printf("%d\n", i);
		}
		System.out.printf("n : %d\n", n);
	}
}
