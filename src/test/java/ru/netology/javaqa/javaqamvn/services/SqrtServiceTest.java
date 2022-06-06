package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.SqrtService;

public class SqrtServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrt.csv")

    public void shouldCalcExact(int expected, int x, int y) {
        SqrtService service = new SqrtService();

        //int expected = 3;
        int actual = service.rangeSqrt(150, 250);

        Assertions.assertEquals(expected, actual);
    }
}
