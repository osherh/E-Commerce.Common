package com.ecommerce.common.order.events;

import com.ecommerce.common.order.dto.OrderDTO;

public record OrderRequestEvent(OrderDTO orderDTO) {}
