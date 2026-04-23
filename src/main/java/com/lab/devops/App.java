package com.lab.devops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Starting Application...");
        int result = add(5, 10);
        logger.info("Result is: {}", result);
    }

    /**
     * Hàm tính tổng 2 số.
     * @param a số thứ nhất
     * @param b số thứ hai
     * @return tổng của a và b
     */
    public static int add(int a, int b) {
        return a + b;
    }
}