package org.example.Vectors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector4Test {

    @Test
    void testToString() {
        Vector_4 v = new Vector_4(1, 2, 3, 4);
        assertEquals("1.0, 2.0, 3.0, 4.0" , v.toString());
    }

    @Test
    void sum() {
        Vector_4 v1 = new Vector_4(1, 2, 3, 4);
        Vector_4 v2 = new Vector_4(4, 3, 2, 1);
        assertEquals(new Vector_4(5, 5, 5, 5).toString(), v1.sum(v2).toString());
    }

    @Test
    void dif() {
        Vector_4 v1 = new Vector_4(1, 2, 3, 4);
        Vector_4 v2 = new Vector_4(4, 3, 2, 1);
        assertEquals(new Vector_4(-3, -1, 1, 3).toString(), v1.dif(v2).toString());
    }

    @Test
    void multi() {
        Vector_4 v1 = new Vector_4(1, 2, 3, 4);
        int n = 2;
        assertEquals(new Vector_4(2, 4, 6, 8).toString(), v1.multi(n).toString());
    }

    @Test
    void division() {
        Vector_4 v1 = new Vector_4(1, 2, 3, 4);
        int n = 2;
        assertEquals(new Vector_4(0.5, 1, 1.5, 2).toString(), v1.division(n).toString());
    }

    @Test
    void getLength() {
        Vector_4 v1 = new Vector_4(1, 2, 3, 4);
        assertEquals(Math.sqrt(1 + 2 * 2 + 3 * 3 + 4 * 4), v1.getLength());
    }

    @Test
    void normalization() {
        Vector_4 v1 = new Vector_4(1, 2, 3, 4);
        double l = v1.getLength();
        assertEquals(new Vector_4(1 / l, 2 / l, 3 / l, 4 / l).toString(), v1.normalization().toString());
    }

    @Test
    void scalarMulti() {
        Vector_4 v1 = new Vector_4(1, 2, 3, 4);
        Vector_4 v2 = new Vector_4(5, 6, 7 ,8);
        assertEquals(70, v1.scalarMulti(v2));
    }
}