package khtn.edu;

import java.util.Scanner;

public class exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isnumber("dddddd"));
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a");
		String soa = sc.nextLine();
//		isnumber(soa);
		System.out.println("nhap b");
		String sob = sc.nextLine();
//		isnumber(sob);
		if(isnumber(soa) == true && isnumber(sob) == true){
			int a = Integer.parseInt(soa);
			int b = Integer.parseInt(sob);
			try {
				System.out.println(chia2so(a, b));
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println("loi " + e.getMessage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static boolean isnumber(String so){
		try {
			
			int so1 = Integer.parseInt(so);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("loi " + e.getMessage());
			return false;
		}
	}
	public static double chia2so( int a, int b) throws ArithmeticException,Exception{
		if(b==0){
			throw new ArithmeticException("loi chia cho 0");
		}
		return (double)a/b;
	}

}
