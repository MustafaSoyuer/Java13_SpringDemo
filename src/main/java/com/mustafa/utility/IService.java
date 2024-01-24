package com.mustafa.utility;

import java.util.List;
import java.util.Optional;

public interface IService<T,ID> {
    T save(T t);
    T update(T t);
    Iterable<T> saveAll(Iterable<T> t);
    void delete(T t);
    Optional<T> findById(ID id);
    boolean existById(ID id);
    List<T> findAll();
    List<T> findByColumnAndValue(String columnName, Object value); // select * from tblurun where ad= ?
    void deleteById(ID id);
    List<T> findAllEntity(T t);
}
