/****************************************************************************
*
* Created by: James Sanii
* Created on: March 2018
* Triangle class
*
****************************************************************************/

//triangle class
public class Triangle {
	//triangle default constructor
	public Triangle() {
		this(0.0,0.0,0.0,0.0,0.0,0.0);
	}
	//triangle constructor
	public Triangle( double a, double b, double c, double angleA, 
			double angleB, double angleC) {
		//imported numbers
		this.a = a;
		this.b = b;
		this.c = c;
		this.angleA = angleA;
		this.angleB = angleB;
		this.angleC = angleC;
	}
	//variables for a triangle
	double a;
	double b;
	double c;
	double angleA;
	double angleB;
	double angleC;
	double s;
	double area;
	double height;
	int counter = 0;
	
	//checks if triangle is valid
	protected boolean isTriangleValid(){
		//changes counter based off the amount of user input
		if (a == 0) {counter++;}
		if (b == 0) {counter++;}
		if (c == 0) {counter++;}
		if (angleA == 0) {counter++;}
		if (angleB == 0) {counter++;}
		if (angleC == 0) {counter++;}
		//possible reasons a triangle is not valid
		if (angleA != 0 && angleB != 0 && angleC != 0) {
			return(false);
		}
		else if (angleA < 0 || angleB < 0 || angleC < 0 
				|| a < 0 || b < 0 || c < 0) {
			return(false);
		}
		else if (angleA + angleB + angleC > 180) {
			return(false);
		}
		else if (counter != 3) {
			return(false);
		}
		//if no invalid reasons are true, triangle must be valid
		else {return(true);}
	}
	
	//calcs the triangle name
	public String getName() {
		//logic to figure out what type of triangle it is
		if (a == b && a == c) {
			return("Equilateral");
		}
		else if (a == b || a == c || b == c) {
			return("Isosceles");
		}
		else {
			return("Scalene");
		}	
	}
	
	//uses given input to calculate sideA and returns sideA
	public double getSideA() {
		if (a != 0) {return a;}
		else if (b != 0 && angleA != 0 && angleC != 0) {
			return(b*Math.sin(angleA)/Math.sin(180 - angleA - angleC));
		}
		else if (b != 0 && angleB != 0 && angleC != 0) {
			return(b*Math.sin(180 - angleB - angleC)/ Math.sin(angleB));
		}
		else if (b != 0 && angleA != 0 && angleB != 0) {
			return((b*Math.sin(angleB))/ Math.sin(angleA));
		}
		else if (c != 0 && angleA != 0 && angleB != 0) {
			return((c*Math.sin(angleA))/Math.sin(180 - angleA - angleB));
		}
		else if (c != 0 && angleA != 0 && angleC != 0) {
			return((c*Math.sin(angleA))/ Math.sin(angleC));
			}
		else if (c != 0 && angleB != 0 && angleC != 0) {
			return((c*Math.sin(180 - angleB - angleC))/ Math.sin(angleC));
		}
		else if (b != 0 && c != 0 && angleA != 0) {
			return(Math.pow((c*c + b*b -b*c*Math.cos(angleA)),0.5));
		}
		else if (b != 0 && c != 0 && angleB != 0) {
			return((b*Math.sin(180 - (Math.asin((angleB *a)/b)) - angleB))/
					Math.sin(angleB));
		}
		else{
			return((b*Math.sin(180 - angleC - (Math.asin((angleC * b)/c))))/
					Math.sin(Math.asin((angleC *b)/c)));
		}
	}
	
	//uses given input to calculate sideB and returns sideB
	public double getSideB() {
		if (b != 0) {return b;}
		else if(a != 0 && angleB != 0 && angleC != 0) {
			return(a*Math.sin(angleB)/Math.sin(180 - angleB - angleC));
		}
		else if (a != 0 && angleA != 0 && angleC != 0) {
			return(a*Math.sin(180 - angleB - angleC)/ Math.sin(angleA));
		}
		else if (a != 0 && angleA != 0 && angleB != 0) {
			return((a*Math.sin(angleB))/ Math.sin(angleA));
		}
		else if (c != 0 && angleA != 0 && angleB != 0) {
			return((c*Math.sin(angleB))/Math.sin(180 - angleA - angleB));
		}
		else if (c != 0 && angleA != 0 && angleC != 0) {
			return((c*Math.sin(180 - angleA - angleC))/Math.sin(angleC));
			}
		else if (c != 0 && angleB != 0 && angleC != 0) {
			return((c*Math.sin(angleC))/ Math.sin(angleB));
		}
		else if (a != 0 && c != 0 && angleB != 0) {
			return(Math.pow((c*c + a*a -a*c*Math.cos(angleB)),0.5));
		}
		else if (a != 0 && c != 0 && angleA != 0) {
			return((a*Math.sin(180 - (Math.asin((angleA *a)/b)) - angleA))/
					Math.sin(angleA));
		}
		else{
			return((a*Math.sin(180 - angleC - (Math.asin((angleC * a)/c))))/
					Math.sin(Math.asin((angleC *a)/c)));
		}
	}
	
	//uses given input to calculate sideC and returns sideC
	public double getSideC() {
		if (c != 0) {return c;}
		else if(a != 0 && angleA != 0 && angleB != 0) {
			return((a*Math.sin(180 - angleA - angleB))/Math.sin(angleA));
		}
		else if (a != 0 && angleB != 0 && angleC != 0) {
			return((a*Math.sin(angleC))/ Math.sin(180- angleB- angleC));
		}
		else if (a != 0 && angleA != 0 && angleC != 0) {
			return(c = (a*Math.sin(angleC))/Math.sin(angleB));
		}
		else if (b != 0 && angleA != 0 && angleB != 0) {
			return((b*Math.sin(180 - angleA - angleB))/Math.sin(angleB));
		}
		else if (b != 0 && angleA != 0 && angleC != 0) {
			return((b*Math.sin(angleC)) /Math.sin(180- angleA- angleC));
			}
		else if (b != 0 && angleB != 0 && angleC != 0) {
			return((b*Math.sin(angleC))/ Math.sin(angleB));
		}
		else if (a != 0 && b != 0 && angleA != 0) {
			return(a*Math.sin(180 - angleA - Math.asin((angleA *b)/a)))/
					Math.sin(angleA);
		}
		else if (a != 0 && b != 0 && angleB != 0) {
			return((a*Math.sin(180 - Math.asin((angleB *a)/b) - angleB))/
					Math.sin(Math.asin((angleB *a)/b)));
		}
		else{
			return(Math.pow((a*a + b*b -a*b*Math.cos(angleC)),0.5));
		}
	}
	
	//calculates and returns the s value
	public double getS() {
		s = 0.5*(a + b + c);
		return(s);
	}
	
	//calculates and returns the area
	public double calcArea() {
		area = Math.pow(s*(s-a)*(s-b)*(s-c), 0.5 );
		return(area);
	}
	
	//calculates and returns radius
	public double calcCircleRadius() {
		return((2 * area) /(a+b+c));
	}
	
	//calculates and returns the height
	public double calcHeight() {
		if (a>b && a>c) {
			height = (2 * area)/a;
		}
		else if(b>a && b>c) {
			height = (2 * area)/b;
		}
		else {
			height = (2 * area)/c;
		}
		return(height);
	}
	
	//calculates and returns the circumcircle
	public double calcCircumcircle() {
		return(Math.pow((a*b*c)/(4*area), 2) * Math.PI);
	}	
}

