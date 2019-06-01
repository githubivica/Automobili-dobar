package hql;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;

	@Entity												
	@Inheritance(strategy = InheritanceType.JOINED)	//SINGLE_TABLE - sve u jednoj tabeli			
	@DiscriminatorColumn (name ="klasa", discriminatorType = DiscriminatorType.STRING)
					//ovo je naziv kolone klasa umesto DType i podesavanje da tip bude String*/
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		//ovo je za SINGLE_TABLE i za JOINED
	private int idUser;
	private String ime;
	private String prezime;
	
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
}
