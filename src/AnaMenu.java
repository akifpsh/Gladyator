import java.sql.*;
import java.util.Scanner;


public class AnaMenu {
    private ResultSet rs;
    private Statement stmt;
    private int secim1;
    private String secim2;
    public AnaMenu(){
        menu();
    }
    public void menu(){
        try{
            Scanner input1 = new Scanner(System.in);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gladyator","root","Gladyator.root!720");
            this.stmt=con.createStatement();
            this.rs=this.stmt.executeQuery("select * from oyunlar");
            this.rs.next();
            if(this.rs.getInt(2) == 1){
                System.out.println("  ----------------------\n  -                    -\n1 -     Yeni Oyun      \n  -                    -\n  ----------------------\n");
            }else{
                System.out.println("\n------------------------------------------------------------------\n1 Burada Kayıtlı Bir Oyun Var.\nKayıtlı Oyunun Kahramanının Bilgilerini Gormek İçin Bu Oyunu Seç.\nBu Menüye Geri Dönebilirsin.\n------------------------------------------------------------------\n");
            }
            this.rs.next();
            if(this.rs.getInt(2) == 2){
                System.out.println("  ----------------------\n  -                    -\n2 -     Yeni Oyun      \n  -                    -\n  ----------------------\n");
            }else{
                System.out.println("\n------------------------------------------------------------------\n2 Burada Kayıtlı Bir Oyun Var.\nKayıtlı Oyunun Kahramanının Bilgilerini Gormek İçin Bu Oyunu Seç.\nBu Menüye Geri Dönebilirsin.\n------------------------------------------------------------------\n");
            }
            this.rs.next();
            if(this.rs.getInt(2) == 3 ){
                System.out.println("  ----------------------\n  -                    -\n3 -     Yeni Oyun      \n  -                    -\n  ----------------------\n");
            }else{
                System.out.println("\n------------------------------------------------------------------\n3 Burada Kayıtlı Bir Oyun Var.\nKayıtlı Oyunun Kahramanının Bilgilerini Gormek İçin Bu Oyunu Seç.\nBu Menüye Geri Dönebilirsin.\n------------------------------------------------------------------\n");
            }
            this.rs.next();
            if(this.rs.getInt(2) == 4){
                System.out.println("  ----------------------\n  -                    -\n4 -     Yeni Oyun      \n  -                    -\n  ----------------------\n");
            }else{
                System.out.println("\n------------------------------------------------------------------\n4 Burada Kayıtlı Bir Oyun Var.\nKayıtlı Oyunun Kahramanının Bilgilerini Gormek İçin Bu Oyunu Seç.\nBu Menüye Geri Dönebilirsin.\n------------------------------------------------------------------\n");
            }
            this.secim1 = input1.nextInt();
            input1.nextLine();
            //input1.close();
            switch (this.secim1) {
            case 1:
                this.rs=this.stmt.executeQuery("select * from oyunlar where idOyunlar = 1");
                this.rs.next();
                if(this.rs.getInt(2) == 101){
                    System.out.println(this.rs.getInt(1));
                    satirYazdir(this.rs.getInt(1));
                }else{
                    satirYazdir(this.rs.getInt(1));
                }
                    break;
                case 2:
                    this.rs=this.stmt.executeQuery("select * from oyunlar where idOyunlar = 2");
                    this.rs.next();
                    if(this.rs.getInt(2) == 102){
                        System.out.println(this.rs.getInt(1));
                        satirYazdir(this.rs.getInt(1));
                    }else{
                        satirYazdir(this.rs.getInt(1));
                    }
                        break;
                case 3:
                this.rs=this.stmt.executeQuery("select * from oyunlar where idOyunlar = 3");
                this.rs.next();
                if(this.rs.getInt(2) == 103){
                    System.out.println(this.rs.getInt(1));
                    satirYazdir(this.rs.getInt(1));
                }else{
                    satirYazdir(this.rs.getInt(1));
                }
                    break;
                case 4:
                    this.rs=this.stmt.executeQuery("select * from oyunlar where idOyunlar = 4");
                    this.rs.next();
                    if(this.rs.getInt(2) == 104){
                        System.out.println(this.rs.getInt(1));
                        satirYazdir(this.rs.getInt(1));
                    }else{
                        satirYazdir(this.rs.getInt(1));
                    }
                        break;
                default:
                    System.out.println("Lütfen, Yalnızca 1-2-3-4 Sayılarından Birini Girin.");
                    menu();
                    break;
            }
            con.close();
        }catch(Exception e){
            System.out.println("Şu Hataya Rastladın -->"+ e);
        }
    }
    public void satirYazdir(int satir){

        try{
            Scanner input2 = new Scanner(System.in);
            this.rs=stmt.executeQuery("select * from oyunlar where idOyunlar = "+satir);
            this.rs.next();
            System.out.println("Kahramanın İsmi: "+this.rs.getString(3));
            System.out.println("Kahramanın Canı: "+this.rs.getDouble(4));
            System.out.println("Kahramanın Hasarı: "+this.rs.getDouble(5));
            System.out.println("Kahramanın Manası: "+this.rs.getDouble(6));
            System.out.println("Kahramanın Parası: "+this.rs.getInt(7));
            System.out.println("Kahramanın Seviyesi: "+this.rs.getInt(8));
            System.out.println("Kahramanın Deneyim Puanı: "+this.rs.getDouble(9));
            System.out.println("Kahramanın Kılıcı: "+this.rs.getString(10));
            System.out.println("Kahramanın Zırhı: "+this.rs.getString(11));
            System.out.println("Kahramanın Yeteneği: "+this.rs.getString(12));
            String Durum;
            if(rs.getInt(13) == 0) Durum = "Savaşta Değil"; else Durum = "Savaşta";
            System.out.println("Kahramanın Savaşma Durumu: "+Durum);
            System.out.println("Bu Oyuna Devam Etmek İçin 'E/y' Bir Onceki Menüye Donmek İçin 'H/n' Tuşlarına Basın.");
            this.secim2 = input2.nextLine();

            System.out.println("test1");
            System.out.println(this.secim2);
            if(this.secim2.equals("E") || this.secim2.equals("e") || this.secim2.equals("y") || this.secim2.equals("Y")){
                input2.close();
                System.out.println("Oyuna Giriş yapılıyor...");
                Thread.sleep(3000);
                this.stmt.executeUpdate("UPDATE `gladyator`.`oyunlar` SET `oyunNo` = '10"+ satir +"' WHERE (`idOyunlar` = '" + satir +"')");

                //exit(1);
            }else{
                menu();
            }
            
        }catch(Exception e){
            System.out.println("Şu Hataya Rastladın-->"+e);
        } 
    }
}

