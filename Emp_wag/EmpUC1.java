public class EmpUC1{

	public static final int EMP_PRESENT=1;
	public static final int EMP_ABSENT=0;

	public static void main(String[] args){

		int empCheck=(int)Math.floor(Math.random()*10)%2;

		if(empCheck == EMP_PRESENT)
			System.out.println("Employee Is Present  ");
		else
			System.out.println("Employee Is Absent" );
	}
}







