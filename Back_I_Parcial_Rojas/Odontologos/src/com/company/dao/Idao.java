package com.company.dao;

import java.util.List;

public interface Idao <T> {
    public T guardar(T t);
    public List<T> listarTodos();
}
