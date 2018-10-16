public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
  }

  public double getValue(){
    return (numerator + 0.0) / denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber recip = new RationalNumber(denominator, numerator);
    return recip;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if (numerator == other.getNumerator() && denominator == other.getDenominator()) {
      return true;
    }
    else {
      return false;
    }
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    int newDenom;
    int remainder_ = 1;
    int a_ = a;
    int b_ = b;
    if (a < b) {
      a_ = b;
      b_ = a;
    }
    while remainder_ != 0 {
      if (a_%b_ == 0) {
        newDenom = b_;
        remainder_ = 0;
      }
      else {
        b_ = a_%b_;
        a_ = b_;
      }

    }
    return newDenom;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int x = gcd(numerator, denominator);
    RationalNumber reducedNumber = new RationalNumber((numerator/x), (denominator/x));
    return reducedNumber;

  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber multiplied = new RationalNumber((numerator * other.getNumerator()), (denominator * other.getDenominator()));
    return multiplied;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber divided = new RationalNumber((numerator / (other.getNumerator() + 0.0)), (denominator / (other.getDenominator() + 0.0)));
    return divided;

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
