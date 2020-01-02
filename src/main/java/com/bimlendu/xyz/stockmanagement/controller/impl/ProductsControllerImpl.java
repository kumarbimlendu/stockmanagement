package com.bimlendu.xyz.stockmanagement.controller.impl;

import com.bimlendu.xyz.stockmanagement.controller.ProductsController;
import com.bimlendu.xyz.stockmanagement.models.Product;
import com.bimlendu.xyz.stockmanagement.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductsControllerImpl implements ProductsController {

    @Autowired
    private ProductServices aProductServices;

    @Override
    public String registerProduct(Product aProduct) {
        return null;
    }

    @Override
    public String updateProduct(Product aProduct) {
        return null;
    }

    @Override
    public String deleteProduct(String productId) {
        return null;
    }

    @Override
    public Product getProductDetail(String sku) {
        return aProductServices.getProductDetail(sku);
    }

    @Override
    public List<Product> getProductDetails(String groupByClause) throws Exception {
        return aProductServices.getProductDetails(groupByClause);
    }
}
