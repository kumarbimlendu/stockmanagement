package com.bimlendu.xyz.stockmanagement.repository;

import com.bimlendu.xyz.stockmanagement.models.Product;
import com.bimlendu.xyz.stockmanagement.utilities.ProductRowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    JdbcTemplate productJdbCTemplate;

    //Group by brand
    public List<Product> getProductsGroupByBrand(){
        ArrayList<Product> result = null;
        result = (ArrayList<Product>) productJdbCTemplate.query("select * from product group by brand", new ProductRowMapper());
        return result;
    }
    //Group by price
    public List<Product> getProductsGroupByPrice(){
        ArrayList<Product> result = null;
        result = (ArrayList<Product>) productJdbCTemplate.query("select * from product group by price", new ProductRowMapper());
        return result;
    }
    //Group by color
    public List<Product> getProductsGroupByColor(){
        ArrayList<Product> result = null;
        result = (ArrayList<Product>) productJdbCTemplate.query("select * from product group by color", new ProductRowMapper());
        return result;
    }
    //Group by size
    public List<Product> getProductsGroupBySize(){
        ArrayList<Product> result = null;
        result = (ArrayList<Product>) productJdbCTemplate.query("select * from product group by size", new ProductRowMapper());
        return result;
    }
    //get by sku
    public List<Product> getProductBySKU(String sku){
        ArrayList<Product> result = null;
        result = (ArrayList<Product>) productJdbCTemplate.query("select * from product where sku = ?", new Object[]{sku}, new ProductRowMapper());
        return result;
    }

}
