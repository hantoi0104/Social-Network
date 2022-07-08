package dao;

import java.util.ArrayList;
import java.util.List;

    public interface CRUD<E> {
        public ArrayList<E> getAll();
        public boolean create(E e);
        public boolean update(int id,E e);
        public boolean delete(int id);
        public E getByID(int id);
    }
