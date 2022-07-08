package dao;

import connect.Connect_MySQL;
import model.Comment;
import model.Post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class CommentDAO implements CRUD<Comment>{
    private static final String INSERT_POST_SQL = "insert into account value (?,?,?,?,?);";
    private static final String SELECT_ACCOUNT_BY_ID = "select * from account where useName =?";
    private static final String SELECT_COMMENT_BY_ID_POST = "select * from comments where idpost = ?";
    private static final String SELECT_ALL_POST = "select * from posts";
    private static final String DELETE_ACCOUNT_SQL = "delete from account where useName = ?;";
    private static final String UPDATE_ACCOUNT_SQL = "update account set passWord= ? where useName =?";
    @Override
    public ArrayList<Comment> getAll() {
       return null;
    }

    public ArrayList<Comment> getByIDPost(int idPost) {
        ArrayList<Comment> comment_list_idPost = new ArrayList<>();
        try (Connection connection = Connect_MySQL.getConnect();
             PreparedStatement statement = connection.prepareStatement(SELECT_COMMENT_BY_ID_POST);) {
            statement.setInt(1, idPost);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int idComment = resultSet.getInt(1);
                int idUser = resultSet.getInt(2);
                int id_Post = resultSet.getInt(3);
                String massage = resultSet.getString(4);
                comment_list_idPost.add(new Comment(idComment, idPost, idUser, massage));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return comment_list_idPost;
        }


    @Override
    public boolean create(Comment comment) {
//        try (Connection connection = Connect_MySQL.getConnect()) {
//            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENTS_SQL);
//            preparedStatement.setInt(1, student.getId());
//            preparedStatement.setString(2, student.getName());
//            preparedStatement.setInt(3, student.getAge());
//            preparedStatement.setString(4, student.getStatus());
//            return preparedStatement.execute();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//            return false;
//        }
        return false;
    }

    @Override
    public boolean update(int id, Comment comment) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Comment getByID(int id) {
        return null;
    }
}
