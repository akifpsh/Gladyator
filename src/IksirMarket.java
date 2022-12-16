import java.util.Scanner;

public class IksirMarket extends Market{
    public IksirMarket(Kahraman kahraman) {
        super(kahraman);
    }
private Kahraman kahraman;
    
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
                kahraman.getPot();
                WelcomeMenu();
                break;
            case 2:
                IksirSatinAl();
                WelcomeMenu();
                break;
            case 3:
                System.out.println("Markete Donuyosun.");
                break;
            default:
                WelcomeMenu();
                break;
        }
       
    }

    private void IksirSatinAl() {
        System.out.println(this.kahraman.getPara());
        this.kahraman.setPara(kahraman.getPara()-50);
        this.kahraman.setPot(kahraman.getPot()+1);
        WelcomeMenu();
    }
    
}
