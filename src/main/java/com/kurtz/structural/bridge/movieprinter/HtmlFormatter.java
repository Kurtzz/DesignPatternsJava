package com.kurtz.structural.bridge.movieprinter;

import java.util.List;

public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> deteils) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        builder.append("<th>");
        builder.append("Classification");
        builder.append("</th>");
        builder.append(header);
        builder.append("</th>");

        for (Detail detail: deteils) {
            builder.append("<tr><td>");
            builder.append(detail.getLabel());
            builder.append("</td><td>");
            builder.append(detail.getValue());
            builder.append("</td></tr>");
        }

        builder.append("</table>");
        return builder.toString();
    }
}
