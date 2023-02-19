public class ExerciseE {
    public static void main(String[] args) {
/*
Write a class: RedditPost
A Redditpost has:

A date of which is has been posted
An author
A balance of upvotes / downvotes
A Title

When a new instance of RedditPost is instantiated:
The current date will be generated.
The balance of upvotes and downvotes starts at 1.
The title and author has to be provided by the constructor.
Ensure all attributes are private, but accesible by getters & setters.
 */
        RedditPost firstPost = new RedditPost("Buy Crypto Now", "BitcoinMan123");
        System.out.println(firstPost);

        RedditPost secondPost = new RedditPost("Wakey Wines owner becomes millionaire selling prime", "WakefieldReporter0113");
        System.out.println(secondPost);
    }
}
