package likelionhsu.likelionproject.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // CRUD 메소드가 자동으로 생성됩니다.
}
