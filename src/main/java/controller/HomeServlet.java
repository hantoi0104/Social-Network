package controller;

import dao.CommentDAO;
import dao.PostDao;
import dao.UseDao;
import model.Comment;
import model.Post;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    PostDao postDao = new PostDao();
    UseDao userDao = new UseDao();
    CommentDAO commentDAO = new CommentDAO();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            default:
                ArrayList<Comment> posts = commentDAO.getByIDPost(1);
                for (int i = 0; i < posts.size(); i++) {
                    System.out.println(userDao.getByID(posts.get(i).getIdUser()));
                }
                req.setAttribute("userDao", userDao);
                req.setAttribute("post_list", postDao.getAll());
                req.setAttribute("commentDao", commentDAO);
                RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
                dispatcher.forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "comment":


                break;
        }
    }
}
