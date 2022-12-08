/*import java.sql.*;
public class Kayit {
    private Connection con;
    private Statement stmt;
    private Kahraman kahraman;
    public Kayit(Kahraman kahraman){
        this.kahraman = kahraman;
        kaydet();
    }
    public void kaydet(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gladyator","root","Gladyator.root!720");
            stmt = con.createStatement();
            this.stmt.executeUpdate("UPDATE `gladyator`.`oyunlar` SET `Kahramanın_İsmi` = '"+this.kahraman.getIsim()+"', `Kahramanın_Canı` = '"+this.kahraman.getCan()+"', `Kahramanın_Hasarı` = '"+this.kahraman.getHasar()+"',`Kahramanın_Manası` = '"+this.kahraman.getMana()+"', `Kahramanın_Parası` = '"+this.kahraman.getPara()+"', `Kahramanın_Seviyesi` = '"+this.kahraman.getSeviye()+"', `Kahramanın_Deneyim_Puanı` = '"+this.kahraman.getDeneyim()+"', `Kahramanın_Kılıcı` = '"+this.kahraman.getKilic()+"', `Kahramanın_Zırh` = '"+this.kahraman.getZirh()+"', `Kahramanın_Yetenek` = '"+this.kahraman.getYetenek()+"', `Kahramanın_Savaş_Durumu` = '"+this.kahraman.getSavas_Durumu()+"' WHERE (`idOyunlar` = '"+this.kahraman.getId()+"')");
            System.out.println("Oyunu Başarıyla Kaydettin.");
            con.close();
        } catch (Exception e) {
            System.out.println("Şu Hata İle Karşılaştın-->"+e);
            e.printStackTrace();
        }
    }
    
    
}*/
