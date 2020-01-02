package com.bimlendu.xyz.stockmanagement.controller;

import com.bimlendu.xyz.stockmanagement.models.Product;
import com.bimlendu.xyz.stockmanagement.models.Seller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface ProductsController {

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public @ResponseBody String registerProduct(@RequestBody Product aProduct);

    @RequestMapping(value = "/products/{sku}", method = RequestMethod.PUT)
    public @ResponseBody String updateProduct(@RequestBody Product aProduct);

    @RequestMapping(value = "/products/{sku}", method = RequestMethod.DELETE)
    public @ResponseBody String deleteProduct(@PathVariable String sku);

    @RequestMapping(value = "/products/{sku}", method = RequestMethod.GET)
    public @ResponseBody Product getProductDetail(@PathVariable String sku);

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public @ResponseBody
    List<Product> getProductDetails(@RequestParam("groupBy") String groupByClause) throws Exception;
}
