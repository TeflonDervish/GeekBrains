import java.util.Optional;

public interface DatabaseOperations<T> {
    void save(T entity);
    void deleteById(int id);
    Optional<T> getById(int id);
}
