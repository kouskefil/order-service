package com.kouskefil.tech.order_service.DTOs;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber, BigDecimal price, String skuCode, Integer quantity) {
}

