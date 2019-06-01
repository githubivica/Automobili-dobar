package hql;

import javax.persistence.Entity;

@Entity
public class Operator extends User{

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	private String pozicija;
	
	
	
}
