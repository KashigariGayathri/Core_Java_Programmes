package constructorsAndMethods;

public class MethodType {
	int add(int a, int b) {
		return a + b;
	}

	void addition(int a, int b) {
		System.out.println("Sum of two numbers: " +(a+b));
	}

	static String display() {
		return "Speak something in class";
	}

	float area(int r) {
		return (float)(3.14 * r * r);
	}

	public static void main(String[] args) {
		MethodType m=new MethodType();
		int sum=m.add(10,12);
		System.out.println(sum);
        m.addition(12,27);
		System.out.println(MethodType.display());
		float area1=m.area(5);
		System.out.println(area1);
	}
}
	