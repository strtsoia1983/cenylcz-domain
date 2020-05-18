package com.cenylcz.convert;

import com.cenylcz.constants.TradePlatform;
import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import java.util.stream.Stream;

@Convert
public class TradePlatformConvert implements AttributeConverter<TradePlatform, String> {

    @Override
    public String convertToDatabaseColumn(TradePlatform tradePlatform) {
        if (tradePlatform != null) {
            return tradePlatform.getPlatform();
        }
        return null;
    }

    @Override
    public TradePlatform convertToEntityAttribute(String value) {
        if (value != null) {
            return Stream.of(TradePlatform.values())
                    .filter(tradePlatform -> tradePlatform.getPlatform().equals(value))
                    .findFirst()
                    .orElseThrow(IllegalArgumentException::new);
        }
        return null;
    }
}
