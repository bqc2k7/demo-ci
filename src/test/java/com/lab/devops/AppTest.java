package com.lab.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        // Kiểm tra xem 5 + 10 có đúng bằng 15 không
        assertEquals(15, App.add(5, 10));
    }

    @Test
    public void testAddNegative() {
        // Kiểm tra với số âm: 5 + (-10) có bằng -5 không
        assertEquals(-5, App.add(5, -10));
    }
}