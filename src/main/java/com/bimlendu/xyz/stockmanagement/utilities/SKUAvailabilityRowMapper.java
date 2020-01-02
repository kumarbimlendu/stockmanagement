package com.bimlendu.xyz.stockmanagement.utilities;

import com.bimlendu.xyz.stockmanagement.models.SKUAvailability;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SKUAvailabilityRowMapper implements RowMapper<SKUAvailability> {

    @Override
    public SKUAvailability mapRow(ResultSet resultSet, int i) throws SQLException {
        SKUAvailability aSKUAvailability = new SKUAvailability();
        aSKUAvailability.setSku(resultSet.getString("sku"));
        aSKUAvailability.setAvailableNos(resultSet.getInt("available_nos"));
        return aSKUAvailability;
    }
}
