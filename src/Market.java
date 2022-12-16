import java.util.Scanner;

public class Market{
    private int secim;
    private Kahraman kahraman;
    public Market(Kahraman kahraman){
        this.kahraman = kahraman;
        WelcomeMenu();
    }
    Scanner sc1=new Scanner(System.in);

    public void WelcomeMenu(){
         System.out.println("Markettesin"); 
        System.out.println("Ne Yapmak Istersiniz ?");
        System.out.println("1-->Iksir Satin Al");
        System.out.println("2-->Kilic Satin Al");
        System.out.println("3-->Zirh Satin Al");
        System.out.println("4-->Yetenek Satin Al");
        System.out.println("5-->Sokaga cik");

        this.secim=sc1.nextInt();
        sc1.nextLine();

        switch(this.secim){
            case 1:
                new IksirMarket(kahraman);
                WelcomeMenu();
                break;
            case 2:
                new KilicMarket(kahraman);
                WelcomeMenu();
                break;
            case 3:
                new ZirhMarket(kahraman);
                WelcomeMenu();
                break;
            case 4:
                new YetenekMarket(kahraman);
                WelcomeMenu();
                break;
            case 5:
                System.out.println("Sokaga Döndun.");
                break;
        }
    }    
}
