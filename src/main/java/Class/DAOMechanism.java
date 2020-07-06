package Class;

import Interface.DAO;
import com.sun.istack.internal.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DAOMechanism implements DAO<Client, Integer> {

    private final SessionFactory factory;

    public DAOMechanism(SessionFactory factory) { this.factory = factory; }

    @Override
    public void create(@NotNull final Client client) {
        try (final Session session = factory.openSession()) {

            session.beginTransaction();

            session.save(client);

            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(@NotNull final Client client) {
        try (final Session session = factory.openSession()) {

            session.beginTransaction();

            session.delete(client);

            session.getTransaction().commit();
        }
    }

    @Override
    public void update(@NotNull final Client client) {

        try (Session session = factory.openSession()) {

            session.beginTransaction();

            session.update(client);

            session.getTransaction().commit();
        }
    }
}

