package com.tw.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class StringJoinerTest {

    @Test
    void should_join_and_skip_null() {
        final var list = Arrays.asList("a", "b", null, "c");

        final var actualJoinResult = StringJoiner.join(list);

        assertEquals("a,b,c", actualJoinResult);
    }

    @ParameterizedTest
    @MethodSource("listProvider")
    void should_return_empty_string(List<String> list) {
        assertEquals("", StringJoiner.join(list));
    }

    static Stream<Arguments> listProvider() {
        return Stream.of(
                Arguments.of(Collections.emptyList()),
                Arguments.of(Arrays.asList(null, null))
        );
    }
}
