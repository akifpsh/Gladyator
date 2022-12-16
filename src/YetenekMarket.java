import java.security.DrbgParameters.NextBytes;
import java.text.BreakIterator;
import java.util.Scanner;

public class YetenekMarket extends Market{
    public YetenekMarket(Kahraman kahraman) {
        super(kahraman);
    }
private Kahraman kahraman;

    boolean SuYetenegi=false,AtesYetenegi=false;

    Scanner sc=new Scanner(System.in);

    private int secim;

    @Override
    public void WelcomeMenu() {
        System.out.println("YetenekMarkete Hos Geldiniz");
        System.out.println("Hangi Yetenegi Satin Almak İstersiniz ?");
        this.secim=sc.nextInt();
        switch(secim){
            case 1:
                SuYetenegi=true;
                AtesYetenegi=false;
                break;
            case 2:
                SuYetenegi=false;
                AtesYetenegi=true;
                break;
            }

    if(SuYetenegi==true){
        System.out.println("Hangi Su yeteniğini almak istersiniz");    
        System.out.println("Su Gorili --Canınız (100)arttı--  --Rakibe (50)hasar veren bir muz atarsınız");
        System.out.println("Yagmur  --Canınız (300)arttı--");
        System.out.println("Tsunami --Canınız (200)arttı--  --Rakibe (100)hasar veren bir dalga dönderirsiniz");
        this.secim=sc.nextInt();
        switch(secim){
            case 1:
                kahraman.setYetenekIsmi("Su Gorili");
                kahraman.setYetenekHasari(50); 
                kahraman.setCan(kahraman.getCan()+100);
                break;
            case 2:
            kahraman.setYetenekIsmi("Yagmur");
            kahraman.setCan(kahraman.getCan()+300);
                break;
            case 3:
            kahraman.setYetenekIsmi("Tsunami");
            kahraman.setYetenekHasari(200); 
            kahraman.setCan(kahraman.getCan()+200);
                break;
        }
    }   
    if(AtesYetenegi==true){
        System.out.println("Hangi Ateş yeteniğini almak istersiniz");    
        System.out.println("Alevli meyve tabağı --Canınız (50)arttı--  --Rakibe (100)hasar veren bir meyve tabağı gönderdiniz");
        System.out.println("Ateş topu --Rakibe (300)hasar verirsiniz--");
        System.out.println("Lava --Canınız (100)arttı--  --Rakibe (200)hasar veren bir lav dönderirsiniz");
        this.secim=sc.nextInt();
        switch(secim){
            case 1:
                kahraman.setYetenekIsmi("Alevli meyve tabağı");
                kahraman.setYetenekHasari(100); 
                kahraman.setCan(kahraman.getCan()+50);
                break;
            case 2:
                kahraman.setYetenekIsmi("Ateş topu");
                kahraman.setYetenekHasari(300); 
                break;
            case 3:
                kahraman.setYetenekIsmi("Lava");
                kahraman.setYetenekHasari(200); 
                kahraman.setCan(kahraman.getCan()+100);
                break;
        }
    } 

    }
}
