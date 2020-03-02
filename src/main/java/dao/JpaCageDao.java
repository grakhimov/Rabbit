package dao;

import entities.Cage;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class JpaCageDao implements Dao<Cage> {

    private EntityManager entityManager;

    @Override
    public Optional<Cage> get(long id) {
        return Optional.ofNullable(entityManager.find(Cage.class, id));
    }

    @Override
    public List<Cage> getAll() {
        Query query = entityManager.createQuery("SELECT e FROM Cage e");
        return query.getResultList();
    }

    @Override
    public void save(Cage cage) {
        executeInsideTransaction(entityManager -> entityManager.persist(cage));
    }

    @Override
    public void update(Cage cage, String[] params) {
        cage.setPosX(Integer.parseInt(params[0]));
        cage.setPosY(Integer.parseInt(params[1]));
        cage.setEntity(params[2]);
        executeInsideTransaction(entityManager -> entityManager.merge(cage));
    }

    @Override
    public void delete(Cage cage) {
        executeInsideTransaction(entityManager -> entityManager.remove(cage));
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        }
        catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }
    }
}
