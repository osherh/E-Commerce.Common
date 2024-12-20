package com.ecommerce.common.order.dto;

import java.util.UUID;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import com.ecommerce.common.order.validation.ValidOrderAmount;

public record ProductDTO(
        @NotNull UUID productId,
        @ValidOrderAmount(min = 1, max = 30, message = "Order amount must be between 1 and 30")
        @NotNull @Positive int quantity)
{
}