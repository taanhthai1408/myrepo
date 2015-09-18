package khtn.edu.main;

import java.util.Scanner;

import khtn.edu.tooldex;
import khtn.edu.toyoungex;
import khtn.edu.ut.exut;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	System.out.println("nhap vao so tuoi");
		int age = sc.nextInt();
		try {
			exut.checkage(age);
			System.out.println("wecame");
		} catch (toyoungex e) {
			// TODO Auto-generated catch block
			System.out.println("sorry "+ e.getMessage());
			
		} catch (tooldex e) {
			// TODO Auto-generated catch block
			System.out.println("sorry "+ e.getMessage());
		}finally{
			sc.close();
		}
	}

}
