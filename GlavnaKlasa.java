package hql;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		
		/*Session sesija = sf.openSession();	//unos podataka
		sesija.beginTransaction();
			try {
				
				for (int i=1; i<=5; i++) {
					User user = new User();
					user.setIme("Ime " + i);
					user.setPrezime("Prezime " + i);
					sesija.save(user);
					
					Operator user2 = new Operator();
					user2.setIme("Ime 2" + i);
					user2.setPrezime("Prezime 2" + i);
					user2.setPozicija("Pozicija 2" + i);
					sesija.save(user2);
					
					Adresa user3 = new Adresa();
					user3.setIme("Ime 3" + i);
					user3.setPrezime("Prezime 3" + i);
					user3.setUlica("Ulica 3" + i);
					sesija.save(user3);	
				}
				
				sesija.getTransaction().commit();
			} catch (Exception e) {
				sesija.getTransaction().rollback();
			}finally {
				sesija.close();
			}*/
		
			
		/*Adresa user4 = new Adresa();				//podesavanje podataka u tabelama
		
		Session sesija = sf.openSession();
		sesija.beginTransaction();
			try {
				user4 = sesija.get(Adresa.class, 3);
				user4.setPrezime("Petrovic");
				user4.setUlica("nova ulica");
				sesija.update(user4);
				
				sesija.getTransaction().commit();
			} catch (Exception e) {
				sesija.getTransaction().rollback();
			}finally {
				sesija.close();
			}*/
				

		/*	List<User> listaUsera = null;		//ovde se menja klasa User, Operator i Adresa
			Session sesija = sf.openSession();
			sesija.beginTransaction();
				try {
					
					String hql = "FROM User WHERE idUser = 5";	//paziti da li je idUser iz Operator i Adresa
					//String hql1 = "SELECT ime FROM User WHERE prezime = !kakoHocu";	//!kako hocu - PROVERITI
					
					Query upit = sesija.createQuery(hql);
					//upit.setParametar (!kakoHocu, Prezime 21);		//sta ide posle !kakoHocu
					listaUsera = upit.getResultList();

					if(listaUsera.isEmpty()) {
						System.out.println("Nema tih usera");
					}else{
						
						for(User u:listaUsera ) {			//User
						System.out.println(u.getIdUser() + " " + u.getIme() + " " + u.getPrezime());
						
						//for(Operator u:listaUsera ) {		//Operator
						//System.out.println(u.getIdUser() + " " + u.getIme() + " " + u.getPrezime() +
						//" " + u.getPozicija());
						
						//*for(Adresa u:listaUsera ) {		//Adresa
						//System.out.println(u.getIdUser() + " " + u.getIme() + " " + u.getPrezime() +
						//" " + u.getUlica());
						}
					}
					
					sesija.getTransaction().commit();
				} catch (Exception e) {
					sesija.getTransaction().rollback();
				}finally {
					sesija.close();
				}	
			*/	
			
			
			List<User> listaUsera = null;		//ovde se menja klasa User, Operator i Adresa
			Session sesija = sf.openSession();
			sesija.beginTransaction();
				try {
					
					String hql = "FROM User";
					//String hql = "SELECT ime FROM User WHERE idUser = 5";
					
					//String hql = "SELECT User.ime FROM User LEFT JOIN Operator ON User.IdUser = Operator.IdUser WHERE User.idUser = 5";
					
					//String hql = "FROM User LEFT JOIN Operator ON User.IdUser = Operator.IdUser WHERE idUser = 5";
					//String hql = "FROM User WHERE idUser = 5";	//paziti da li je idUser iz Operator i Adresa
					
					Query upit = sesija.createQuery(hql);
					
					listaUsera = upit.getResultList();
	
					if(listaUsera.isEmpty()) {
						System.out.println("Nema tih usera");
					}else{
						
						for(User u:listaUsera ) {			//User
						System.out.println(u.getIdUser() + " " + u.getIme() + " " + u.getPrezime());
						
						//for(Operator u:listaUsera ) {		//Operator							
						//System.out.println(u.getIdUser() + " " + u.getIme() + " " + u.getPrezime() +
						//	" " + u.getPozicija());
						
						//*for(Adresa u:listaUsera ) {		//Adresa
						//System.out.println(u.getIdUser() + " " + u.getIme() + " " + u.getPrezime() +
						//" " + u.getUlica());
						}
					}
					
					sesija.getTransaction().commit();
				} catch (Exception e) {
					sesija.getTransaction().rollback();
				}finally {
					sesija.close();
				}
			
			
				
	}

}
