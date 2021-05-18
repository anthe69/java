package by.epam.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		
		//Вычислить значение функции
		
		double x = -2;
		double r;
		
		if(x <= -3) {
			r = 9;
		} else {
			r = 1 / (x*x + 1);
		}
		
		System.out.println("result = " + r);
		
	}// Молодец!	
}
