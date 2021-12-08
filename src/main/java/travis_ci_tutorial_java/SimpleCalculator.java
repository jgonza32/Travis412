package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int multi(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		if(b == 0)
			throw new IllegalArgumentException("Not allowed to divide by 0")
		return a / b;
	}
}
