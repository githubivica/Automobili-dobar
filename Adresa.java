package hql;

import javax.persistence.Entity;

@Entity
public class Adresa extends User{

	private String ulica;

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	
	
}
