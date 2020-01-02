package com.bimlendu.xyz.stockmanagement.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    JdbcTemplate categoryJdbCTemplate;
}
