package quan.dev;

import java.util.Scanner;

public class Baitap {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so: ");
		n = sc.nextInt();
		if(n > 0)
		{
			if (kiemTraSoNguyenTo(n)==1)
				System.out.println(n+ " la so nguyen to");
			else
				System.out.println(n+ " Khong phai la so nguyen to");
		}
	}
	public static int kiemTraSoNguyenTo(int n) {
	   int count = 0;
	   for(int i = 1; i <= n; i++)
	   {
		   if(n%i == 0)
			   count++;
	   }
	   if (count == 2)
		   return 1;
	   else return 0;
	}
}