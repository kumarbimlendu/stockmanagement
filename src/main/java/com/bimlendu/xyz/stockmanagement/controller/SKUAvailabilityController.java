package com.bimlendu.xyz.stockmanagement.controller;

import com.bimlendu.xyz.stockmanagement.models.SKUAvailability;
import org.springframework.web.bind.annotation.*;

@RestController
public interface SKUAvailabilityController {

    @RequestMapping(value = "/skus", method = RequestMethod.POST)
    public @ResponseBody String createSKU(@RequestBody SKUAvailability aSKUAvailability);

    @RequestMapping(value = "/skus/{sku}", method = RequestMethod.PUT)
    public @ResponseBody String updateSKU(@RequestBody SKUAvailability aSKUAvailability);

    @RequestMapping(value = "/skus/{sku}", method = RequestMethod.DELETE)
    public @ResponseBody String deleteSKU(@PathVariable String sku);

    @RequestMapping(value = "/skus/{sku}", method = RequestMethod.GET)
    public @ResponseBody
    SKUAvailability getSKU(@PathVariable String sku);
}
