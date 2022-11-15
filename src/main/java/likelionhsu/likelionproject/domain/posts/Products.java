package likelionhsu.likelionproject.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private int price;

    private String author;

    @Builder
    public Products(String title, String content, int price, String author) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.author = author;
    }

}
