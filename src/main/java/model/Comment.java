package model;

public class Comment {
    int idComment;
    int idUser;
    int idPost;
    String massage;

    public Comment() {
    }

    public Comment(int idComment, int idUser, int idPost, String massage) {
        this.idComment = idComment;
        this.idUser = idUser;
        this.idPost = idPost;
        this.massage = massage;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "idComment=" + idComment +
                ", idUser=" + idUser +
                ", idPost=" + idPost +
                ", massage='" + massage + '\'' +
                '}';
    }
}
