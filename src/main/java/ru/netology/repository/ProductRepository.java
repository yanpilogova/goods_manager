package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {
    Product[] products = new Product[0];

    public ProductRepository(){
    }

    public ProductRepository(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void add (Product product) {
        Product[] tmp = new Product[products.length + 1];
        System.arraycopy(products, 0, tmp, 0, products.length);
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] findAll() {
        return getProducts();
    }

    public void removeById(int id) {
        Product[] tmp = new Product[products.length -1];
        int i = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[i] = product;
                i++;
            }
        }
        products = tmp;
    }
}