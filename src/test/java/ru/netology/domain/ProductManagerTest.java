package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    void getRepository() {

    }

    @Test
    void setRepository() {
    }

    @Test
    void addProducts() {
        Product bookOne = new Book(1, "Cake book", 1010, "Ivanov A.V.");
        Product smartphoneOne = new Smartphone(3, "Nokia", 11200, "Nokia Lmt");

        Product[] expected = new Product[]{bookOne, smartphoneOne};
        ProductManager manager = new ProductManager();
        manager.add(bookOne);
        manager.add(smartphoneOne);

        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void findAll() {
    }

    @Test
    void removedByID() {
        Product bookOne = new Book(1, "Cake book", 1010, "Ivanov A.V.");

        Product[] expected = new Product[0];
        ProductManager manager = new ProductManager();
        manager.add(bookOne);
        manager.removedById(1);

        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void searchByName() {
        Product bookOne = new Book(1, "Cake book", 1010, "Ivanov A.V.");
        Product smartphoneOne = new Smartphone(3, "Nokia", 11200, "Nokia Lmt");

        Product[] expected = new Product[]{bookOne};
        ProductManager manager = new ProductManager();
        manager.add(bookOne);
        manager.add(smartphoneOne);

        Product[] actual = manager.searchBy("Cake");

        assertArrayEquals(expected, actual);
    }

    @Test
    void matches() {
    }
}