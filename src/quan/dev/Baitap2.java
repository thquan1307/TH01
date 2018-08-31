package quan.dev;

import java.util.Scanner;

public class Baitap2 {
	public static long giaiThua(int n) {
   	 if(n > 1) {
   		 return n * giaiThua(n - 1);
   	 }
   	 else
   		return 1; 
    }
   public static void main(String[] agrs) {
   	Scanner sc = new Scanner(System.in);
   	System.out.println("Nhap n:");
   	int n= sc.nextInt();
   	sc.close();
   	System.out.println("Giai thua cua "+n+" la: "+giaiThua(n));
   }
}
