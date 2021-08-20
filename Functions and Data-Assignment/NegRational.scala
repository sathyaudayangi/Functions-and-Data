//19001721
//Q1

class Rational(x:Int, y:Int){

    require(y>0, "Deenominator must be positive")

    private def gcd(a:Int, b:Int) :Int = if(b==0) a else gcd(b,a%b)

    private val g = gcd(math.abs(x),y)

    def this(x:Int) = this(x,1)

    def numer = x/g

    def denom = y/g

    def add(r:Rational) = new Rational(numer*r.denom + denom*r.numer, denom*r.denom)

    def neg = new Rational(-this.numer, this.denom)

    def sub(r:Rational) = this->add(r.neg)

    override def toString = numer + "/" + denom

}

object NegRational extends App{

    val r1 = new Rational(1,3)
    val r2 = new Rational(5,10)
    val r3 = new Rational(-4,16)

    println(r1.add(r2))
    println(r1.neg.add(r2))
    println(r2.neg)
    println(r3.neg)

}