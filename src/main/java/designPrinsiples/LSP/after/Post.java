package designPrinsiples.LSP.after;

public class Post {
    PostDatabase db;
    String post;

    public PostDatabase getDb() {
        return db;
    }

    public void setDb(PostDatabase db) {
        this.db = db;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void createPost(){
        db.add(post);
    }


}
