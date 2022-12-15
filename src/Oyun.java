import java.util.Scanner;


public class Oyun {
    private Kahraman kahraman;
    private int secim;
    private String secim1;
    public Oyun(Kahraman kahraman){
        this.kahraman = kahraman;
        menu();
    }
    public void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ne Yapmak İstersin ?");
        System.out.println("1-Karakterin Güncel Durumunu Görüntüle.");
        System.out.println("2-Markete Git.");
        System.out.println("3-Arenaya Git.");
        System.out.println("4-Oyunu Kaydet.");
        System.out.println("5-Oyundan Çık.");

        this.secim = input.nextInt();
        input.nextLine();
        switch (this.secim) {
            case 1:
                //this.kahraman.ozellikleriGoster();
                menu();
                break;
            case 2:
                new Market(this.kahraman);
                menu();
                break;
            case 3:
                //new Arena(this.kahraman);
                menu();
                break;
            case 4:
                //new Kayit(this.kahraman);
                menu();
                break;
            case 5:
                try {
                    Thread.sleep(2000);
                    System.out.println("Oyundan Başarıyla Çıkış Yapıldı.");
                } catch (Exception e) {
                    System.out.println("Şu Hata İle Karşılaştın-->"+e);
                }
                break;
        
            default:
            System.out.println("Lütfen 1-2-3-4 Sayılarından Birini Girin.");
            menu();
                break;
        }
    }
}