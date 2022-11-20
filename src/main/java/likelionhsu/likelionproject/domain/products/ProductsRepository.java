package likelionhsu.likelionproject.domain.products;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
    // CRUD 메소드가 자동으로 생성됩니다.
}
