package practice11.Warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {
    private Map<String, List<Product>> inventory = new HashMap<>();
    private boolean isInventoryOpen = true;

    public void setIsInventoryOpen(boolean isInventoryOpen) {
        this.isInventoryOpen = isInventoryOpen;
    }

    public void addToInventory(Product product){
        if(!isInventoryOpen){
            return;
        }
        if(inventory.get(product.getProductCategory()) != null){
            List<Product> list = inventory.get(product.getProductCategory());
            list.add(product);
        }else {
            List<Product> list = new ArrayList<>();
            list.add(product);
            inventory.put(product.getProductCategory(), list);
        }

    }

    public List<Product> getProductsByCategory(String productCategory){
        List<Product> list = inventory.get(productCategory);
        if(list == null || list.isEmpty()){
            throw new OutOfStockException("Товаров в выбранной категории нет");
        }else {
          return List.copyOf(list);
        }
    }

    public List<Product> filterByCategory(String productCategory){
        return inventory.values().stream()
                .flatMap(products -> products.stream())
                .filter(product -> product.getProductCategory().equals(productCategory))
                .toList();
    }

    public List<Product> filterByPrice(double price){
        return inventory.values().stream()
                .flatMap(products -> products.stream())
                .filter(product -> product.getPrice() == price)
                .toList();
    }

}
