package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class fonctionTest {
    fonction test = new fonction();
    @Test
    void addition(){
        assertEquals(9,test.addition(4,5));
    }

    @Test
    void sous(){
        assertEquals(5,test.soustraction(10,5));
    }
}
