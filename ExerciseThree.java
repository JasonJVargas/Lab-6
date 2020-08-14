
public class ExerciseThree {

	public static void main(String[] args) {

	}
	int bar(int N) {
		 int result = 1; // O(1)
		 for (int i=1; i<N; i*=2) // O(log n)
		 result+=2;

		 return result;
		}
}
