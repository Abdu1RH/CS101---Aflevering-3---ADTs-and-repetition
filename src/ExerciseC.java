import java.util.ArrayList;

public class ExerciseC {
    public static void main(String[] args) {
/*
C)
Write a class: Article
An article has an author and a title
Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method
 */

        Article article1 = new Article("Michael Jackson", "Worrying inflation levels");
        Article article2 = new Article("Steve Jobs", "How to get rich in 2023");
        Article article3 = new Article("Harvey Junior", "Human body needs shawarma study shows");
        Article article4 = new Article("Harry Stevens", "UFO spotted in Alaska");
        Article article5 = new Article("Logan Paul", "Crypto scams in 2023");

        ArrayList allArticles = new ArrayList<>();

        allArticles.add(article1);
        allArticles.add(article2);
        allArticles.add(article3);
        allArticles.add(article4);
        allArticles.add(article5);

        System.out.println(allArticles);
    }

  }
