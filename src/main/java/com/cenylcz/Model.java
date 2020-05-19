package com.cenylcz;

import com.cenylcz.domain.business.Forex;
import com.cenylcz.domain.business.Stock;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "className")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Stock.class, name = "stock"),
        @JsonSubTypes.Type(value = Forex.class, name = "forex")
})
public abstract class Model {
}
