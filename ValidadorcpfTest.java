package com.validarcpf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorCpfTest {

    @Test
    public void testCpfValido() {
        assertTrue(ValidadorCpf.validarCpf("12345678901"));
    }

    @Test
    public void testCpfInvalido() {
        assertFalse(ValidadorCpf.validarCpf("123456789"));
    }
}
