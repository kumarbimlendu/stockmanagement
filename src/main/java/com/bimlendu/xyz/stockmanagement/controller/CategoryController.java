package com.bimlendu.xyz.stockmanagement.controller;

import com.bimlendu.xyz.stockmanagement.models.Category;
import org.springframework.web.bind.annotation.*;

@RestController
public interface CategoryController {

    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    public @ResponseBody String createCategory(@RequestBody Category aCategory);

    @RequestMapping(value = "/categories/{categoryId}", method = RequestMethod.PUT)
    public @ResponseBody String updateCategory(@RequestBody Category aCategory);

    @RequestMapping(value = "/categories/{categoryId}", method = RequestMethod.DELETE)
    public @ResponseBody String deleteCategory(@PathVariable String categoryId);

    @RequestMapping(value = "/categories/{categoryId}", method = RequestMethod.GET)
    public @ResponseBody Category getCategory(@PathVariable String categoryId);

}
