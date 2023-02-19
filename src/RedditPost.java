import java.time.LocalDate;

public class RedditPost {
    private String author;
    private String title;
    private int upDownVotesBAL;
    private LocalDate dateOfPost;

    public RedditPost (String title, String author){
        this.author = author;
        this.title = title;
        this.upDownVotesBAL = 1;
        this.dateOfPost = LocalDate.now();
    }

    @Override
    public String toString() {
        return "RedditPost{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", upDownVotesBAL=" + upDownVotesBAL +
                ", dateOfPost=" + dateOfPost +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUpDownVotesBAL() {
        return upDownVotesBAL;
    }

    public void setUpDownVotesBAL(int upDownVotesBAL) {
        this.upDownVotesBAL = upDownVotesBAL;
    }

    public LocalDate getDateOfPost() {
        return dateOfPost;
    }

    public void setDateOfPost(LocalDate dateOfPost) {
        this.dateOfPost = dateOfPost;
    }
}
