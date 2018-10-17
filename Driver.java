public class Driver {

  public static void main(String[] args) {
    System.out.println();

    // RealNumber testing!!!
    System.out.println("Testing RealNumber class (the easy part!!! hopefully!!!)");
    System.out.println("----------");
    RealNumber p = new RealNumber(1.0);
    RealNumber q = new RealNumber(2.0);

    // toString, RealNumber(s)
    System.out.print("Real Number p (should print 1.0): ");
    System.out.println(p);
    System.out.print("Real Number q (should print 2.0): ");
    System.out.println(q);
    System.out.println("----------");

    // RealNumber opeations
    System.out.print("p + q (should print 3.0): ");
    System.out.println(p.add(q));
    System.out.print("p - q (should print -1.0): ");
    System.out.println(p.subtract(q));
    System.out.print("p * q (should print 2.0): ");
    System.out.println(p.multiply(q));
    System.out.print("p / q (should print 0.5): ");
    System.out.println(p.divide(q));

    System.out.println();

    // RationalNumber testing!!!
    System.out.println("Testing RationalNumber class");
    System.out.println("----------");
    RationalNumber a = new RationalNumber(1,2);
    RationalNumber b = new RationalNumber(5,20);
    RationalNumber c = new RationalNumber(4,8);
    RationalNumber d = new RationalNumber(0,4);

    // testing methods, RationalNumber(s)

    System.out.print("Rational Number a (should print 1/2): ");
    System.out.println(a);
    System.out.print("Rational Number b (should print 1/4): ");
    System.out.println(b);
    System.out.print("Rational Number c (should print 1/2): ");
    System.out.println(c);
    System.out.print("Rational Number d (should print 0): ");
    System.out.println(d);
    System.out.println("----------");

    System.out.print("'RealNumber' representation of a (should print 0.5): ");
    System.out.println(a.getValue());
    System.out.print("'RealNumber' representation of b (should print 0.25): ");
    System.out.println(b.getValue());
    System.out.print("'RealNumber' representation of c (should print 0.5): ");
    System.out.println(c.getValue());
    System.out.print("'RealNumber' representation of d (should print 0.0): ");
    System.out.println(d.getValue());
    System.out.println("----------");

    System.out.print("Reciprocal of Rational Number a (should print 2): ");
    System.out.println(a.reciprocal());
    System.out.print("Reciprocal of Rational Number b (should print 4): ");
    System.out.println(b.reciprocal());
    System.out.print("Reciprocal of Rational Number c (should print 2): ");
    System.out.println(c.reciprocal());
    System.out.println("Reciprocal of Rational Number d (should print... eh let's not go there)");
    System.out.println("----------");

    System.out.print("[a == a] (should print true): ");
    System.out.println(a.equals(a));
    System.out.print("[a == b] (should print false): ");
    System.out.println(a.equals(b));
    System.out.print("[a == c] (should print true): ");
    System.out.println(a.equals(c));
    System.out.println("----------");

    System.out.print("Numerator of Rational Number a (should print 1): ");
    System.out.println(a.getNumerator());
    System.out.print("Denominator of Rational Number a (should print 2): ");
    System.out.println(a.getDenominator());
    System.out.println("----------");

    // RationalNumber opeations
    System.out.print("a + c (should print 1): ");
    System.out.println(a.add(c));
    System.out.print("a - c (should print 0): ");
    System.out.println(a.subtract(c));
    System.out.print("a * c (should print 1/4): ");
    System.out.println(a.multiply(c));
    System.out.print("a / c (should print 1): ");
    System.out.println(a.divide(c));
    System.out.println("----------");

    //check that GCD works
    System.out.print("Checking GCD. GCD of 8 and 4 (should return 4)");
    System.out.println(RationalNumber.gcd(8,4));
    System.out.print("GCD of 3 and 4 (should return 1)");
    System.out.println(RationalNumber.gcd(3,4));
    System.out.print("GCD of 32 and 14 (should return 2)");
    System.out.println(RationalNumber.gcd(32, 14));
  }

}
