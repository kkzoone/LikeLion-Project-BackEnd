package likelionhsu.likelionproject.web.dto;

import likelionhsu.likelionproject.domain.products.Products;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductsSaveRequestDto {
    private String title;
    private String content;
    private int price;
    private String author;
    @Builder
    public ProductsSaveRequestDto(String title, String content, int price, String author) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.author = author;
    }

    public Products toEntity() {
        return Products.builder()
                .title(title)
                .content(content)
                .price(price)
                .author(author)
                .build();
    }
}
