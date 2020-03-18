package com.abhirockzz;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Functions to generate data to event hubs, consume data from event hubs and
 * store it in cosmosdb
 */
public class OrderProcessor {

    @FunctionName("storeOrders")
    public void storeOrders(
            @EventHubTrigger(name = "orders", eventHubName = "", connection = "EventHubConnectionString", cardinality = Cardinality.ONE) OrderEvent orderEvent,

            @CosmosDBOutput(name = "databaseOutput", databaseName = "AppStore", collectionName = "orders", connectionStringSetting = "CosmosDBConnectionString") OutputBinding<Order> output,

            final ExecutionContext context) {

        Order order = new Order(orderEvent.getOrderId(), Data.CUSTOMER_DATA.get(orderEvent.getCustomerId()),
                orderEvent.getCustomerId(), Data.PRODUCT_DATA.get(orderEvent.getProduct()));

        output.setValue(order);
    }
}
