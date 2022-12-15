
public class Canli {
public static int canli_sayisi=0;	
private int can;
private int hasar;


public Canli(int can,int hasar) {
	this.can=can;
	this.hasar=hasar;
	canli_sayisi++;
}


public int getCan() {
	return this.can;
}
public void setCan(int can) {
	this.can=can;
}
public int getHasar() {
	return hasar;
}
public void setHasar(int hasar) {
	this.hasar=hasar;
}
public void ozellikleriGoster() {
	System.out.println("Can= "+this.can);
	System.out.println("Hasar= "+this.hasar);
}



}
