package designPrinsiples.LSP.after;

public class TagPost extends Post {

    @Override
    public void setPost(String post) {
        super.post = post;
    }
    @Override
    public void setDb(PostDatabase db) {
        super.db = db;
    }

    @Override
    public void createPost(){
        db.addTagPost(post);
    }



}
