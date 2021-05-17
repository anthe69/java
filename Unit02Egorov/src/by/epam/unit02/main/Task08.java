package by.epam.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		
		//Для данных областей составить линейную программу, которая печатает true,
		//если точка с координатами (х, у) принадлежит закрашенной области, и false —
		//в противном случае:
		
		int x = 1;
		int y = 2;
		boolean r;
		
		if((x >= -2 && x <= 2) && (y >= 0 && y <= 4)) {
			r = true;
		} else if((x >= -4 && x <= 4) && (y >= -3 && y <= 0)) {
			r = true;
		} else {
			r = false;
		}
		
		System.out.println("result = " + r);
		
	}	
}
