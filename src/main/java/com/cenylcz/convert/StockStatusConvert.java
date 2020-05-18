package com.cenylcz.convert;

import com.cenylcz.constants.StockStatus;
import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import java.util.stream.Stream;

@Convert
public class StockStatusConvert implements AttributeConverter<StockStatus, String> {
    @Override
    public String convertToDatabaseColumn(StockStatus stockStatus) {
        if (stockStatus != null) {
            return stockStatus.getStockStatus();
        }
        return null;
    }

    @Override
    public StockStatus convertToEntityAttribute(String value) {
        if (value != null) {
            return Stream.of(StockStatus.values())
                    .filter(stock -> stock.getStockStatus().equals(value))
                    .findFirst()
                    .orElseThrow(IllegalArgumentException::new);
        }
        return null;
    }
}
