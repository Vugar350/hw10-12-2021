package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest4 {

    @Test
    void minSales() {
        SQRServiceTest service=new SQRServiceTest();
        long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected=9;
        long actual=service.minSales(sales);
        assertEquals(expected,actual);
    }
}