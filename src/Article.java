public class Article {
    private String author;
    private String title;

    public Article (String author, String title){
        this.author = author;
        this.title  = title;
    }

    @Override
    public String toString() {
        return "Article{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

