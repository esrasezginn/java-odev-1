
public class HelloWorld {
	public static void main(String[] args) {
		// Ödev 1. hafta
		System.out.println("Merhaba Java");
		System.out.println("Merhaba Java 2");

		int ogrenciSayisi = 12;
		String mesaj = "Öğrenci sayısı: ";

		System.out.println("mesaj : " + ogrenciSayisi);
		System.out.println("mesaj : " + ogrenciSayisi);
		System.out.println("mesaj : " + ogrenciSayisi);
		System.out.println("mesaj : " + ogrenciSayisi);
		System.out.println("mesaj : " + ogrenciSayisi);

		double sayi = 12.5;
		sayi = -129;
		char karakter = 'A';
		boolean dogruMu = false;

		int sayii = 29;
		if (sayii < 20) {
			System.out.println("Sayı 20 den küçüktür");
		} else if (sayii == 20) {
			System.out.println("Sayı 20 ye eşittir");
		} else {
			System.out.println("Sayı 20 den büyüktür");

			int sayiii1 = 255556;
			int sayiii2 = 25;
			int sayiii3 = 2;
			int enBuyuk = sayiii1;

			if (enBuyuk < sayiii2) {
				enBuyuk = sayiii2;
			}

			if (enBuyuk < sayiii3) {
				enBuyuk = sayiii3;

			}
			System.out.println("En büyük =" + enBuyuk);
		}
		// switch blokları bir değere göre nasıl aktivsyon yapacağımız bloklar
		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena deil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
			// Döngüler
			// for döngüsü
		}
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);

		}
		System.out.println("For Döngüsü bitti");
		// while döngüsü
		int i = 1;

		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Döngüsü Bitti");
		// Do-while döngüsü
		int j = 1;
		do {

			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do While Döngüsü Bitti");
       
	
	}
}
