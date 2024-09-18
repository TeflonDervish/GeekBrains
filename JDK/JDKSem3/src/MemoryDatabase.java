import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemoryDatabase<T> implements DatabaseOperations<T>{
    private List<T> database = new ArrayList<>();


    @Override
    public void save(T entity) {
        database.add(entity);
    }

    @Override
    public void deleteById(int id) {
        database.remove(id);
    }

    @Override
    public Optional<T> getById(int id) {
        return (Optional<T>) database.get(id);
    }
}
