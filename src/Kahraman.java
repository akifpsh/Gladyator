
public class Kahraman extends Canli {
	private boolean savasdurum=false;
	private int id;
	private String isim;
	private String kilic="Tahta";
	private String zirh="Kumas";
	private String yetenek;
	private int para;
	private int deneyim;
	private int level;
	private int mana;
	private int pot;
	
	// kılıç yetenek ve zırh objeleri !!!
	
	 public Kahraman(int can,int hasar,int id,String isim,int level,int para,int deneyim,int mana,int pot) {
		 super(can,hasar);
		 this.id=id;
		 this.isim=isim;
		 this.level=level;
		 this.para=para;
		 this.deneyim=deneyim;
		 this.mana=mana;
		 this.pot=pot;
	 }

	 public boolean getSavasdurum() {
		return savasdurum;
	}
	public void setSavasdurum(boolean savasdurum) {
		this.savasdurum = savasdurum;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getKilic() {
		return kilic;
	}

	public void setKilic(String kilic) {
		this.kilic = kilic;
	}

	public String getZirh() {
		return zirh;
	}
	public String getYetenek() {
		return yetenek;
	}

	public void setYetenek(String yetenek) {
		this.yetenek = yetenek;
	}


	public void setZirh(String zirh) {
		this.zirh = zirh;
	}

	public int getPot() {
		return pot;
	}

	public void setPot(int pot) {
		this.pot = pot;
	}
	public int getPara() {
		return para;
	}
	public void setPara(int para) {
		this.para = para;
	}

	public int getDeneyim() {
		return deneyim;
	}
	public void setDeneyim(int deneyim) {
		this.deneyim = deneyim;
	}

	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}


	@Override
	 public void ozellikleriGoster() {
		 System.out.println("Id= "+this.id);
		 System.out.println("Isim= "+isim);
		 System.out.println("Kılıç= "+kilic);
		 System.out.println("Zırh= "+zirh);
		 System.out.println("Can= "+this.getCan());
		 System.out.println("Hasar= "+this.getHasar());
		 System.out.println("Level= "+this.level);
		 System.out.println("Para= "+this.para);
		 System.out.println("Deneyim= "+this.deneyim);
		 System.out.println("Mana= "+this.mana);
		 System.out.println("Savas durumu= "+this.savasdurum);
		 
	 }

	

	
	 
	
	
}
