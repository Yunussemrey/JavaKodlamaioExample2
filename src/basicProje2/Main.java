package basicProje2;

public class Main {

	public static void main(String[] args) {
		
		//asal sayı bulma projesi
		
		int sayı=-1;
		
		//özel durumlar
		if(sayı<=1) {
			System.out.println(sayı +": Sayı asal sayı kuralları kapsamında geçersizdir!");
			return;
		}
		
		
		boolean asalMı=true;
		
		for(int i=2;i<sayı;i++) {
			if(sayı % i ==0) {
				asalMı=false;
			}
		}
		
		if(asalMı) {
			System.out.println(sayı +": Asal sayıdır!");
		}else {
			System.out.println(sayı +": Asal değildir! ");
		}
		
		
		
		
		
		
		
		
		
	}
		

}
