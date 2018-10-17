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
    reduce();
  }

  public double getValue(){
    return ((double)numerator) / denominator;
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
    if (denominator < 0) { ///THIS MEANS IT CHANGES EVERY TIME YOU PRINT IT!!! USE VARIABLES
      denominator = denominator * -1;
      numerator = numerator *  -1;
    }
    if (numerator == 0 || denominator == 1) {
      return numerator + "";
    }
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  public static int gcd(int a, int b){ //remember to switch back to private
    /*use euclids method or a better one*/
    int greatestCD = 1;
    int remainder_ = 1;
    int a_ = a;
    int b_ = b;
    if (a < b) {
      a_ = b;
      b_ = a;
    }
    while (remainder_ != 0) {
      if (b_ == 0) {
        greatestCD = 1;
        return greatestCD;
      }
      else if (a_%b_ == 0) {
        greatestCD = b_;
        remainder_ = 0;
      }
      else {
        //c_ = b_;
        int c_ = a_;
        a_ = b_;
        b_ = c_%b_;
      }
    }
    return greatestCD;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int greatestCD = gcd(numerator, denominator);
    numerator = (numerator / greatestCD);
    denominator = (denominator / greatestCD);
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
    RationalNumber divided = new RationalNumber((numerator * other.getDenominator()), (denominator * other.getNumerator()));
    return divided;
  }
  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    RationalNumber added = new RationalNumber((numerator * other.getDenominator() + other.getNumerator() * denominator), (denominator * other.getDenominator()));
    return added;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    RationalNumber subtracted = new RationalNumber((numerator * other.getDenominator() - other.getNumerator() * denominator), (denominator * other.getDenominator()));
    return subtracted;
  }
}
