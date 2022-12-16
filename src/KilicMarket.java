import java.util.Scanner;

public class KilicMarket extends Market{
   public KilicMarket(Kahraman kahraman) {
        super(kahraman);
    }
private Kahraman kahraman;


   Scanner sc=new Scanner(System.in);

    private int secim;
    
    @Override
    public void WelcomeMenu(){
        System.out.println("KilicMarkete Hos Geldiniz");
        System.out.println("Ne Satın Almak Istersiniz ?");
        System.out.println("1-->Taş kılıç   ATK: 130");
        System.out.println("2-->Demir kılıç ATK: 250");
        System.out.println("3-->Altın kılıç ATK: 400");
        System.out.println("4-->Elmas kılıç ATK: 750");
        System.out.println("5-->Markete Geri Don");

        this.secim=sc.nextInt();
        switch(secim){
            case 1:
                kahraman.setKilicIsmi("Tas");
                WelcomeMenu();
                break;
            case 2:
                kahraman.setKilicIsmi("Demir");
                WelcomeMenu();
                break;
            case 3:
                kahraman.setKilicIsmi("Altin");
                WelcomeMenu();
                break;
            case 4:
                kahraman.setKilicIsmi("Elmas");
                WelcomeMenu();
                break;
            case 5:
                break;
            default:
                WelcomeMenu();
        }

    }
}






