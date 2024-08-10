package com.webproject.App.Service;

import com.webproject.App.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {


    List<Product> products = new ArrayList<>(Arrays.asList
            (
            new Product(78, "Porch", 35000),
            new Product(34, "Chevrolet", 28000),
            new Product(56, "BMW", 45000)
            )
    );






    public List<Product> getProducts(){
        return products;
    }

    public Product getProductByID(int id) {
        return products.stream().
                filter(p -> p.getId() == id)
                .findFirst()
                .orElse(new Product(id, "No such car is exist", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public void show() {
        System.out.println(products);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for (int i = 0; i<products.size();i++){
            if (products.get(i).getId() == product.getId()) index = i;
        products.set(index, product);
        }
    }

    public void deleteProduct(int id) {
        int index = 0;
        for (int i = 0; i<products.size();i++)
            if (products.get(i).getId() == id) index = i;

        products.remove(index);

    }


}
