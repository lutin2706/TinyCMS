package repositories.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import config.EMF;
import entities.Post;
import repositories.PostRepository;

public class PostRepositoryImpl implements PostRepository {

	EntityManager em = EMF.getEM();
	
	@Override
	public List<Post> getList() {
		Query query = em.createQuery("SELECT p FROM Post p");
		List<Post> posts = query.getResultList();
		return posts;
	}

	@Override
	public Post get(Long id) {
		em.getTransaction().begin();
		Post post = em.find(Post.class, id);
		em.getTransaction().commit();
		return post;
	}

	@Override
	public long count() {
		Query query = em.createQuery("SELECT COUNT(p.id) FROM Post p");
		long nbr = (long)query.getSingleResult();
		return nbr;
	}

	@Override
	public Post create(Post p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		return p;
	}

}
