package practice11.Warehouse;

import org.junit.jupiter.api.BeforeEach;

public class InventoryServiceBase {
    protected InventoryService inventoryService;

    @BeforeEach
    protected void setUp(){
        inventoryService = new InventoryService();
    }
}
