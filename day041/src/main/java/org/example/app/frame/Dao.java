package org.example.app.frame;

import java.util.List;
//generic 개수는 상관없음

public interface Dao<K,V> {
    int insert(V v); //public abstarct int insert()와 같다
    int delete(K k);
    int update(V v);
    V select(K k);
    List<V> select();
}
