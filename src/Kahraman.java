
public class Kahraman extends Canli {
	private boolean savasdurum=false;
	private int id;
	private String isim;
	private String kilicIsmi="Tahta";
	private String zirhIsmi="Kumas";
	private String yetenekIsmi;
	private int yetenekHasari;
	private int para;
	private int deneyim;
	private int level;
	private int mana;
	private int pot;
	
	
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
	public String getKilicIsmi() {
		return kilicIsmi;
	}

	public void setKilicIsmi(String kilicIsmi) {
		this.kilicIsmi = kilicIsmi;
	}

	public String getZirhIsmi() {
		return zirhIsmi;
	}

	public void setZirhIsmi(String zirhIsmi) {
		this.zirhIsmi = zirhIsmi;
	}

	public String getYetenekIsmi() {
		return yetenekIsmi;
	}

	public void setYetenekIsmi(String yetenekIsmi) {
		this.yetenekIsmi = yetenekIsmi;
	}
	
	public void setYetenekHasari(int yetenekHasari) {
		this.yetenekHasari = yetenekHasari;
	}

	public int getYetenekHasari() {
		return yetenekHasari;
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
		 System.out.println("Kılıç= "+kilicIsmi);
		 System.out.println("Zırh= "+zirhIsmi);
		 System.out.println("Can= "+this.getCan());
		 System.out.println("Hasar= "+this.getHasar());
		 System.out.println("Level= "+this.level);
		 System.out.println("Para= "+this.para);
		 System.out.println("Deneyim= "+this.deneyim);
		 System.out.println("Mana= "+this.mana);
		 System.out.println("Savas durumu= "+this.savasdurum);
		 
	 }

	

	
	 
	
	
}
