package com.example.catalogservice.service;

import com.example.catalogservice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalog();

    CatalogEntity getCatalogByProductId(String productId);
}
