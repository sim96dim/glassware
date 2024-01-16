package com.generation.model.repositories;

import java.util.List;

import com.generation.model.entities.Glassware;

public interface GlasswareRepository<X extends Glassware>
{
    List<X> readAll();
    X readById(int id);
    void insert(X x);
    void update(X x);
    void delete(int id);
}
