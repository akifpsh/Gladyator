
public class Dusman extends Canli{
	private int ganimeti;
	private String isim;
	public Dusman(int can,int hasar,String isim,int ganimeti) {
		super(can,hasar);
		this.isim=isim;
		this.ganimeti=ganimeti;
	}
	public int getGanimeti() {
		return this.ganimeti;
	}
	@Override
	public void ozellileriGoster() {
		System.out.println("Isim= "+isim);
		System.out.println("Can= "+this.getCan());
		System.out.println("Hasar= "+this.getHasar());
		System.out.println("Ganimeti= "+this.ganimeti);
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}

}
