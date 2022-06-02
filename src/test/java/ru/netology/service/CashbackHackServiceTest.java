package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        int boundary = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemain2() {
        int boundary = 1100;
        int expected = 900;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain3() {
        int boundary = 1999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);
        assertEquals(actual, expected);

    }


}