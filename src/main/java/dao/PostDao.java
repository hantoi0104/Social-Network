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
import java.util.Date;
import java.util.List;

public class PostDao implements CRUD<Post> {
    private static final String INSERT_POST_SQL = "insert into account value (?,?,?,?,?);";
    private static final String SELECT_ACCOUNT_BY_ID = "select * from account where useName =?";
    private static final String SELECT_ALL_POST = "select * from posts";
    private static final String DELETE_ACCOUNT_SQL = "delete from account where useName = ?;";
    private static final String UPDATE_ACCOUNT_SQL = "update account set passWord= ? where useName =?";

    @Override
    public ArrayList<Post> getAll() {
        ArrayList<Post> post_list = new ArrayList<>();
        try (Connection connection = Connect_MySQL.getConnect();
             PreparedStatement statement = connection.prepareStatement(SELECT_ALL_POST);) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idPost = resultSet.getInt(1);
                int idUser = resultSet.getInt(2);
                String massage = resultSet.getString(3);
                String img = resultSet.getString(4);
                Date datePost = resultSet.getDate(5);
                post_list.add(new Post(idPost, idUser, massage, img, (java.sql.Date) datePost));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return post_list;
    }

    @Override
    public boolean create(Post post) {
        try (Connection connection = Connect_MySQL.getConnect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_POST_SQL);
            preparedStatement.setInt(1, post.getIdPost());
            preparedStatement.setInt(2, post.getIdUser());
            preparedStatement.setString(3, post.getMassage());
            preparedStatement.setString(4, post.getMassage());
            preparedStatement.setDate(5, post.getDatePost());
            return preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean update(int id, Post post) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Post getByID(int id) {
        return null;
    }
}
