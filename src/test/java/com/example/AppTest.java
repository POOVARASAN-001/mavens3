package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testFirstIsLargest() {
        App app = new App();
        assertEquals(10, app.findLargest(10, 5, 2));
    }

    @Test
    public void testSecondIsLargest() {
        App app = new App();
        assertEquals(20, app.findLargest(4, 20, 15));
    }

    @Test
    public void testThirdIsLargest() {
        App app = new App();
        assertEquals(30, app.findLargest(1, 9, 30));
    }
}
