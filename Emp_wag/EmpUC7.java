public class EmpUC7{

	public static final int EMP_WAGE_PER_HOUR = 20;
	public static final int EMP_PART_TIME_WORK = 4;
	public static final int EMP_DAY_WORK = 8;
	public static final int EMP_PRESENT = 2;
	public static final int EMP_ABSENT = 0;
	public static final int EMP_PART_TIME= 1;
	public static final int DAYS = 20;
	public static final int TOTAL_HOURS = 100;



	public static int computeEmployeeWage(){


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



	public static void main(String[] args){

	int result = computeEmployeeWage();
	System.out.println("The Total Wage earned by Employee : "+ result);

	}
}






