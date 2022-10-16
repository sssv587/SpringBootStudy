package com.futurebytedance.boot05webadmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/16 - 22:27
 * @Description 参数化测试
 */
@DisplayName("参数化测试")
public class ParameterTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testParameterized(int i) {
        System.out.println(i);
    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana");
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testParameterized2(String i) {
        System.out.println(i);
    }
}
