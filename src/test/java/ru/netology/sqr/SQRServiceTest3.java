package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest3 {

    @Test
    void maxSales() {
        SQRServiceTest service=new SQRServiceTest();
        long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected=8;
        long actual=service.maxSales(sales);
        assertEquals(expected,actual);
    }
}