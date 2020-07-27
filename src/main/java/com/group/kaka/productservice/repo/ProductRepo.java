package com.group.kaka.productservice.repo;

import com.group.kaka.productservice.entity.ProductEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CassandraRepository<ProductEntity, String> {
}
