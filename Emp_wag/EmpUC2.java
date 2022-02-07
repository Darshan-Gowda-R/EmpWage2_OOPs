public class EmpUC2{

	public static final int EMP_WAGE_PER_HOUR = 20;
	public static final int EMP_DAY_WORK = 8;
	public static final int EMP_PRESENT = 1;
	public static final int EMP_ABSENT = 1;

	public static void main(String[] args){

		int empCheck=(int)Math.floor(Math.random()*10)%2;

		if(empCheck == EMP_PRESENT)
			System.out.println("Employee wage : " + EMP_WAGE_PER_HOUR*EMP_DAY_WORK);
		else
			System.out.println("Employee WAGE : 0" );
	}
}







