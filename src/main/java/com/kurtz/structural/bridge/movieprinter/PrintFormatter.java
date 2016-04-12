package com.kurtz.structural.bridge.movieprinter;

import java.util.List;

public class PrintFormatter implements Formatter{
    @Override
    public String format(String header, List<Detail> deteils) {
        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");

        for (Detail detail : deteils) {
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
