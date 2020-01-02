package com.bimlendu.xyz.stockmanagement.utilities;

import com.bimlendu.xyz.stockmanagement.models.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product aProduct = new Product();
        aProduct.setBrand(resultSet.getString("brand"));
        aProduct.setCategories(resultSet.getString("category"));
        aProduct.setColor(resultSet.getString("color"));
        aProduct.setPrice(resultSet.getString("price"));
        aProduct.setSeller(resultSet.getString("seller"));
        aProduct.setSize(resultSet.getString("size"));
        aProduct.setSku(resultSet.getString("sku"));
        return aProduct;
    }
}
