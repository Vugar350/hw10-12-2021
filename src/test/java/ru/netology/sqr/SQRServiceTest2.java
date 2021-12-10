package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest2 {

    @Test
    void avgSales() {
        SQRServiceTest service=new SQRServiceTest();
        long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int countMonth=12;
        long expected=15;
        long actual=service.avgSales(sales);
        assertEquals(expected,actual);
    }
}