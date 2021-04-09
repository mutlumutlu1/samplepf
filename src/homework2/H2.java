package homework2;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import java.util.Random;

public class H2 {

	
	public static void main(String[] args) {
	 /*  Rastgele kullanýcý adý oluþturan JAVA kodu yazýnýz.
		 1. Adým : Kullanýcýdan ismini isteyelim
	     2. Adým : Kullanýcý adýndaki boþluklarý silelim.
		 3. Adým : Kullanýcý adýnýn alýnabilir olup olmadýðýna bakalým.
		 4. Adým : Eðer bizim listemizde öyle bir kullanýcý adý yoksa kullanýcý adý, kullanýcýnýn girdiði isim olsun.
		 5. Adým : Eðer bu kullanýcý adý zaten varsa, sonuna rastgele sayý oluþturup ekleyelim, ve gösterelim.
			List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
			veritabanindakiKullaniciListesi.add("Ahmet");
			veritabanindakiKullaniciListesi.add("Ayþe");
			veritabanindakiKullaniciListesi.add("Süleyman");
			veritabanindakiKullaniciListesi.add("Nazmi");
	 */

		
		List<String> vTKL = new ArrayList<>();
		
		vTKL.add("Ahmet");
		vTKL.add("Ayþe");
		vTKL.add("Süleyman");
		vTKL.add("Nazmi");
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Lütfen bir kullanýcý adý giriniz");
        
        Random random = new Random();
        
        int sayi = random.nextInt();
        
		String str1;
		
        str1 = scan.nextLine();
        
        String str2 = str1.replace(" ","");
        
        if (!vTKL.contains(str2)) {
        	System.out.println("Kullanýcý adýnýz: "+str2);
		} else {
			System.out.println("Girdiðiniz kullanýcý adý daha önce kullanýldýðý için: "+str2+sayi);
		}

        
        
        scan.close();
	}

}

