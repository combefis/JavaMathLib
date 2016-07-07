// Cosine.java

package be.ukonline.mathlib;

/**
 * Cosine function a * cos (bx + c)
 * 
 * @author Sébastien Combéfis
 * @version July 28, 2015
 */
public final class Cosine extends Function
{
	// Instance variables
	private final double a, b, c;
	
	/**
	 * Creates a new cosine function
	 * 
	 * @pre a, b != 0
	 * @post A new instance of this is created, representing the cosine function
	 *       a * cos (bx + c), with the specified parameters
	 */
	public Cosine (double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public double getValue (double x)
	{
		return this.a*Math.cos(this.b*x+this.c);
	}
	
	@Override
	public Function derive()
	{
		return null;
	}
	
	/**
	 * Gets a string representation of the cosine function
	 * 
	 * @pre -
	 * @post The returned value contains a string representation of this cosine function
	 *       For example, the returned value can be:
	 *       cos (x)
	 *       cos (-2.0x)
	 *        -2.5 cos (3.0x + 5.0)
	 *        5.0 cos (-2.0x - 4.0)
	 */
	@Override
	public String toString()
	{
		if(this.a != 1){
			if(this.c != 0 && this.b != 1){
				if(this.c > 0){
					return (Double.toString(this.a)+" cos ("+Double.toString(this.b)+"x + "+Double.toString(this.c)+")");
				}else{
					return (Double.toString(this.a)+" cos ("+Double.toString(this.b)+"x - "+Double.toString(Math.abs(this.c))+")");
				}
			}else if(this.c != 0 && this.b == 1){
				if(this.c > 0){
					return (Double.toString(this.a)+" cos (x + "+Double.toString(this.c)+")");
				} else{
					return (Double.toString(this.a)+" cos (x - "+Double.toString(Math.abs(this.c))+")");
				}
			} else {
				return (Double.toString(this.a)+" cos (x)");
			}
		}else{
			if(this.c != 0 && this.b != 1){
				if(this.c > 0){
					return ("cos ("+Double.toString(this.b)+"x + "+Double.toString(this.c)+")");
				}else{
					return ("cos ("+Double.toString(this.b)+"x - "+Double.toString(Math.abs(this.c))+")"); 
				}
			}else if(this.c != 0 && this.b == 1){
				if(this.c > 0){
					return ("cos (x + "+Double.toString(this.c)+")");
				} else{
					return ("cos (x - "+Double.toString(this.c)+")");
				}
			}else if(this.c==0 && this.b !=1){
				return ("cos ("+Double.toString(this.b)+"x)");
			} else {
				return ("cos (x)");
			}
		}
	}
	
	/**
	 * Tests two cosine functions for equality
	 * 
	 * @pre -
	 * @post The returned value contains true if "o" is an instance of Cosine
	 *       who represents the same cosine function as this function, that is,
	 *       the a, b and c coefficients are the same
	 */
	@Override
	public boolean equals (Object o)
	{
		if (!(o instanceof Cosine)){
			return false;
		}
		Cosine test = (Cosine) o;
		if(test.a != this.a || test.b != this.b || test.c != this.c){
			return false;
		}
		return true;
	}
}