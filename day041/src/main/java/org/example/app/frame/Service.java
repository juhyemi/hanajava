package org.example.app.frame;

import java.util.List;

public interface Service<K,V> {
        int add(V v); //public abstarct int insert()와 같다
        int del(K k);
        int modify(V v);
        V get(K k);
        List<V> get();


}
