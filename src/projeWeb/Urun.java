package projeWeb;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Urun")
public class Urun implements Serializable {
	
	@Id @GeneratedValue
	private long urunId;
	private String urun;
	
	@OneToOne
	private Firma firma;
	
	public long getUrunId() {
		return urunId;
	}
	public void setUrunId(long urunId) {
		this.urunId = urunId;
	}
	public String getUrun() {
		return urun;
	}
	public void setUrun(String urun) {
		this.urun = urun;
	}
	public Firma getFirma() {
		return firma;
	}
	public void setFirma(Firma firma) {
		this.firma = firma;
	}
	

}
