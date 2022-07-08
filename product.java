package Billing_System_Advance;

import java.util.Scanner;

public class product {
	void getData() {
		product p=new product();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Shop Name: ");
		String name=sc.nextLine();
		
		char n='N';
		int ProductPrice[]= new int[n];
		String ProductName[]=new String[n];
		
		int i=0;
		System.out.println("Enter Product Name: ");
		ProductName[i]=sc.next();
		System.out.println("Enter " +ProductName[i]+" Price: ");
		ProductPrice[i]=sc.nextInt();

		for(int j=0;j<=1000;j++) {
		char Q;
		System.out.println("Add more Product Y/N: ");
		Q=sc.next().charAt(0);
		if(Q=='Y'|| Q=='y') {
			
		System.out.println("Enter Product Name: ");
		ProductName[i+1]=sc.next();
		System.out.println("Enter " +ProductName[i+1]+" Price: ");
		ProductPrice[i+1]=sc.nextInt();
		
		i++;
		}else  {
		j=1000;
			}
		}
		float total=0;
		for(int m=0;m<=i;m++) {
			System.out.print((m+1)+"."+ProductName(ProductName[m]));
			System.out.println("- "+ProductPrice(ProductPrice[m])+"/-");
			total=total+ProductPrice[m];
			}
		
		float gst ;
		System.out.println("Add GST: (Y/N)");
		char s=sc.next().charAt(0);

			if(s=='y' || s =='Y'){

			System.out.println("Enter Your GST %");
			gst=sc.nextFloat();

			 System.out.println("-------Bill Print--------");
				System.out.println("------"+name+"-------");
				for (int k=0;k<=i;k++) {
				System.out.println(k+1+"."+ProductName[k]+"- "+ProductPrice[k]+"/-");
				}
				
				System.out.println("--------------------------");
				
				System.out.println("GST ="+gst+"%");
				System.out.println("Total = "+total+"/-");
				System.out.println("GST price ="+(total*gst/100)+"/-");
				
				System.out.println("---------------------------");
				
				System.out.println("Grand Total ="+(total+(total*gst/100))+"/-");
		}else {
			
			System.out.println("-----------Bill Print-------");
			
			System.out.println("------"+name+"-------");
			for (int k=0;k<=i;k++) {
				System.out.println(k+1+"."+ProductName[k]+"- "+ProductPrice[k]+"/-");
				}
			System.out.println("Grand total= "+total+"/-");
		}
	}

	String ProductName(String name) {
		return name;
	}
	int ProductPrice(int price) {
		return price;
	}

}

