package projeWeb;


import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class MusteriView implements Serializable {
	
	private Musteri musteri = new Musteri();
	private EntityManager manager = EntityUtil.getEntityManager();
	
	
	public void Kaydet() {
		getManager().getTransaction().begin();
		getManager().persist(musteri);
		getManager().getTransaction().commit();
		musteri = new Musteri();
	}
	
	public void Guncelle() {
		getManager().getTransaction().begin();
		getManager().merge(musteri);
		getManager().getTransaction().commit();
		musteri = new Musteri();
	}
	public void Sil() {
		getManager().getTransaction().begin();
		getManager().remove(musteri);
		getManager().getTransaction().commit();
		musteri = new Musteri();
	}
	
	public List<Musteri> getList(){
		return getManager().createQuery("From Musteri").getResultList();
	}
	
	
	
	

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

}
