
import java.util.*;

public class EmpUC14{


	public static void main(String[] args){

	
	Scanner sc = new Scanner(System.in);
	     
	System.out.println("Enter the number of company data to be calculated : ");
	int num = sc.nextInt();
	
	ArrayList <Compute> arr = new ArrayList<Compute>();
	
	for(int i = 0 ; i < num ; i++ ){
	
		System.out.println("Enter the company name :");
		
		String name = sc.next();
		
		System.out.println("Enter Wage Pre Hour , Working Days and Total Working Hour");
	
		int wage = sc.nextInt();
		int days = sc.nextInt();
		int hour = sc.nextInt();
	
		Compute data = new Compute( name,wage,days,hour);
		data.computeEmployeeWage();
		
		arr.add(data);
	
	}
	int choice = 1;
	while(choice == 1){
	
	System.out.println("Enter 1 to get option to print 0 to exit : ");
	choice = sc.nextInt();
	if(choice == 1){
		System.out.println("Enter the name of company to display wage ");
		String name = sc.next();
	
			for(Compute data : arr){
				if(name.equals(data.Name))
					data.display();	
	
			}
	}
	else {
		choice = 0;
	}
	
	}
	
	

	
	}


}







interface  EmpWageBuilder{

	int EMP_PRESENT = 2;
	int EMP_ABSENT = 0;
	int EMP_PART_TIME= 1;
	int FULLTIME = 8;
	int PARTTIME = 4;

	public void computeEmployeeWage();
	public void display();	

}



public class Compute implements EmpWageBuilder{


	int empWage = 0;
	int workingDays = 0;
	int workingHour = 0;
	int total = 0 ;
	int totalWage = 0;
	String Name = "";
	int dailyWage[];

	public  void computeEmployeeWage(){


		int  hours=0;
		for(int i=0 ; ( i < workingDays && hours < workingHour ) ; i++){

			int empCheck=(int)Math.floor(Math.random()*10)%3;

			switch(empCheck){

				case EMP_PRESENT:
					total += empWage * FULLTIME;
					hours += FULLTIME;
					dailyWage[i] = empWage * FULLTIME;
					break;
				case EMP_PART_TIME:
					total += empWage * PARTTIME;
					hours += PARTTIME;
					dailyWage[i] = empWage * PARTTIME;
					break;
				default :
					dailyWage[i] = 0;

			}


		}
		totalWage=total;
		
	}

	public Compute(String name,int empWage1,int workingDays1, int workingHour1 ){
	Name = name;
	empWage = empWage1;
	workingDays = workingDays1;
	workingHour = workingHour1;
	dailyWage = new int[workingDays];

	}

	public void display(){
	
	System.out.println("The Total Wage earned by Employee in : "+Name+" is : "+ total);
	
	//System.out.println("\nThe daily Wage's are : \n");
	//int count=0;
	//return ;
//	for (int i : dailyWage){
//		count++;
//		System.out.println("Day : "+count+" wage : "+ i);
	
//	}
	}


}

