
public class EmpUC8{




	public static void main(String[] args){

	int Dmart_wage=25 , Dmart_days=22 , Dmart_hour = 110;
	int Mmart_wage = 20 , Mmart_days = 20 , Mmart_hour = 100;


	Compute Dmart = new Compute( Dmart_wage,Dmart_days,Dmart_hour);
	Compute Mmart = new Compute( Mmart_wage,Mmart_days,Mmart_hour);

	int result_Dmart = Dmart.computeEmployeeWage();
	int result_Mmart = Mmart.computeEmployeeWage();

	System.out.println("The Total Wage earned by Employee in DMART is : "+ result_Dmart);
	System.out.println("The Total Wage earned by Employee in MMART is : "+ result_Mmart);

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


	public  int computeEmployeeWage(){


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
		
		return total;

	}

	public Compute(int wage_hour, int work_days, int total_hour){

	EMP_WAGE_PER_HOUR = wage_hour;
	DAYS = work_days;
	TOTAL_HOURS = total_hour;


	}




}

