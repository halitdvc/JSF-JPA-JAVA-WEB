 	package projeWeb;

public class Giris {
	
	private String kullaniciAdi;
	private String sifre;
	
	public String giris() {
		if(kullaniciAdi.equals("giris") && sifre.equals("123"))  return "Musteri";
		else return "Hata";
	}
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

}
