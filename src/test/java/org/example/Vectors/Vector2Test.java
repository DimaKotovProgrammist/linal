package org.example.Vectors;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector2Test {

    @Test
    void testToString() {
        Vector_2 v = new Vector_2(1, 2);
        assertEquals("1.0, 2.0" , v.toString());
    }

    @Test
    void sum() {
        Vector_2 v1 = new Vector_2(1, 2);
        Vector_2 v2 = new Vector_2(2, 1);
        assertEquals(new Vector_2(3, 3).toString(), v1.sum(v2).toString());
    }

    @Test
    void dif() {
        Vector_2 v1 = new Vector_2(1, 2);
        Vector_2 v2 = new Vector_2(2, 1);
        assertEquals(new Vector_2(-1, 1).toString(), v1.dif(v2).toString());
    }

    @Test
    void multi() {
        Vector_2 v1 = new Vector_2(1, 2);
        int n = 2;
        assertEquals(new Vector_2(2, 4).toString(), v1.multi(n).toString());
    }

    @Test
    void division() {
        Vector_2 v1 = new Vector_2(1, 2);
        int n = 2;
        assertEquals(new Vector_2(0.5, 1).toString(), v1.division(n).toString());
    }

    @Test
    void getLength() {
        Vector_2 v1 = new Vector_2(1, 2);
        assertEquals(Math.sqrt(1 + 2 * 2), v1.getLength());
    }

    @Test
    void normalization() {
        Vector_2 v1 = new Vector_2(1, 2);
        double l = v1.getLength();
        assertEquals(new Vector_2(1 / l, 2 / l).toString(), v1.normalization().toString());
    }

    @Test
    void scalarMulti() {
        Vector_2 v1 = new Vector_2(1, 2);
        Vector_2 v2 = new Vector_2(3, 4);
        assertEquals(11, v1.scalarMulti(v2));
    }
}