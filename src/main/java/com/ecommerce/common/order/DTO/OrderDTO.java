package com.ecommerce.common.order.dto;

import java.util.List;
import java.util.UUID;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.lang.Nullable;

//TODO: add duplicate product validation(ensure a product does not appear more than once)
public record OrderDTO(
        @NotNull UUID customerId,
        @NotEmpty List<@Valid ProductDTO> products,
        OrderPriority priority,
        @Nullable String couponCode)
{

}
//TODO: deploy it to AWS CodeArtifact
