package com.example.jesus.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    util operaciones = new util();
    @Test
    public void pruebaSuma() {
        float b = operaciones.suma(2, 3);
        assertTrue(b == 1);
    }
}