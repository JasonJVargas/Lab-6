
public class ExerciseTwo {

	public static void main(String[] args) {
	}

	static int foo(int N) {
		int result = 0;
		for (int i = 0; i < N; i++) // O(n)
			result++;
		for (int j = 0; j < 1000000; j++) // O(1)
			result += j;

		return result;
	}
}