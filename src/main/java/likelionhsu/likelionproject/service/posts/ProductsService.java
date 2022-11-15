package likelionhsu.likelionproject.service.posts;

import likelionhsu.likelionproject.domain.posts.ProductsRepository;
import likelionhsu.likelionproject.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class ProductsService {
    private final ProductsRepository productsRepository;

    @Transactional
    public Long save(ProductsSaveRequestDto requestDto) {
        return productsRepository.save(requestDto.toEntity()).getId();
    }
}
