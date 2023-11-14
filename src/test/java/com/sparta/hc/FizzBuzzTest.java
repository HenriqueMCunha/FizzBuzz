package com.sparta.hc;

import com.sparta.hc.fizzbuzz.FizzBuzzgenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    // TDD Process
    // 1. Red - write a test that's meant to fail
    // 2. Green - Write enough code to pass the test
    // 3. Refactor - All tests should still pass

    @Test
    @DisplayName("Check that 3 returns  \"fizz\"")
    void checkThat3ReturnsFizz() {
        Assertions.assertEquals("fizz", FizzBuzzgenerator.getValue(3));
    }

    @Test
    @DisplayName("Check that 5 returns  \"buzz\"")
    void checkThat5ReturnsBuzz() {
        Assertions.assertEquals("buzz", FizzBuzzgenerator.getValue(5));
    }


}
