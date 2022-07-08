package dao;

import model.Friend;

import java.util.ArrayList;

public class FrienDAO implements CRUD<Friend>{
    @Override
    public ArrayList<Friend> getAll() {
        return null;
    }

    @Override
    public boolean create(Friend friend) {
        return false;
    }

    @Override
    public boolean update(int id, Friend friend) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Friend getByID(int id) {
        return null;
    }
}
