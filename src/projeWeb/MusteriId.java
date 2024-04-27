package projeWeb;


import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

@Embeddable
public class MusteriId implements Serializable{
	
	private String ulkeKodu;
	@GeneratedValue
	private long kimlikKodu;

	public String getUlkeKodu() {
		return ulkeKodu;
	}

	public void setUlkeKodu(String ulkeKodu) {
		this.ulkeKodu = ulkeKodu;
	}

	public long getKimlikKodu() {
		return kimlikKodu;
	}

	public void setKimlikKodu(long kimlikKodu) {
		this.kimlikKodu = kimlikKodu;
	}

}
