public class ArithmeticGeometricMean {

	private final double EPS = 1.0e-14;
	private double result;

	public void evaluate(double a, double g) {
		double a1 = a;
		double g1 = g;
		while (Math.abs(a1 - g1) >= EPS) {
			double arith = (a1 + g1) / 2.0;
			double geom = Math.sqrt(a1 * g1);
			a1 = arith;
			g1 = geom;
		}
		result = a1;
	}	

	public double getResult() {
		return result;
	}

	public static void main(final String... args) {
		ArithmeticGeometricMean agm = new ArithmeticGeometricMean();
		agm.evaluate(1.0, 1.0 / Math.sqrt(2.0));
		System.out.println(agm.getResult());
	}
}
