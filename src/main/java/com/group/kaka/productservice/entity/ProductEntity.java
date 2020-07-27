package com.group.kaka.productservice.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("product")
@Data
public class ProductEntity {

    @PrimaryKey
    private String productId;
    @Column()
    private String title;
    private String brand;
    private String publisher;
    private Integer length;
    private Integer breath;
    private Integer height;


}
