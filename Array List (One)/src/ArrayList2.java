import java.util.ArrayList;

public class ArrayList2
{

	public static void main(String[] args) 
	{
//		exercise1();
//		exercise2();
		exercise3();
//		exercise4();
//		exercise5();
//		exercise6();
	}

	public static void exercise1()
	{
		ArrayList<Double>bodyTemp = new ArrayList <Double>();
	}
	
	public static void exercise2()
	{
		ArrayList<Double>bodyTemp = new ArrayList <Double>();
			
			bodyTemp.add(96.7); //No fever
			bodyTemp.add(100.0); //fever
			bodyTemp.add(107.7); //fever
			bodyTemp.add(97.5); //no fever
			bodyTemp.add(98.6); //no fever
			bodyTemp.add(99.6); //fever
			bodyTemp.add(110.8);//fever
			bodyTemp.add(92.9);//no fever
			bodyTemp.add(95.8); //no fever
			bodyTemp.add(101.5); // fever
			
			for(int i = 0; i < bodyTemp.size(); i++)
				{
					System.out.println(bodyTemp.get(i) + " degrees Fahrenheit");
					
				}
	}
			
			
		public static void exercise3()
		{
			ArrayList<Double>bodyTemp = new ArrayList <Double>();
			
			bodyTemp.add(96.7); //No fever
			bodyTemp.add(100.0); //fever
			bodyTemp.add(107.7); //fever
			bodyTemp.add(97.5); //no fever
			bodyTemp.add(98.6); //no fever
			bodyTemp.add(99.6); //fever
			bodyTemp.add(110.8);//fever
			bodyTemp.add(92.9);//no fever
			bodyTemp.add(95.8); //no fever
			bodyTemp.add(101.5); // fever
			
			int feverCounter = 0;
			
		for(int i = 10; i <= bodyTemp.size()-1; i--)
			{
			if(bodyTemp.get(i) > 98.6)
				{
					System.out.println(bodyTemp.get(i));
					feverCounter++;
					bodyTemp.remove(i);

				}
			}
			System.out.println(feverCounter + " people have a fever!");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
