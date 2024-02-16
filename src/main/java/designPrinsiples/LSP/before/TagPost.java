package designPrinsiples.LSP.before;

public class TagPost extends Post{

    @Override
    public void setPost(String post) {
        super.post = post;
    }
    @Override
    public void setDb(PostDatabase db) {
        super.db = db;
    }

    public void createTagPost(){
        db.addTagPost(post);
    }



}
