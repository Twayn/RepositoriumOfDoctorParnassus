/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadeq;
import java.util.*; 
/**
 *
 * @author Андрей
 */
public class QuadEq {
    static float a, b, c;
    static float d;
    static double x1=0, x2=0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);//

System.out.println ("This is program for solving quadratic equations as Ax^2+Bx+C=0; A,B,C is Real.\n");
System.out.println ("Enter the coefficients of quadratic equation:");

System.out.println ("Enter the 'A' value:");
a = sc.nextFloat();
System.out.println ("Enter the 'B' value:");
b = sc.nextFloat();
System.out.println ("Enter the 'C' value:");
c = sc.nextFloat();

if (a==0) 
{
System.out.println ("Invalid coefficient");
System.exit(2);
}

System.out.println ("The equation is: "+a+"x^2+"+b+"x+"+c);


d = (b * b) - (4 * a * c); 
System.out.println ("Discriminant is "+d);

if (d<0) System.out.println ("The equation has no real roots");
  else
  if (d==0)
    {
	  x1=(-b)/(2*a);
	  System.out.println ("x1 is "+x1+"; x2 is "+x1);
	}
    else
      {
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
		System.out.println ("x1 is "+x1+"; x2 is "+x2);
	  }

sc.close();

    }
    
}
