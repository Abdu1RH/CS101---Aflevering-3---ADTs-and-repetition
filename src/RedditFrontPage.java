import java.util.ArrayList;


public class RedditFrontPage {
    private ArrayList<RedditPost> redditPosts;

    public RedditFrontPage(){
        this.redditPosts = new ArrayList<>();
    }

    public void addRedditPost(RedditPost redditPost){
        this.redditPosts.add(redditPost);
    }

    public ArrayList<RedditPost> getRedditPosts() {
        return redditPosts;
    }

    public void deleteRedditPost(int index){
        if (index >= 0 && index < this.redditPosts.size()){
            this.redditPosts.remove(index);
        }
        else {
            System.out.println("Index does not exist");
        }
    }

}

