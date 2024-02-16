package designPrinsiples.LSP.before;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PostDatabase db = new PostDatabase();

        List<String> newPosts = new ArrayList<>();
        newPosts.addAll(List.of("Original Post", "#Tag Post", "@Mention Post"));

        Post postObj ;
        for(String post : newPosts){
            if (post.startsWith("@")){
                postObj = new MentionPost();
            }else if (post.startsWith("#")){
                postObj = new TagPost();
            }else {
                postObj = new Post();
            }
            postObj.setPost(post);
            postObj.setDb(db);
            postObj.createPost();
        }


    }
}
