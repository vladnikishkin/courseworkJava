package Interface;

public interface DAO<Entity, Key> {
    void create(Entity entity);
    void update(Entity entity);
    void delete(Entity entity);
}
