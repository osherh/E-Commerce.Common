package com.ecommerce.common.notification.events;

import java.util.UUID;

import com.ecommerce.common.order.dto.OrderDTO;

public record NotificationSentEvent(UUID orderId, OrderDTO orderDTO) {}
