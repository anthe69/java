package by.epam.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		
		//Вычислить значение выражения по формуле (все переменные принимают
		//действительные значения):
		//	𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦
		//	----------- ∗ 𝑡𝑔 𝑥𝑦
		//	𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
			
		double x = 60;
		double y = 30;
		double r;
		
		r = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
				
		System.out.println("result = " + r);
		
	}	
}
