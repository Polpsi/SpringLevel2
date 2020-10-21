package springlevel2.shop2.service;

import springlevel2.shop2.domain.Bucket;
import springlevel2.shop2.domain.User;
import springlevel2.shop2.dto.BucketDto;

import java.util.List;

public interface BucketService {
    Bucket createBucket(User user, List<Long> productIds);

    void addProducts(Bucket bucket, List<Long> productIds);

    BucketDto getBucketByUser(String name);
}
