package com.company.dao;

import java.util.List;

public interface Idao <T> {
    public T guardar(T t);
    public T buscar(int id);
    public void eliminar(int id);
    public List<T> listarTodos();
}
