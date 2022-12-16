import java.util.Scanner;

public class ZirhMarket extends Market{
   public ZirhMarket(Kahraman kahraman) {
        super(kahraman);
    }
private Kahraman kahraman;
   
    Scanner sc=new Scanner(System.in);

    private int secim;

        @Override
        public void WelcomeMenu(){
            System.out.println("KilicMarkete Hos Geldiniz");
            System.out.println("Ne Satın Almak Istersiniz ?");
            System.out.println("1-->Deri Zirh  DFNS: 130");
            System.out.println("2-->Demir Zirh DFNS: 250");
            System.out.println("3-->Altın Zirh DFNS: 400");
            System.out.println("4-->Elmas Zirh DFNS: 750");
            System.out.println("5-->Markete Geri Don");
    
            this.secim=sc.nextInt();
            switch(secim){
                case 1:
                    kahraman.setZirhIsmi("Deri");
                    WelcomeMenu();
                    break;
                case 2:
                    kahraman.setZirhIsmi("Demir");
                    WelcomeMenu();
                    break;
                case 3:
                    kahraman.setZirhIsmi("Altin");
                    WelcomeMenu();
                    break;
                case 4:
                    kahraman.setZirhIsmi("Elmas");
                    WelcomeMenu();
                    break;
                case 5:
                    break;
                default:
                    WelcomeMenu();
            }
            
        }
    }
