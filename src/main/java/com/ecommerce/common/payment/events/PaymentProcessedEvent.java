package com.ecommerce.common.payment.events;

import java.util.UUID;

import com.ecommerce.common.order.dto.OrderDTO;

public record PaymentProcessedEvent(UUID orderId, OrderDTO orderDTO) {}
