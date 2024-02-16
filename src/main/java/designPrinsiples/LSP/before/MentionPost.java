package designPrinsiples.LSP.before;

public class MentionPost extends Post{
    @Override
    public void setPost(String post) {
        super.post = post;
    }
    @Override
    public void setDb(PostDatabase db) {
        super.db = db;
    }
    public void createMentionPost(){
        db.addMentionPost(post);
    }
}
