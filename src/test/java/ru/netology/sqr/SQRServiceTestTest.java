package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTestTest {

    @org.junit.jupiter.api.Test
    void sumSales() {
        SQRServiceTest service=new SQRServiceTest();
        long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected=180;
        long actual=service.sumSales(sales);
        assertEquals(expected,actual);
    }
}