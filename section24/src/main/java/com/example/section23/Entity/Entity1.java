package com.example.section23.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@Table(name="products")
public class Entity {

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name="product_id ",length = 244,nullable = false)
    private Long product_id;

    @Column(name = "name", length = 250, nullable = false)
    private String name;

    @Column(name = "description", length = 500, nullable = false)
    private String description;

    @Column(name = "price", length = 10,precision = 2, nullable = false)
    private BigDecimal price;

    @Column(name = "popularity", nullable = false)
    private Integer popularity;

    @Column(name = "image_url", length = 500)
    private String imageUrl;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "created_by",length = 20, nullable = false)
    private String createdBy;

    @Column(name = "updated_at", nullable = true)
    private Instant updatedAt;

    @Column(name = "updated_by", nullable = true)
    private String updatedBy;
}
