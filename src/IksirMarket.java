import java.util.Scanner;

public class IksirMarket extends Market{
    //mevcut can ve iksir miktarlari kahramandan alinacaktir test icin gecici olarak olusturulmustur.
    //Kahraman kahraman;
    //private Kahraman kahraman;
   /*public kilicMarket(Kahraman kahraman){
        this.kahraman = kahraman;
        WelcomeMenu();
    }*/
    Scanner sc1=new Scanner(System.in);

    @Override
    public void WelcomeMenu() {
        System.out.println("Iksir Markete Hos Geldiniz");
        System.out.println("Ne Yapmak Istersiniz ?");
        System.out.println("1-->Iksirleri Goruntule");
        System.out.println("2-->Iksir Satin Al");
        System.out.println("3-->Markete Geri Don");
        
        int secim=sc1.nextInt();
        switch(secim){
            case 1:

            case 2:
                //IksirSatinAl();
                break;
            case 3:
                System.out.println("Markete Donuyosun.");
                break;
            default:
                System.out.println("mal 1-2-3 Sayılarından Birini Gir.");
                WelcomeMenu();
                break;
        }
       WelcomeMenu();
    }

    /*private void IksirSatinAl() {
        System.out.println(this.kahraman.getPara);
        System.out.println(MevcutIksir);
        this.kahraman.setPara(-50);
        this.kahraman.setMevcutIksir++;
        WelcomeMenu();
    }*/
    
}
