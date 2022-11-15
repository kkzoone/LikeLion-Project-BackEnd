package likelionhsu.likelionproject.domain.posts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ProductsRepositoryTest {
    @Autowired
    ProductsRepository productsRepository;

    @AfterEach
    public void cleanup() {
        productsRepository.deleteAll();
    }

    @Test
    public void 상품저장_불러오기() {
        String title = "상품 제목";
        String content = "상품 본문";
        int price = 120000;

        productsRepository.save(Products.builder()
                .title(title)
                .content(content)
                .price(price)
                .author("kimhunsope@naver.com")
                .build());

        List<Products> productsList = productsRepository.findAll();

        Products post = productsList.get(0);
        assertThat(post.getTitle()).isEqualTo(title);
        assertThat(post.getContent()).isEqualTo(content);
        assertThat(post.getPrice()).isEqualTo(price);
    }
}
