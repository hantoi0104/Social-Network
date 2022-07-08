<%@ page import="dao.UseDao" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--    <link rel="shortcut icon" href="./images/logo.png" type="image/x-icon">-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
          integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href="style.css">
    <title>MediaBook</title>
</head>

<body>
<nav>
    <div class="nav-left">
        <img src="./images/vietnamLogo.png" alt="Logo">
        <div class="search">
            <input type="text" placeholder="Search MediaSocial..">
            <button class="btn-search">
                <i class="fa fa-search" aria-hidden="true"></i>
            </button>
        </div>
    </div>

    <div class="nav-middle">
        <a href="#" class="active">
            <i class="fa fa-home"></i>
        </a>

        <a href="#">
            <i class="fa fa-user-friends"></i>
        </a>

        <a href="#">
            <i class="fa fa-play-circle"></i>
        </a>

        <a href="#">
            <i class="fa fa-users"></i>
        </a>
    </div>

    <div class="nav-right">
        <span class="profile"></span>

        <a href="#">
            <i class="fa fa-bell"></i>
        </a>

        <a href="#">
            <i class="fas fa-ellipsis-h"></i>
        </a>
    </div>
</nav>


<div class="container">
    <div class="left-panel">
        <ul>
            <li>
                <span class="profile"></span>

                <p>Hán Văn Tới</p>


            </li>
            <li>
                <i class="fa fa-user-friends"></i>
                <p>Friends</p>
            </li>
            <li>
                <i class="fa fa-play-circle"></i>
                <p>Videos</p>
            </li>
            <li>
                <i class="fa fa-flag"></i>
                <p>Pages</p>
            </li>
            <li>
                <i class="fa fa-users"></i>
                <p>Groups</p>
            </li>
            <li>
                <i class="fa fa-bookmark"></i>
                <p>Bookmark</p>
            </li>
            <li>
                <i class="fab fa-facebook-messenger"></i>
                <p>Inbox</p>
            </li>
            <li>
                <i class="fas fa-calendar-week"></i>
                <p>Events</p>
            </li>
            <li>
                <i class="fa fa-bullhorn"></i>
                <p>Ads</p>
            </li>
            <li>
                <i class="fas fa-hands-helping"></i>
                <p>Offers</p>
            </li>
            <li>
                <i class="fas fa-briefcase"></i>
                <p>Jobs</p>
            </li>
            <li>
                <i class="fa fa-star"></i>
                <p>Favourites</p>
            </li>
        </ul>

        <div class="footer-links">
            <a href="#">Privacy</a>
            <a href="#">Terms</a>
            <a href="#">Advance</a>
            <a href="#">More</a>
        </div>
    </div>


    <div class="middle-panel">

        <div class="story-section">

            <div class="story create">
                <div class="dp-image">
                    <img src="./images/dp.jpg" alt="Profile pic">
                </div>
                <span class="dp-container">
                        <i class="fa fa-plus"></i>
                    </span>
                <span class="name">Create Story</span>
            </div>


            <div class="story">
                <img src="./images/model.jpg" alt="Anuska's story">
                <div class="dp-container">
                    <img src="./images/girl.jpg" alt="">
                </div>
                <p class="name">Anuska Sharma</p>
            </div>

            <div class="story">
                <img src="./images/boy.jpg" alt="Story image">
                <span class="dp-container">
                        <img src="./images/dp.jpg" alt="Profile pic">
                    </span>
                <span class="name">Gaurav Gall</span>
            </div>

            <div class="story">
                <img src="./images/mountains.jpg" alt="Story image">
                <span class="dp-container">
                        <img src="./images/boy.jpg" alt="Profile pic">
                    </span>
                <span class="name">Priyank Saksena</span>
            </div>

            <div class="story">
                <img src="./images/shoes.jpg" alt="Story image">
                <span class="dp-container">
                        <img src="./images/model.jpg" alt="Profile pic">
                    </span>
                <span class="name">Pragati Adhikari</span>
            </div>
        </div>
        <%--// Post area code..........--%>
        <div class="post create">
            <div class="post-top">
                <div class="dp">
                    <img src="./images/girl.jpg" alt="">
                </div>
                <input type="text" placeholder="What's on your mind, Aashish ?"/>
            </div>

            <div class="post-bottom">
                <div class="action">
                    <i class="fa fa-video"></i>
                    <span>Live video</span>
                </div>
                <div class="action">

                    <i class="fa fa-image"></i>
                    <span>Photo/Video</span>

                </div>
                <div class="action">
                    <i class="fa fa-smile"></i>
                    <span>Feeling/Activity</span>
                </div>
            </div>
        </div>
        <%--............................--%>
        <%--        <div class="post">--%>
        <%--            <div class="post-top">--%>
        <%--                <div class="dp">--%>
        <%--                    <img src="./images/girl.jpg" alt="">--%>
        <%--                </div>--%>
        <%--                <div class="post-info">--%>
        <%--                    <p class="name">Anuska Sharma</p>--%>
        <%--                    <span class="time">12 hrs ago</span>--%>
        <%--                </div>--%>
        <%--                <i class="fas fa-ellipsis-h"></i>--%>
        <%--            </div>--%>

        <%--            <div class="post-content">--%>
        <%--                Roses are red <br>--%>
        <%--                Violets are blue <br>--%>
        <%--                I'm ugly & you are too😏--%>
        <%--            </div>--%>

        <%--            <div class="post-bottom">--%>
        <%--                <div class="action">--%>
        <%--                    <i class="far fa-thumbs-up"></i>--%>
        <%--                    <span>Like</span>--%>
        <%--                </div>--%>
        <%--                <div class="action">--%>
        <%--                    <i class="far fa-comment"></i>--%>
        <%--                    <span>Comment</span>--%>
        <%--                </div>--%>
        <%--                <div class="action">--%>
        <%--                    <i class="fa fa-share"></i>--%>
        <%--                    <span>Share</span>--%>
        <%--                </div>--%>
        <%--            </div>--%>
        <%--        </div>--%>

        <c:forEach var="p" items="${post_list}">
            <div class="post">
                <div class="post-top">
                    <div class="dp">

                        <img src="${userDao.getByID(p.getIdUser()).getAvatar()}" alt="">
                    </div>
                    <div class="post-info">
                        <p class="name">${userDao.getByID(p.getIdUser()).getFullName()}</p>
                        <span class="time">2 days ago</span>
                    </div>
                    <i class="fas fa-ellipsis-h"></i>
                </div>

                <div class="post-content">
                    <p>${p.getMassage()}</p>
                    <img src="${p.getImg()}"/>
                </div>

                <div class="container-post-bottom">
                    <div class="post-bottom">
                        <div class="action">
                            <i class="far fa-thumbs-up"></i>
                            <span>Like</span>
                        </div>
                        <div class="action" onclick="display_comment(${p.getIdPost()})">
                            <i class="far fa-comment"></i>
                            <span>Comment</span>
                        </div>
                        <div class="action">
                            <i class="fa fa-share"></i>
                            <span>Share</span>
                        </div>
                    </div>
                    <div style="display: none" class="content-comment" id="id_comment${p.getIdPost()}">
                    <form action="/home?action=comment&idPost=${p.getIdPost()}" method="post">
                            <div class="write-comment">
                                <img width="30px" height="30px" src="${userDao.getByID(p.getIdUser()).getAvatar()}">
                                <input name="massage" placeholder=" Viết bình luận ">
                                <button type="submit">Send</button>
                            </div>
                            <c:forEach var="comments" items="${commentDao.getByIDPost(p.getIdPost())}">

                            <div class ="all-comment">
                                    <div class="user-comment">
                                        <img src="${userDao.getByID(comments.getIdUser()).getAvatar()}" alt="">
                                    </div>
                                    <div class="post-info-comment" >
                                        <p class="name">${userDao.getByID(comments.getIdUser()).getFullName()}</p>
                                        <p class="massage"> ${comments.getMassage()} </p>
                                    </div>

                            </div>
                            </c:forEach>
                    </form>
                    </div>

                </div>
            </div>
        </c:forEach>


    </div>
    <div class="right-panel">
        <div class="pages-section">
            <h4>Your pages</h4>
            <a class='page' href="#">
                <div class="dp">
                    <img src="./images/logo.png" alt="">
                </div>
                <p class="name">Cody</p>
            </a>

            <a class='page' href="#">
                <div class="dp">
                    <img src="./images/dp.jpg" alt="">
                </div>
                <p class="name">Cody Tutorials</p>
            </a>
        </div>

        <div class="friends-section">
            <h4>Friends</h4>
            <a class='friend' href="#">
                <div class="dp">
                    <img src="./images/dp.jpg" alt="">
                </div>
                <p class="name">Henry Mosely</p>
            </a>

            <a class='friend' href="#">
                <div class="dp">
                    <img src="./images/shoes.jpg" alt="">
                </div>
                <p class="name">George</p>
            </a>

            <a class="friend" href="#">
                <div class="dp">
                    <img src="./images/boy.jpg" alt="">
                </div>
                <p class="name">Aakash Malhotra</p>
            </a>

            <a class="friend" href="#">
                <div class="dp">
                    <img src="./images/model.jpg" alt="">
                </div>
                <p class="name">Ragini Khanna</p>
            </a>

            <a class="friend" href="#">
                <div class="dp">
                    <img src="./images/boy.jpg" alt="">
                </div>
                <p class="name">Justin Bieber</p>
            </a>

            <a class="friend" href="#">
                <div class="dp">
                    <img src="./images/dp.jpg" alt="">
                </div>
                <p class="name">Ramesh GC</p>
            </a>

            <a class="friend" href="#">
                <div class="dp">
                    <img src="./images/model.jpg" alt="">
                </div>
                <p class="name">Sajita Gurung</p>
            </a>

        </div>
    </div>
</div>
<script src="main.js">

</script>
</body>

</html>