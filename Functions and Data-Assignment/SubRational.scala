//19001721
//Q2

class Rational(x:Int, y:Int){

    require(y>0, "Deenominator must be positive")

    private def gcd(a:Int, b:Int) :Int = if(b==0) a else gcd(b,a%b)

    private val g = gcd(math.abs(x),y)

    def this(x:Int) = this(x,1)

    def numer = x/g

    def denom = y/g

    def +(r:Rational) = new Rational(numer*r.denom + denom*r.numer, denom*r.denom)

    def neg = new Rational(-this.numer, this.denom)

    def -(r:Rational) = this + r.neg

    override def toString = numer + "/" + denom

}

object SubRational extends App{

    val r1 = new Rational(3,4)
    val r2 = new Rational(5,8)
    val r3 = new Rational(2,7)

   println(r1-r2-r3)
}