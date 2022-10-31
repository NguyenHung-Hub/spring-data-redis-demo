package com.nguyenhung.repository;

import com.nguyenhung.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Repository
public class ProductRepo {


    public static final String HASH_KEY = "Products";

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public Product save(Product product) {
        redisTemplate.opsForHash()
                .put(HASH_KEY, product.getId(), product);
        redisTemplate.expire(HASH_KEY, 10, TimeUnit.SECONDS);

        return product;
    }


    public List<Object> findAll() {
        return redisTemplate.opsForHash().values(HASH_KEY);
    }

    public Product findProductById(int id) {
        return (Product) redisTemplate.opsForHash().get(HASH_KEY, id);
    }

    public String deleteProduct(int id) {
        redisTemplate.opsForHash().delete(HASH_KEY, id);

        return ">> product deleted !!!";
    }

}
