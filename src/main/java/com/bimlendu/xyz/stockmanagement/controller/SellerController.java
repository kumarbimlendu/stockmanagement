package com.bimlendu.xyz.stockmanagement.controller;

import com.bimlendu.xyz.stockmanagement.models.Category;
import com.bimlendu.xyz.stockmanagement.models.Seller;
import org.springframework.web.bind.annotation.*;

@RestController
public interface SellerController {

    @RequestMapping(value = "/sellers", method = RequestMethod.POST)
    public @ResponseBody String createSeller(@RequestBody Seller aSeller);

    @RequestMapping(value = "/sellers/{sellerId}", method = RequestMethod.PUT)
    public @ResponseBody String updateCategory(@RequestBody Seller aSeller);

    @RequestMapping(value = "/sellers/{sellerId}", method = RequestMethod.DELETE)
    public @ResponseBody String deleteSeller(@PathVariable String sellerId);

    @RequestMapping(value = "/sellers/{sellerId}", method = RequestMethod.GET)
    public @ResponseBody Seller getSeller(@PathVariable String sellerId);
}
