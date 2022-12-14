package com.zufar.onlinestore.dto;


import java.util.Collection;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseProductsRequest {

	@NotBlank
	private String customerId;

	@NotNull
	private Collection<ProductInfoDto> products;
}
