package homework2;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import java.util.Random;

public class H2 {

	
	public static void main(String[] args) {
	 /*  Rastgele kullan�c� ad� olu�turan JAVA kodu yaz�n�z.
		 1. Ad�m : Kullan�c�dan ismini isteyelim
	     2. Ad�m : Kullan�c� ad�ndaki bo�luklar� silelim.
		 3. Ad�m : Kullan�c� ad�n�n al�nabilir olup olmad���na bakal�m.
		 4. Ad�m : E�er bizim listemizde �yle bir kullan�c� ad� yoksa kullan�c� ad�, kullan�c�n�n girdi�i isim olsun.
		 5. Ad�m : E�er bu kullan�c� ad� zaten varsa, sonuna rastgele say� olu�turup ekleyelim, ve g�sterelim.
			List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
			veritabanindakiKullaniciListesi.add("Ahmet");
			veritabanindakiKullaniciListesi.add("Ay�e");
			veritabanindakiKullaniciListesi.add("S�leyman");
			veritabanindakiKullaniciListesi.add("Nazmi");
	 */

		
		List<String> vTKL = new ArrayList<>();
		
		vTKL.add("Ahmet");
		vTKL.add("Ay�e");
		vTKL.add("S�leyman");
		vTKL.add("Nazmi");
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("L�tfen bir kullan�c� ad� giriniz");
        
        Random random = new Random();
        
        int sayi = random.nextInt();
        
		String str1;
		
        str1 = scan.nextLine();
        
        String str2 = str1.replace(" ","");
        
        if (!vTKL.contains(str2)) {
        	System.out.println("Kullan�c� ad�n�z: "+str2);
		} else {
			System.out.println("Girdi�iniz kullan�c� ad� daha �nce kullan�ld��� i�in: "+str2+sayi);
		}

        
        
        scan.close();
	}

}

