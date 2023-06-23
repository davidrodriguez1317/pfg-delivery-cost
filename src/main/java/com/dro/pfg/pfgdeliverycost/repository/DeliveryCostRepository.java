package com.dro.pfg.pfgdeliverycost.repository;

import com.dro.pfg.pfgdeliverycost.model.entity.PriceEntity;
import org.springframework.stereotype.Component;

/**
 * This class is mocking a real repository for testing purposes
 */
@Component
public class DeliveryCostRepository {
    public PriceEntity getPriceByIdAndCurrency(String currency, String id) {
        return PriceEntity.builder()
                .id(id)
                .price(2.1f)
                .currency(currency)
                .build();
    }
}
