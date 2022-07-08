package dao;

import connect.Connect_MySQL;
import model.Post;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class UseDao implements CRUD<User>{
    private static final String INSERT_POST_SQL = "insert into account value (?,?,?,?,?);";
    private static final String SELECT_USER_BY_ID = "select * from users where iduser =?";
    private static final String SELECT_ALL_USER= "select * from user";
    private static final String DELETE_ACCOUNT_SQL = "delete from account where useName = ?;";
    private static final String UPDATE_ACCOUNT_SQL = "update account set passWord= ? where useName =?";
    @Override
    public ArrayList<User> getAll() {
        ArrayList<User> user_list = new ArrayList<>();
        try (Connection connection = Connect_MySQL.getConnect();
             PreparedStatement statement = connection.prepareStatement(SELECT_ALL_USER);) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int idUser = resultSet.getInt(1);
                String userName = resultSet.getString(2);
                String pasWord = resultSet.getString(3);
                String fullName = resultSet.getString(4);
                String img = resultSet.getString(5);
                LocalDate date = LocalDate.parse(resultSet.getString(6));
                int phone = resultSet.getInt(7);
                String email = resultSet.getString(8);
                String country = resultSet.getString(9);
               user_list.add(new User(idUser, userName, pasWord,fullName,img,date, phone,email, country));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user_list;
    }

    @Override
    public boolean create(User user) {
        return false;
    }

    @Override
    public boolean update(int id, User user) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public User getByID(int id) {
        try (Connection connection = Connect_MySQL.getConnect();
             PreparedStatement statement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int idUser = resultSet.getInt(1);
                String userName = resultSet.getString(2);
                String pasWord = resultSet.getString(3);
                String fullName = resultSet.getString(4);
                String img = resultSet.getString(5);
                LocalDate date = LocalDate.parse(resultSet.getString(6));
                int phone = resultSet.getInt(7);
                String email = resultSet.getString(8);
                String country = resultSet.getString(9);
                return new User(idUser, userName, pasWord, fullName, img, date, phone,email, country);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
