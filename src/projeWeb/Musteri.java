package projeWeb;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Musteri")

public class Musteri implements Serializable{
	@EmbeddedId
	private MusteriId id =new MusteriId();
	
	private String ad;
	private String soyad;
	private String cinsiyet;
	private String sehir;
	private Integer yas;
	private String otel;
	private String odaTipi;
	
	@Embedded
	private AdresBilgileri adresBilgileri = new AdresBilgileri();
	@OneToOne
	private Urun urun ;
	
	
	
	
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getOtel() {
		return otel;
	}
	public void setOtel(String otel) {
		this.otel = otel;
	}
	public String getOdaTipi() {
		return odaTipi;
	}
	public void setOdaTipi(String odaTipi) {
		this.odaTipi = odaTipi;
	}
	public MusteriId getId() {
		return id;
	}
	public void setId(MusteriId id) {
		this.id = id;
	}
	public AdresBilgileri getAdresBilgileri() {
		return adresBilgileri;
	}
	public void setAdresBilgileri(AdresBilgileri adresBilgileri) {
		this.adresBilgileri = adresBilgileri;
	}
	public Integer getYas() {
		return yas;
	}
	public void setYas(Integer yas) {
		this.yas = yas;
	}
	public Urun getUrun() {
		return urun;
	}
	public void setUrun(Urun urun) {
		this.urun = urun;
	}
	
}
