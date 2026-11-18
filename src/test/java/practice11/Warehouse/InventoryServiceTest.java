package practice11.Warehouse;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventoryServiceTest {

    @Test
    public void checkAddingProductIfInventoryIsOpen() {
        InventoryService inventoryService = new InventoryService();
        inventoryService.setIsInventoryOpen(true);
        Product product = new Product("Пиво", 20, "Алкоголь");
        inventoryService.addToInventory(product);
        List<Product> actual = inventoryService.getProductsByCategory("Алкоголь");
        List<Product> expected = List.of(product);
        assertEquals(expected, actual);
    }

    @Test
    public void checkAddingProductIfInventoryIsClosed() {
        InventoryService inventoryService = new InventoryService();
        inventoryService.setIsInventoryOpen(false);
        Product product = new Product("Пиво", 20, "Алкоголь");
        inventoryService.addToInventory(product);
        assertThrows(OutOfStockException.class, () -> inventoryService.getProductsByCategory("Алкоголь"));
    }

    @Test
    public void checkCategoryIsEmpty(){
        InventoryService inventoryService = new InventoryService();
        assertThrows(OutOfStockException.class, () -> inventoryService.getProductsByCategory("Напитки"));
    }

    @Test //добавить параметаризованный тест? можно ли параметаризировать добавление?
    public void checkFilterByCategory(){
        InventoryService inventoryService = new InventoryService();
        Product beer = new Product("Пиво", 20, "Алкоголь");
        Product cola = new Product("Кола", 11, "Напитки");
        Product juice = new Product("Добрый", 6, "Напитки");
        inventoryService.addToInventory(beer);
        inventoryService.addToInventory(cola);
        inventoryService.addToInventory(juice);
        List<Product> actual = inventoryService.filterByCategory("Напитки");
        List<Product> expected = List.of(cola, juice);
        assertEquals(expected, actual);
    }

    @Test
    public void checkFilterByEmptyCategory(){
        InventoryService inventoryService = new InventoryService();
        Product beer = new Product("Пиво", 20, "Напитки");
        inventoryService.addToInventory(beer);
        List<Product> actual = inventoryService.filterByCategory("Стройматериалы");
        List<Product> expected = List.of();
        assertEquals(expected, actual);
    }

    @Test
    public void checkFilterByPrice(){
        InventoryService inventoryService = new InventoryService();
        Product beer = new Product("Пиво", 20.2, "Алкоголь");
        Product cola = new Product("Кола", 11.1, "Напитки");
        inventoryService.addToInventory(beer);
        inventoryService.addToInventory(cola);
        List<Product> actual = inventoryService.filterByPrice(20.2);
        List<Product> expected = List.of(beer);
        assertEquals(expected, actual);
    }

    @Test
    public void checkFilterByWrongPrice(){
        InventoryService inventoryService = new InventoryService();
        Product beer = new Product("Пиво", 20.2, "Алкоголь");
        Product cola = new Product("Кола", 11.1, "Напитки");
        inventoryService.addToInventory(beer);
        inventoryService.addToInventory(cola);
        List<Product> actual = inventoryService.filterByPrice(20.1);
        List<Product> expected = List.of();
        assertEquals(expected, actual);
    }

    @Test
    public void checkAddingDuplicateProduct() {
        InventoryService inventoryService = new InventoryService();
        Product beer = new Product("Пиво", 20, "Напитки");
        inventoryService.addToInventory(beer);
        inventoryService.addToInventory(beer);
        List<Product> actual = inventoryService.getProductsByCategory("Напитки");
        List<Product> expected = List.of(beer, beer);
        assertEquals(expected, actual);
    }

    @Test
    public void checkAddingProductAfterReopeningInventory() {
        InventoryService inventoryService = new InventoryService();
        inventoryService.setIsInventoryOpen(false);
        Product blockedProduct = new Product("Пиво", 20, "Напитки");
        inventoryService.addToInventory(blockedProduct);
        inventoryService.setIsInventoryOpen(true);
        Product acceptedProduct = new Product("Кола", 11, "Напитки");
        inventoryService.addToInventory(acceptedProduct);
        List<Product> actual = inventoryService.getProductsByCategory("Напитки");
        List<Product> expected = List.of(acceptedProduct);
        assertEquals(expected, actual);
    }

    @Test
    public void checkProductsDoNotMixBetweenCategories() {
        InventoryService inventoryService = new InventoryService();
        Product beer = new Product("Пиво", 20, "Напитки");
        Product nails = new Product("Гвозди", 5, "Стройматериалы");
        inventoryService.addToInventory(beer);
        inventoryService.addToInventory(nails);
        List<Product> actualDrinks = inventoryService.getProductsByCategory("Напитки");
        List<Product> actualMaterials = inventoryService.getProductsByCategory("Стройматериалы");
        assertEquals(List.of(beer), actualDrinks);
        assertEquals(List.of(nails), actualMaterials);
    }



}
