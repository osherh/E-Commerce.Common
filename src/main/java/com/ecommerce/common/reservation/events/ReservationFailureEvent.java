package com.ecommerce.common.reservation.events;

import java.util.UUID;

import com.ecommerce.common.order.dto.OrderDTO;

public record ReservationFailureEvent(UUID orderId, OrderDTO orderDTO) {}
