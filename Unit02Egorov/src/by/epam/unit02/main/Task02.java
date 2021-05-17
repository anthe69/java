package by.epam.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		
		//Перераспределить значения переменных х и у так, чтобы в х оказалось
		//большее из этих значений, а в y - меньшее.
		
		int x = 3;
		int y = 7;
		int temp;
		
		if(x < y) {
			temp = y;
			y = x;
			x = temp;
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}	
}
