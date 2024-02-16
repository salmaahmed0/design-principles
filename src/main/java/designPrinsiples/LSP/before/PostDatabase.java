package designPrinsiples.LSP.before;

public class PostDatabase {
    public void add(String post){
        System.out.println("Original Post : " + post);
    }
    public void addMentionPost(String post){
        System.out.println("Mention Post : " + post);
    }
     public void addTagPost(String post){
        System.out.println("Tag Post : " + post);
    }
}
