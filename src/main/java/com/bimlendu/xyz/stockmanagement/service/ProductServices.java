package com.bimlendu.xyz.stockmanagement.service;

import com.bimlendu.xyz.stockmanagement.models.Product;
import com.bimlendu.xyz.stockmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServices {

    @Autowired
    private ProductRepository aProductRepository;

    public String registerProduct(Product aProduct) {
        return null;
    }

    public String updateProduct(Product aProduct) {
        return null;
    }

    public String deleteProduct(String productId) {
        return null;
    }

    public Product getProductDetail(String sku) {
        return null;
    }

    public List<Product> getProductDetails(String groupByClause) throws Exception {
        switch (groupByClause){
            case "brand":
                return aProductRepository.getProductsGroupByBrand();
            case "color":
                return aProductRepository.getProductsGroupByColor();
            case "price":
                return aProductRepository.getProductsGroupByPrice();
            case "size":
                return aProductRepository.getProductsGroupBySize();
            default:
                throw new Exception("Wrong group by clause");

        }
    }
}
