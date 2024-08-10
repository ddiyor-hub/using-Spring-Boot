package com.webproject.App.Controller;

import com.webproject.App.Model.Product;
import com.webproject.App.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductByID(id);
    }
    @PostMapping("/product")
    public void addProduct(@RequestBody Product product)
    {
        System.out.println(product);
        productService.addProduct(product);
    }

   @PostMapping("/products")
    public void addProducts(@RequestBody List<Product> products) {
        productService.addProducts(products);
    }


    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product) {
        System.out.println(product);
        productService.updateProduct(product);
    }

    @DeleteMapping("products/{id}")
    public void deleteProduct(@PathVariable int id)
    {
        productService.deleteProduct(id);
    }








}
