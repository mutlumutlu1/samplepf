package homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YesilMarket {
	
	public static List<String> urunler = new ArrayList<>(); // Global
	public static List<Double> fiyatlar = new ArrayList<>();
	
	public static List<String> sepetUrunler = new ArrayList<>();
	public static List<Double> sepetKg = new ArrayList<>();
	public static List<Double> sepetFiyatlar = new ArrayList<>();
	
	public static double sepetToplam=0;
	
	public static void main(String[] args) {
		/* Yeþil Market alýþ-veriþ programý.
         * 
         * 1. Adým: Ürünler ve fiyatlarý içeren listeleri oluþturunuz.
         *          No      Ürün         Fiyat
                  ====  =======        =========
                    00   Domates       2.10 TL 
                    01   Patates       3.20 TL
                    02   Biber         1.50 TL
                    03   Soðan         2.30 TL
                    04   Havuç         3.10 TL
                    05   Elma          1.20 TL
                    06   Muz           1.90 TL
                    07   Çilek         6.10 TL
                    08   Kavun         4.30 TL
                    09   Üzüm          2.70 TL
                    10   Limon         0.50 TL
                    
         * 2. Adým: Kullanýcýnýn ürün nosuna göre listeden ürün seçmesini isteyiniz.
         * 3. Adým: Kaç kg satýn almak istediðini sorunuz.
         * 4. Adým: Alýnacak bu ürünü sepete ekleyiniz ve Sepeti yazdýrýnýz.
         * 5. Baþka bir ürün alýp almak istemediðini sorunuz.
         * 6. Eðer devam etmek istiyorsa yeniden ürün seçme kýsmýna yönlendiriniz.
         * 7. Eðer bitirmek istiyorsa ödeme kýsmýna geçiniz ve ödem sonrasýnda programý bitirinzi.
         */
		Scanner scan = new Scanner(System.in);
		urunler.addAll(Arrays.asList("Domates","Patates","Biber","Soðan", "Havuc",
				                     "Elma","Muz","Çilek","Kavun","Üzüm","Limon"));
		fiyatlar.addAll(Arrays.asList(2.1, 3.2, 1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));
		
		urunListele();
		
		int a=0;
		do {
			System.out.println("Urununuzu Numaraya Gore seciniz:");
			int urunNo = scan.nextInt();
			System.out.println("Kac kg istiyorsunuz?");
			double kg = scan.nextDouble();
			
			sepeteEkle(urunNo, kg);
			sepetYazdir();
			System.out.println("Alisverise devam etmek istiyor musunuz?E/H");
			char devam = scan.next().toLowerCase().charAt(0);
			if(devam=='h') {
				a=1;
			}
		} while (a==0);
		
		odeme();
		
		scan.close();
	}
	
	private static void odeme() {
		for (int i = 0; i < sepetUrunler.size(); i++) {
			sepetToplam += sepetFiyatlar.get(i);
		}
		System.out.println("Toplam Tutar : " + sepetToplam + " TL");
		
	}
	
	public static void sepetYazdir() {
		System.out.println("No\tUrunler \tFiyatlar");
		System.out.println("===\t======= \t========");
		
		for (int i = 0; i < sepetUrunler.size(); i++) {
			System.out.println(sepetUrunler.get(i) +"\t" + sepetKg.get(i) + "\t \t   " + sepetFiyatlar.get(i));
		}
		
	}
	
	public static void sepeteEkle(int urunNo, double kg) {
		sepetUrunler.add(urunler.get(urunNo));
		sepetKg.add(kg);
		sepetFiyatlar.add(fiyatlar.get(urunNo) * kg);
	}
	
	public static void urunListele() {
		System.out.println("No\tUrunler \tFiyatlar");
		System.out.println("===\t======= \t========");
		
		for (int i = 0; i < urunler.size(); i++) {
			System.out.println(" " + i +"\t" + urunler.get(i) + "\t \t   " + fiyatlar.get(i));
		}
		System.out.println("Mutlu");
		System.out.println("Ahmet"); //yeni kod
		System.out.println("Ayşe");

		System.out.println("Akif");

		System.out.println("zeynep");

		
		
		
		System.out.println("akahaha");
	System.out.println("sarı");
	System.out.println("Mutlu Branchinde yazd���m kodlar 115");
	System.out.println("Mutlu Branchinde yazd���m kodlar 116");
	System.out.println("Mutlu Branchinde yazd���m kodlar 117");

	}
}
