package com.bimlendu.xyz.stockmanagement.repository;

import com.bimlendu.xyz.stockmanagement.models.Product;
import com.bimlendu.xyz.stockmanagement.models.SKUAvailability;
import com.bimlendu.xyz.stockmanagement.utilities.ProductRowMapper;
import com.bimlendu.xyz.stockmanagement.utilities.SKUAvailabilityRowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SKUAvailabilityRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    JdbcTemplate skUAvailabilityJdbCTemplate;

    //available products by sku
    //available products by seller
    public List<SKUAvailability> getProductBySKU(String seller){
        ArrayList<SKUAvailability> result = null;
        result = (ArrayList<SKUAvailability>) skUAvailabilityJdbCTemplate.query("select * from sku_availablity where sku in (select sku from product where seller = ?)", new Object[]{seller}, new SKUAvailabilityRowMapper());
        return result;
    }
}
