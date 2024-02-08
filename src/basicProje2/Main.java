package basicProje2;

public class Main {

	public static void main(String[] args) {
		
		//asal sayı bulma projesi
		//kullanıcıdan alacağımız sayıyı tanımladık ve değer atadık..
		int sayı=5;
		
		//özel durumlar
		//asal sayı kurallarından
		if(sayı<=1) {
			System.out.println(sayı +": Sayı asal sayı kuralları kapsamında geçersizdir!");
			return; //return'un anlamı bu koddan aşağısı geçerli değil demek. burada ki koşulu sağlıyorsa sadece burayı döndürür daha alttaki kodları çalıştırmaz.
			
		}
		
		//asallık var mı yok mu kontrol etmek için 
		boolean asalMı=true;
		
		//asal sayı kuralları gereği 1ve kendisinden başka böleni var mı diye kontrol ediyoruz.
		for(int i=2;i<sayı;i++) {
			if(sayı % i ==0) { //varsa asalMı ifademiz false olsun.
				asalMı=false;
			}
		}
		
		//burada da asalMı ifademize göre sayının asallığını belirtiyoruz.
		if(asalMı) {
			System.out.println(sayı +": Asal sayıdır!");
		}else {
			System.out.println(sayı +": Asal değildir! ");
		}
		
		System.out.println("--------------");
		
		//tek - çift sayı projesi
		
		int a =5;
		
		boolean tekMi=true;
		
		if(a<0) {
			System.out.println(a +": sayımız negatif tam sayı olduğu için teklik çiftlik durumundan söz edilemez!");
			return;
		}
		
		if(a % 2==0) {
			tekMi=false;
		}else {
			tekMi=true;
		}
		
		if(tekMi) {
			System.out.println(a +": tek sayıdır.");
		}else {
			System.out.println(a +": çift sayıdır.");
		}
		
		System.out.println("----------------------");
		
		//ince - kalın sesli harf bulma
		
		//başka karakter girilmemesi için switch - case ile daha sağlıklı algoritma yapılabilir.
		char harf='A';
		
		boolean inceMi=true;
			
		
		char[] kalınHarfler= {'A','I','O','U'};
			
		
		for(int i=0;i<kalınHarfler.length;i++) {
			if(kalınHarfler[i]==harf) {
				inceMi=false;
			}
				
		}
			
		
		if(inceMi==true) {
			System.out.println(harf +": İnce sesli harftir.");
		}else if(inceMi==false) {
			System.out.println(harf +": Kalın sesli harftir.");
		}
		
		System.out.println("------------------");
		
		//dizi içinden istenen veriyi çekme
		
		int[] sayılar= {1,2,3,4,5,6};
		int istenen=5;
		boolean buldunMu=false;
		
		
			for(int sayı1:sayılar) {
			if(sayı1==istenen) {
				buldunMu = true;
				break;
				
			}
			
		}
			
		
		if(buldunMu) {
			System.out.println(istenen +" sayısı dizide var. ");
		}else {
			System.out.println(istenen+" sayısı dizide yok.");
		}
		
		
		
		
		
		
	}
		

}
