package springlevel2.shop2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springlevel2.shop2.domain.Bucket;

public interface BucketRepository extends JpaRepository<Bucket, Long> {
}
