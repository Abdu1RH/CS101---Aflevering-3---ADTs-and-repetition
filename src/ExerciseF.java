public class ExerciseF {
    public static void main(String[] args) {
/*
Write a class: RedditFrontPage
The RedditFrontPage has:
An ArrayList of all RedditPosts
A method in RedditFrontPage deletes a RedditPost from the list, by its index number
 */
        RedditFrontPage newRedditPosts = new RedditFrontPage();

        RedditPost redditPost1 = new RedditPost("How do i earn money online","Hans182");
        RedditPost redditPost2 = new RedditPost("What do you think about this", "Chris98");
        RedditPost redditPost3 = new RedditPost("Rate my song from 1-10", "JustinBieber101");
        RedditPost redditPost4 = new RedditPost("What is reddit?", "Newuser2813");

        newRedditPosts.addRedditPost(redditPost1);
        newRedditPosts.addRedditPost(redditPost2);
        newRedditPosts.addRedditPost(redditPost3);
        newRedditPosts.addRedditPost(redditPost4);

        newRedditPosts.deleteRedditPost(2);

        System.out.println(newRedditPosts.getRedditPosts());

    }
}
