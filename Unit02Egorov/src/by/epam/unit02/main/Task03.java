package by.epam.unit02.main;

public class Task03 {

	public static void main(String[] args) {
		
		//Дано натуральное число Т, которое представляет длительность прошедшего
		//времени в секундах. Вывести данное значение длительности в часах, минутах
		//и секундах в следующей форме:
		//ННч ММмин SSc.

		int t = 3661;
		int hh;
		int mm;
		int ss;
		
		hh = t / 60 / 60;
		mm = (t / 60) % 60;
		ss = t % 60;
		
		System.out.println("result = " + hh + "ч " + mm + "мин " + ss + "с");
		
	}	
}
