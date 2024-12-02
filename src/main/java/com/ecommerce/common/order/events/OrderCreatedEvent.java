package com.ecommerce.common.order.events;

import java.util.UUID;

import com.ecommerce.common.order.dto.OrderDTO;

public record OrderCreatedEvent(UUID orderId, OrderDTO orderDTO) {}
