package homework2;

import java.util.Scanner;

public class H1 {

	public static void main(String[] args) {
		/*
		Swap islemini iki yoldan yaptiginiz java kodunu yaziniz.
		1.Yol: 3. degisken kullanarak 
		2.Yol: 3. degisken kullanmadan
		*/

		Scanner scan = new Scanner(System.in);
	    System.out.println("1.Sayiyi Giriniz : ");
	    int num1 = scan.nextInt();
	    System.out.println("2.Sayiyi Giriniz : ");
	    int num2 = scan.nextInt();

	    /*
        int takas = 0;
        
        System.out.println("Takastan Once");
        System.out.println("Deger 1 = "+ num1);
        System.out.println("Deger 2 = "+ num2);
         
        takas = num1;
        num1 = num2;
        num2 = takas;
        
        System.out.println("Takastan Sonra");
        System.out.println("Deger 1 = "+ num1);
        System.out.println("Deger 2 = "+ num2);
	    */
	   
	    
        System.out.println("Num1  kutusu : " + num1 + "\tNum2 kutusu :" + num2);
      
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("------------------------------------------");
        
        System.out.println("Num1  kutusu : " + num1 + "\tNum2 kutusu :" + num2);
         
        scan.close();
    }
}
		
		
		
		
		

