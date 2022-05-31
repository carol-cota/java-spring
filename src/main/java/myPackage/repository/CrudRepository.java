package myPackage.repository;

import java.util.List;

public interface CrudRepository<T> {

    List<T> findAll();

    T create(T object);
}
