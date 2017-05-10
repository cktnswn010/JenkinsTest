package simpleCalculator;

public class Main {

	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		calc.add(10,20);
		System.out.println(calc.getResult());
		SimpleCalculator calc2 = new SimpleCalculator();
		calc2.sub(10,20);
		calc2.dec(3);
		System.out.println(calc2.getResult());
	}

}
