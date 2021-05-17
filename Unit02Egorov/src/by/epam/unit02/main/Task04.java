package by.epam.unit02.main;

public class Task04 {

	public static void main(String[] args) {
		
		//Вычислить расстояние между двумя точками с данными координатами
		//(х1, у1) и (x2, у2).
		
		int x1 = 4;
		int y1 = 9;
		int x2 = 3;
		int y2 = 1;
		double r;
		
		r = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		
		System.out.println("result = " + r);
		
	}	
}
