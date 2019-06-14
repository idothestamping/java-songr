package com.idothestamping.lab11.songr.SongrController;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestControllerDemoTest {
    RestControllerDemo test;

    @Before
    public void init() {
        test = new RestControllerDemo();
    }

    @Test
    public void testCapIt() {
        assertEquals("Should Capitalize",
                "DOUG", test.capIt("doug"));
    }

    @Test
    public void reverseIt() {
        assertEquals("Should Reverse the sentence",
                "world Hello", test.reverseIt("Hello world"));
    }
}