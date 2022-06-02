package ru.netology.service;

import org.junit.Test;

import static org.junit.Test.*;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        int boundary = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testRemain2() {
        int boundary = 1100;
        int expected = 900;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemain3() {
        int boundary = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);
        assertEquals(expected, actual);

    }

    @Test
    public void testRemain4() {
        int boundary = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemain5() {
        int boundary = 1100;
        int expected = 900;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemain6() {
        int boundary = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);
        assertEquals(expected, actual);
    }


}