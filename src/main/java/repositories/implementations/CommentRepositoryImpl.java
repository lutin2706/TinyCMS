package repositories.implementations;

import javax.persistence.EntityManager;

import config.EMF;
import entities.Comment;
import repositories.CommentRepository;

public class CommentRepositoryImpl implements CommentRepository {

	EntityManager em = EMF.getEM();

	@Override
	public Comment get(Long id) {
		em.getTransaction().begin();
		Comment comment = em.find(Comment.class, id);
		em.getTransaction().commit();
		return comment;
	}

	@Override
	public Comment create(Comment c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return c;
	}

}
