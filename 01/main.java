//Putu Yoga Era Subakti
//E1700879

public class main {
	public static void main(String args[]) {
	
		//double amount=10.00;
		//double amount2=70.00;
		
		int surveyTime = 5;
		
		if(surveyTime == 3){
			System.out.println(3*10.00);
		}
		else if(surveyTime == 5) {
			System.out.println(1*70.00);
		}
		else if(surveyTime == 7) {
			System.out.println(1*90.00);
		}
		else if(surveyTime == 10) {
			System.out.print(2*140.00);
		}
		else if(surveyTime == 11) {
			System.out.println(2*70.00+1*10.00);
		}
		else if(surveyTime == 14) {
			System.out.println(2*70.00+4*10.00);
		}
		else if(surveyTime == 15) {
			System.out.println(3*70.00);
		}
		else {
			System.out.println("Valid Survey Done");
		}	
	}
}