package com.ecommerce.common.inventory.events;

import java.util.UUID;

import com.ecommerce.common.order.dto.OrderDTO;

public record InventoryProductConsumptionEvent(UUID orderId, OrderDTO orderDTO) {}
