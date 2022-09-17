//Name: Ahmet Yesilbas
//Project Name: Choose Your Adventure - Recommendation Website
//Date: 2/16/2022
//Project Description: Suggests the user a car depending on their preferences. 


import java.util.Random;
import javax.swing.JOptionPane;
public class RecommendationWebsite {
	public static void Question7() {
	String input;
	String car;
	int num;
	
	input = JOptionPane.showInputDialog(null, "Nice choice, Would you like a Japanese or German manufacterer? \nDo not enter anything if it doesn't matter. ");
	
	
	if(input.equalsIgnoreCase("japan")||input.equalsIgnoreCase("japanese")) {
		Random r = new Random();
		num=r.nextInt(20)+1;
		if(num%4==1) {
			car="Toyota Century";
		}
		
		else if(num%4==2) {
			car="Acura TLX";
		}
		
		else if(num%4==3) {
			car="Acura MDX";
		}
		
		else {
			car="Lexus ES";
		}
		JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
	}
	
	
	if(input.equalsIgnoreCase("german")||input.equalsIgnoreCase("japanese")) {
		Random r1 = new Random();
		num=r1.nextInt(20)+1;
		if(num%4==1) {
			car="BMW 7-Series";
		}
		
		else if(num%4==2) {
			car="Mercedes-Benz E-Class";
		}
		
		else if(num%4==3) {
			car="BMW 3-Series";
		}
		
		else {
			car="Mercedes-Benz C-Class";
		}
		JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
	}
	
	
	else if (input.equals("")) {
		int i;
        Random r2 = new Random();
        
		i=r2.nextInt(2);
		System.out.println(i);
		if (i==0) {
			JOptionPane.showMessageDialog(null, "Chose: Japanese manufacterer ");
			Random r3 = new Random();
			num=r3.nextInt(20)+1;
			if(num%4==1) {
				car="Toyota Century";
			}
			
			else if(num%4==2) {
				car="Acura TLX";
			}
			
			else if(num%4==3) {
				car="Acura MDX";
			}
			
			else {
				car="Lexus ES";
			}
			JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
			
			
		}
		else if (i==1) {
			JOptionPane.showMessageDialog(null, "Chose: German manufacterer");
			Random r11 = new Random();
			num=r11.nextInt(20)+1;
			if(num%4==1) {
				car="BMW 7-Series";
			}
			
			else if(num%4==2) {
				car="Mercedes-Benz E-Class";
			}
			
			else if(num%4==3) {
				car="BMW 3-Series";
			}
			
			else {
				car="Mercedes-Benz C-Class";
			}
			JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
		}
		
		
		
		else {
			JOptionPane.showMessageDialog(null, "Invalid input");
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void Question6() {
	String input;
	String car;
	int num;
	
	input = JOptionPane.showInputDialog(null, "Nice choice, Would you like a Japanese or German manufacterer? \nDo not enter anything if it doesn't matter. ");
	
	
	if(input.equalsIgnoreCase("japan")||input.equalsIgnoreCase("japanese")) {
		Random r = new Random();
		num=r.nextInt(20)+1;
		if(num%4==1) {
			car="Acura NSX";
		}
		
		else if(num%4==2) {
			car="Acura RLX Sport Hybrid";
		}
		
		else if(num%4==3) {
			car="Lexus GS 350";
		}
		
		else {
			car="Infiniti Q50";
		}
		JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
	}
	
	
	if(input.equalsIgnoreCase("german")||input.equalsIgnoreCase("japanese")) {
		Random r1 = new Random();
		num=r1.nextInt(20)+1;
		if(num%4==1) {
			car="Gumpert Apollo";
		}
		
		else if(num%4==2) {
			car="BMW i8";
		}
		
		else if(num%4==3) {
			car="Porsche 911";
		}
		
		else {
			car="Mercedes-AMG GT Black Series";
		}
		JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
	}
	
	
	else if (input.equals("")) {
		int i;
        Random r2 = new Random();
        
		i=r2.nextInt(2);
		System.out.println(i);
		if (i==0) {
			JOptionPane.showMessageDialog(null, "Chose: Japanese manufacterer ");
			Random r3 = new Random();
			num=r3.nextInt(20)+1;
			if(num%4==1) {
				car="Acura NSX";
			}
			
			else if(num%4==2) {
				car="Acura RLX Sport Hybrid";
			}
			
			else if(num%4==3) {
				car="Lexus GS 350";
			}
			
			else {
				car="Infiniti Q50";
			}
			JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
			
			
		}
		else if (i==1) {
			JOptionPane.showMessageDialog(null, "Chose: German manufacterer");
			Random r11 = new Random();
			num=r11.nextInt(20)+1;
			if(num%4==1) {
				car="Gumpert Apollo";
			}
			
			else if(num%4==2) {
				car="BMW i8";
			}
			
			else if(num%4==3) {
				car="Porsche 911";
			}
			
			else {
				car="Mercedes-AMG GT Black Series";
			}
			JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
		}
		
		
		
		else {
			JOptionPane.showMessageDialog(null, "Invalid input");
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Question5() {
	String input;
	String car;
	int num;
	
	input = JOptionPane.showInputDialog(null, "Nice choice, Would you like a Japanese or German manufacterer? \nDo not enter anything if it doesn't matter. ");
	
	
	if(input.equalsIgnoreCase("japan")||input.equalsIgnoreCase("japanese")) {
		Random r = new Random();
		num=r.nextInt(20)+1;
		if(num%4==1) {
			car="Acura MDX";
		}
		
		else if(num%4==2) {
			car="Toyota RAV4";
		}
		
		else if(num%4==3) {
			car="Lexus NX";
		}
		
		else {
			car="Mazda CX-5";
		}
		JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
	}
	
	
	if(input.equalsIgnoreCase("german")||input.equalsIgnoreCase("japanese")) {
		Random r1 = new Random();
		num=r1.nextInt(20)+1;
		if(num%4==1) {
			car="BMW M4";
		}
		
		else if(num%4==2) {
			car="Audi R8";
		}
		
		else if(num%4==3) {
			car="BMW Z4";
		}
		
		else {
			car="BMW i8 ";
		}
		JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
	}
	
	
	else if (input.equals("")) {
		int i;
        Random r2 = new Random();
        
		i=r2.nextInt(2);
		System.out.println(i);
		if (i==0) {
			JOptionPane.showMessageDialog(null, "Chose: Japanese manufacterer ");
			Random r3 = new Random();
			num=r3.nextInt(20)+1;
			if(num%4==1) {
				car="Acura MDX";
			}
			
			else if(num%4==2) {
				car="Toyota RAV4";
			}
			
			else if(num%4==3) {
				car="Lexus NX";
			}
			
			else {
				car="Mazda CX-5";
			}
			JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
			
			
		}
		else if (i==1) {
			JOptionPane.showMessageDialog(null, "Chose: German manufacterer");
			Random r11 = new Random();
			num=r11.nextInt(20)+1;
			if(num%4==1) {
				car="Audi SQ5";
			}
			
			else if(num%4==2) {
				car="BMW X7";
			}
			
			else if(num%4==3) {
				car="Mercedes-Benz GLC-Class";
			}
			
			else {
				car="Porsche Cayenne";
			}
			JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
		}
		
		
		
		else {
			JOptionPane.showMessageDialog(null, "Invalid input");
		}
	}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Question4() {
	String input;
	String car;
	int num;
	
	input = JOptionPane.showInputDialog(null, "Nice choice, Would you like a Japanese or German manufacterer? \nDo not enter anything if it doesn't matter. ");
	
	
	if(input.equalsIgnoreCase("japan")||input.equalsIgnoreCase("japanese")) {
		Random r = new Random();
		num=r.nextInt(20)+1;
		if(num%4==1) {
			car="Toyota Supra";
		}
		
		else if(num%4==2) {
			car="Mazda Miata";
		}
		
		else if(num%4==3) {
			car="Nissan GTR";
		}
		
		else {
			car="Nissan 350Z";
		}
		JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
	}
	
	
	if(input.equalsIgnoreCase("german")||input.equalsIgnoreCase("japanese")) {
		Random r1 = new Random();
		num=r1.nextInt(20)+1;
		if(num%4==1) {
			car="BMW M4";
		}
		
		else if(num%4==2) {
			car="Audi R8";
		}
		
		else if(num%4==3) {
			car="BMW Z4";
		}
		
		else {
			car="BMW i8";
		}
		JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
	}
	
	
	else if (input.equals("")) {
		int i;
        Random r2 = new Random();
        
		i=r2.nextInt(2);
		System.out.println(i);
		if (i==0) {
			JOptionPane.showMessageDialog(null, "Chose: Japanese manufacterer ");
			Random r3 = new Random();
			num=r3.nextInt(20)+1;
			if(num%4==1) {
				car=" Toyota Supra";
			}
			
			else if(num%4==2) {
				car="Mazda Miata";
			}
			
			else if(num%4==3) {
				car="Nissan GTR";
			}
			
			else {
				car="Nissan 350Z";
			}
			JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
			
			
		}
		else if (i==1) {
			JOptionPane.showMessageDialog(null, "Chose: German manufacterer");
			Random r11 = new Random();
			num=r11.nextInt(20)+1;
			if(num%4==1) {
				car="BMW M4";
			}
			
			else if(num%4==2) {
				car="Audi R8";
			}
			
			else if(num%4==3) {
				car="BMW Z4";
			}
			
			else {
				car="BMW i8 ";
			}
			JOptionPane.showMessageDialog(null, "Great choice, we reccomend you the "+car);
		}
		
		
		
		else {
			JOptionPane.showMessageDialog(null, "Invalid input");
		}
	}

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Question3() {
	String input;
	input = JOptionPane.showInputDialog(null, "What type of car would you like? (Exotic/Sedan) \nDo not enter anything if you want a random choice. ");

	input=input.toUpperCase();
	switch (input) {
		case "EXOTIC":
		System.out.println("exo");
		Question6();
		break;
		
		case "SEDAN":
		System.out.println("sedan");
		Question7();
		break;
		
		case "":
			int i;
	        Random r = new Random();
	        
			i=r.nextInt(2);
			System.out.println(i);
			if (i==0) {
				JOptionPane.showMessageDialog(null, "Chose: Exotic Car");
				Question6();

				
			}
			else if (i==1) {
				JOptionPane.showMessageDialog(null, "Chose: Sedan Car");
				Question7();

				
			}
		break;
		
		default:
			JOptionPane.showMessageDialog(null, "Invalid input!");
	}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Question2() {
	String input;
	input = JOptionPane.showInputDialog(null, "What type of car would you like? (Sport/SUV) \nDo not enter anything if you want a random choice. ");
//	if (input.equalsIgnoreCase("sport")||input.equalsIgnoreCase("sports")) {
//		Question4();
//	}
	input=input.toUpperCase();
	switch (input) {
		case "SPORT":
		Question4();
		break;
		
		case "SUV":
		Question5();
		break;
		
		case "":
			int i;
	        Random r = new Random();
	        
			i=r.nextInt(2);
			System.out.println(i);
			if (i==0) {
				JOptionPane.showMessageDialog(null, "Chose: Sports Car");
				Question4();
				
			}
			else if (i==1) {
				JOptionPane.showMessageDialog(null, "Chose: SUV");
				Question5();
				
			}
		break;
		
		default:
			JOptionPane.showMessageDialog(null, "Invalid input!");
	}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Question1() {
		String input;

		input = JOptionPane.showInputDialog(null, "How much are you willing to spend on your car? (Put in numbers without commas please)");
		
		int q1 = Integer.parseInt(input);
		if (q1>0) {
		 if(q1>50000) {
			Question3();
		}
		 else if(q1<50000 && q1>0) {
			 Question2();
		 }
		 else {
		 }
		}
			else {

			System.err.println("Invalid number! There are no cars for: $"+q1);

		}	

	}
	
	
	
	
	
	
	
	
	
	
public static void main(String args[]) {
	JOptionPane.showMessageDialog(null, "Welcome, this is a car suggester that will suggest cars depending on your choices.");
	Question1();
}
}
