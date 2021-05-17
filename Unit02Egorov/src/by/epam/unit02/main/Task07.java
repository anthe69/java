package by.epam.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		
		//Даны три действительных числа. Возвести в квадрат те из них, значения
		//которых неотрицательны, и в четвертую степень — отрицательные.

		double a = 5;
		double b = -4;
		double c = -2;
		
		if(a > 0) {
			a = a*a;
		} else if(a < 0) {
			a = Math.pow(a, 4);
		}
		
		if(b > 0) {
			b = b*b;
		} else if(b < 0) {
			b = Math.pow(b, 4);
		}
		
		if(c > 0) {
			c = c*c;
		} else if(c < 0) {
			c = Math.pow(c, 4);
		}		
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}	
}
