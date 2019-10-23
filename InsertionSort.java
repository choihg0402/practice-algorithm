
public class InsertionSort {
	public static void main(String[] args) {
		int[] input = {9, 6, 7, 3, 5};
		int n = 0;
		
		for(int i = 1; i < input.length; i++) {
			int target = input[i];
			for(int j = i - 1; j > -1; j--) {
				if(target < input[j]) {
					input[j+1] = input[j];
					input[j] = target;
				} else {
					break;
				}
				n++;
			}
		}
		
		for(int i : input) {
			System.out.printf("%d\n", i);
		}
		System.out.printf("n : %d\n", n);
	}
}
