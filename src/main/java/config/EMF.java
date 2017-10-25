package config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import entities.Role;
import entities.User;

// Entity Manager Factory
@WebListener
public class EMF implements ServletContextListener {

	private static EntityManagerFactory emf;
	
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Initializing context");
		emf = Persistence.createEntityManagerFactory("MY_PU");
		System.out.println("File MY_PU read");
		setDB();
	}

	public void contextDestroyed(ServletContextEvent sce) {
		emf.close();
	}
		
	public static EntityManager getEM() {
		return emf.createEntityManager();
	}
	
	// Méthode pour accéder à la DB
	public void setDB() {
		// Création des rôles
		Role admin = new Role(Role.ADMIN);
		Role writer = new Role(Role.WRITER);
		Role reader = new Role(Role.READER);
		Role none = new Role(Role.NONE);
		
		User userAdmin = new User("admin", "admin", "admin@cms.com", admin);
		User userWriter = new User("jdormesson", "jd", "jdormesson@gmail.com", writer);
		User userReader = new User("sev", "sev", "sev@lpdm.com", reader);
		User userNone = new User("john", "jd", "john.doe@hotmail.com", none);
		
		// Insertion
		EntityManager db = getEM();
		db.getTransaction().begin();
		db.persist(admin);
		db.persist(writer);
		db.persist(reader);
		db.persist(none);

		db.persist(userAdmin);
		db.persist(userWriter);
		db.persist(userReader);
		db.persist(userNone);

//		Long userId = u.getId();
		db.getTransaction().commit();
		
		// Récupération
//		db.find(User.class, 1l);
//		db.getTransaction().commit();
	}
}
