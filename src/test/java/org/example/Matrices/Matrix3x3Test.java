package org.example.Matrices;

import org.example.Vectors.Vector_3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Matrix3x3Test {

    @Test
    void testToString() {
        Matrix_3x3 m = new Matrix_3x3(new Vector_3(1, 1, 1), new Vector_3(2, 2, 2), new Vector_3(3, 3, 3));
        assertEquals("1.0, 2.0, 3.0\n1.0, 2.0, 3.0\n1.0, 2.0, 3.0", m.toString());
    }


    @Test
    void sum() {
        Matrix_3x3 m1 = new Matrix_3x3(new Vector_3(1, 1, 1), new Vector_3(2, 2, 2), new Vector_3(3, 3, 3));
        Matrix_3x3 m2 = new Matrix_3x3(new Vector_3(4, 4, 4), new Vector_3(5, 5, 5), new Vector_3(6, 6, 6));
        assertEquals(new Matrix_3x3(new Vector_3(5, 5, 5), new Vector_3(7, 7, 7), new Vector_3(9, 9, 9)).toString(), m1.sum(m2).toString());
    }

    @Test
    void dif() {
        Matrix_3x3 m1 = new Matrix_3x3(new Vector_3(1, 1, 1), new Vector_3(2, 2, 2), new Vector_3(3, 3, 3));
        Matrix_3x3 m2 = new Matrix_3x3(new Vector_3(4, 4, 4), new Vector_3(5, 5, 5), new Vector_3(6, 6, 6));
        assertEquals(new Matrix_3x3(new Vector_3(-3, -3, -3), new Vector_3(-3, -3, -3), new Vector_3(-3, -3, -3)).toString(), m1.dif(m2).toString());
    }

    @Test
    void multiV() {
        Matrix_3x3 m = new Matrix_3x3(new Vector_3(1, 1, 1), new Vector_3(2, 2, 2), new Vector_3(3, 3, 3));
        Vector_3 v = new Vector_3(4, 5, 6);
        assertEquals(new Vector_3(32, 32, 32).toString(), m.multiV(v).toString());
    }

    @Test
    void multiM() {
        Matrix_3x3 m1 = new Matrix_3x3(new Vector_3(1, 1, 1), new Vector_3(2, 2, 2), new Vector_3(3, 3, 3));
        Matrix_3x3 m2 = new Matrix_3x3(new Vector_3(4, 4, 4), new Vector_3(5, 5, 5), new Vector_3(6, 6, 6));
        assertEquals(new Matrix_3x3(new Vector_3(24, 24, 24), new Vector_3(30, 30, 30), new Vector_3(36, 36, 36)).toString(), m1.multiM(m2).toString());
    }

    @Test
    void trans() {
        Matrix_3x3 m = new Matrix_3x3(new Vector_3(1, 1, 1), new Vector_3(2, 2, 2), new Vector_3(3, 3, 3));
        assertEquals("1.0, 1.0, 1.0\n2.0, 2.0, 2.0\n3.0, 3.0, 3.0", m.trans().toString());
    }

    @Test
    void identityM() {
        Matrix_3x3 m = new Matrix_3x3().identityM();
        assertEquals("1.0, 0.0, 0.0\n0.0, 1.0, 0.0\n0.0, 0.0, 1.0", m.trans().toString());
    }
}