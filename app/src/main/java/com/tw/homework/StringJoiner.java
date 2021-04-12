package com.tw.homework;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringJoiner {

    /**
     * Return the string which joined with comma character. Please skip the null element.
     *
     * @param input A list which maybe includes null and String element.
     * @return The joined string.
     */
    public static String join(List<String> input) {
        if (input == null) {
            return "";
        }
        return input.stream()
                .filter(i -> !Objects.isNull(i))
                .collect(Collectors.joining(","));
    }
}
