package com.cenylcz.domain;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDeserializer extends JsonDeserializer<Timestamp> {

    private static String DATE_FORMAT = "MM/dd/yyyy HH:mm:ss";

    @Override
    public Timestamp deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        Date date;
        try {
            date = simpleDateFormat.parse(jsonParser.getText());
        } catch (ParseException e) {
            throw new IOException(e);
        }
        return new Timestamp(date.getTime());
    }
}
