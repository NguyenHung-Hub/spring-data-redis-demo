package com.nguyenhung.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash(value = "Products", timeToLive = 10000)
public class Product implements Serializable {

    @Id
    private int id;
    private String name;
    private int quantity;
    private long price;

}
