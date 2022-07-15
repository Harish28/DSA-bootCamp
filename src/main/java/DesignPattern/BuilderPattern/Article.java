package DesignPattern.BuilderPattern;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Builder
@Getter
@ToString
public class Article {
    private final Long id;
    private String title;
    private List<String> tags;

    public static void main(String[] args) {
        Article article = Article.builder().id(100L).title("End of era").build();
        System.out.println(article);
    }
}
