package com.ecommerce.common.reservation.events;

import java.util.UUID;

import com.ecommerce.common.order.dto.OrderDTO;

public record ReservationCreatedEvent(UUID orderId, OrderDTO orderDTO) {}
