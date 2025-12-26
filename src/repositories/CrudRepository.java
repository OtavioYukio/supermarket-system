package repositories;

import java.util.List;

public interface CrudRepository<T> {
    T save(T entity);
    T findById(Integer id);
    List<T> findAll();
    T updateById(Integer id, T entity);
    T deleteById(Integer id);
}
