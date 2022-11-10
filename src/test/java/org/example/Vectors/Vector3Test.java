package org.example.Vectors;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector3Test {

    @Test
    void testToString() {
        Vector_3 v = new Vector_3(1, 2, 3);
        assertEquals("1.0, 2.0, 3.0" , v.toString());
    }

    @Test
    void sum() {
        Vector_3 v1 = new Vector_3(1, 2, 3);
        Vector_3 v2 = new Vector_3(3, 2, 1);
        assertEquals(new Vector_3(4, 4, 4).toString(), v1.sum(v2).toString());
    }

    @Test
    void dif() {
        Vector_3 v1 = new Vector_3(1, 2, 3);
        Vector_3 v2 = new Vector_3(3, 2, 1);
        assertEquals(new Vector_3(-2, 0, 2).toString(), v1.dif(v2).toString());
    }

    @Test
    void multi() {
        Vector_3 v1 = new Vector_3(1, 2, 3);
        int n = 2;
        assertEquals(new Vector_3(2, 4, 6).toString(), v1.multi(n).toString());
    }

    @Test
    void division() {
        Vector_3 v1 = new Vector_3(1, 2, 3);
        int n = 2;
        assertEquals(new Vector_3(0.5, 1, 1.5).toString(), v1.division(n).toString());
    }

    @Test
    void getLength() {
        Vector_3 v1 = new Vector_3(1, 2, 3);
        assertEquals(Math.sqrt(1 + 2 * 2 + 3 * 3), v1.getLength());
    }

    @Test
    void normalization() {
        Vector_3 v1 = new Vector_3(1, 2, 3);
        double l = v1.getLength();
        assertEquals(new Vector_3(1 / l, 2 / l, 3 / l).toString(), v1.normalization().toString());
    }

    @Test
    void scalarMulti() {
        Vector_3 v1 = new Vector_3(1, 2, 3);
        Vector_3 v2 = new Vector_3(4, 5, 6);
        assertEquals(32, v1.scalarMulti(v2));
    }

    @Test
    void vectorMulti() {
        Vector_3 v1 = new Vector_3(1, 2, 3);
        Vector_3 v2 = new Vector_3(4, 5, 6);
        assertEquals(new Vector_3(-3, 6, -3).toString(), v1.vectorMulti(v2).toString());
    }
}