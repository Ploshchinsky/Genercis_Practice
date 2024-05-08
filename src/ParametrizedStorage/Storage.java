package ParametrizedStorage;

import java.util.List;

public interface Storage<T> {
    public boolean save(T element);
    public T getById(int id);
    public void updateById(int id,T updatedElement);
    public void deleteById(int id);
    public List<T> getList();
}
