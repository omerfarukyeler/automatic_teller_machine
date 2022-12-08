package automatic_teller_machine;

import java.util.Scanner;

public class atm {
	
public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
			
		
		int bakiye = 1000 ;
		boolean cekme = true ;
		boolean yatırım = true ;
		boolean sifre_3 = true ; 
		int islem ;
		int miktar  ;
		int sifre_giris = 3 ;
		System.out.println("lutfen sifrenizi giriniz...");
		int sifre =scan.nextInt();
		while ( sifre_giris > 0 ) {
		
		if(sifre == 1234) {
			System.out.println("giris yapiliyor...");
		
		
		
		System.out.println("1:Bakiye goruntuleme ");
		System.out.println("2:Para yatirma");
		System.out.println("3:Para cekme  ");
		System.out.println("4:Cikis yapiliyor... ");
		
		islem = scan.nextInt();
		
		
		
		
		switch(islem) {
			case 1 :
				System.out.println("Bakiyeniz" + bakiye + "tl dir");
				break ;
			case 2 :		
				
				
				while(yatırım) {
					System.out.println("Ne kadar yatiracaksiniz :");
					miktar = scan.nextInt();
				
				if (miktar>=15000) {
					System.out.println("bu miktar yatirilamaz ");
					
				}else {
					bakiye +=miktar ;
				System.out.println("bakiyeniz" + bakiye + "tl dir");
				yatırım = false ;
				
				
									
				}
				
				} 			
				
				
				break ;
			case 3 :
				System.out.println("Ne kadar cekeceksiniz :");
				miktar = scan.nextInt();
				while (cekme) {
				
					if(miktar<=bakiye) {
					
					bakiye -=miktar;
					cekme = false ;
					
					System.out.println(" kalan bakiye "  + bakiye );
				}else {
				
					
					
					
					
					System.out.println("yetersiz bakiye "+"tekrar miktar giriniz");
					miktar =scan.nextInt();
					}
					
					
				}										
				
				break ;
			case 4 :
				System.out.println("Sistemden cikiliyor ...");
				break;
			default :
				System.out.println("Gecersiz islem");
				break ;
			

		}
		
		} else {
			
			
				
			if(sifre_giris > 1) {
				
				sifre_giris-= 1;
				
				System.out.println("yanlis sifre girdiniz .Tekrar giriniz ...Kalan hakkınız : " + sifre_giris);
				
				sifre = scan.nextInt() ;}
			else{
				
				
				
				System.out.println("giris hakkınız bitti... kartiniza el konuldu.");
				
				break ;
			}
				
				
				
				
				
			
				
			}
			
			
		
			
			
			}

}
}

