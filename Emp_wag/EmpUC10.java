import java.util.*;

public class EmpUC10{




	public static void main(String[] args){


	Scanner sc = new Scanner(System.in);
	     
	System.out.println("Enter the number of company data to be calculated : ");
	int num = sc.nextInt();
	
	Compute arr[] = new Compute[num];
	
	for(int i = 0 ; i < num ; i++ ){
	
		System.out.println("Enter the company name :");
		
		String name = sc.next();
		
		System.out.println("Enter Wage Pre Hour , Working Days and Total Working Hour");
	
		int wage = sc.nextInt();
		int days = sc.nextInt();
		int hour = sc.nextInt();
	
		EmpWageBuilder build = new EmpWageBuilder( name,wage,days,hour);
		Compute data = new Compute(build);
		
		data.computeEmployeeWage();
		
		arr[i] = data;
	
	}
	
	
	
	for(Compute data : arr){
		data.display();	
	
	}
	
	}



}


public class EmpWageBuilder{

	public int empWage = 0;
	public int workingDays = 0;
	public int workingHour = 0;
	public String name = ""; 
	EmpWageBuilder(String name , int empWage,int workingDays,int workingHour){
	
	this.name = name;
	this.empWage = empWage;
	this.workingDays = workingDays;
	this.workingHour = workingHour;
	
	}

}



public class Compute{


	public static  int EMP_WAGE_PER_HOUR = 0;
	public static  int EMP_PART_TIME_WORK = 4;
	public static  int EMP_DAY_WORK = 8;
	public static  final int EMP_PRESENT = 2;
	public static  final int EMP_ABSENT = 0;
	public static  final int EMP_PART_TIME= 1;
	public static  int DAYS = 0;
	public static  int TOTAL_HOURS = 0 ;
	public int totalWage=0;
	String NAME="";

	public  void computeEmployeeWage(){


		int  total=0;
		int  hours=0;
		for(int i=0 ; ( i <= DAYS && hours <= TOTAL_HOURS ) ; i++){

			int empCheck=(int)Math.floor(Math.random()*10)%3;

			switch(empCheck){

				case EMP_PRESENT:
					total += EMP_WAGE_PER_HOUR*EMP_DAY_WORK;
					hours += EMP_DAY_WORK;
					break;
				case EMP_PART_TIME:
					total += EMP_WAGE_PER_HOUR*EMP_PART_TIME_WORK;
					hours += EMP_PART_TIME_WORK;
					break;
				default :

			}


		}
		totalWage=total;
		
	}

	public Compute(EmpWageBuilder data){

	EMP_WAGE_PER_HOUR = data.empWage;
	DAYS = data.workingDays;
	TOTAL_HOURS = data.workingHour;
	NAME = data.name;

	}
	
	
	public void display(){
	
	System.out.println("The Total Wage earned by Employee in : "+NAME+" is : "+ totalWage);
	
	}



}

