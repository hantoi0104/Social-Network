package model;

import java.sql.Date;
import java.time.LocalDate;

public class Post {
    int idPost;
    int idUser;
    String massage;
    String img;
    Date datePost;

    public Post() {
    }

    public Post(int idPost, int idUser, String massage, String img, Date datePost) {
        this.idPost = idPost;
        this.idUser = idUser;
        this.massage = massage;
        this.img = img;
        this.datePost = datePost;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getDatePost() {
        return datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

}