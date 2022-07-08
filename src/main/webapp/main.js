function display_comment(idPost) {

    if (document.querySelector(`#id_comment${idPost}`).style.display === "none") {
        document.querySelector(`#id_comment${idPost}`).style.display = "block";
    } else {
        document.querySelector(`#id_comment${idPost}`).style.display = "none";
    }
}