package org.example.Matrices;


import org.example.Vectors.Vector_4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Matrix4x4Test {

    @Test
    void testToString() {
        Matrix_4x4 m = new Matrix_4x4(new Vector_4(1, 1, 1, 1), new Vector_4(2, 2, 2, 2), new Vector_4(3, 3, 3, 3), new Vector_4());
        assertEquals("1.0, 2.0, 3.0, 0.0\n1.0, 2.0, 3.0, 0.0\n1.0, 2.0, 3.0, 0.0\n1.0, 2.0, 3.0, 0.0", m.toString());
    }


    @Test
    void sum() {
        Matrix_4x4 m1 = new Matrix_4x4(new Vector_4(1, 1, 1, 1), new Vector_4(2, 2, 2, 2), new Vector_4(3, 3, 3, 3), new Vector_4());
        Matrix_4x4 m2 = new Matrix_4x4(new Vector_4(4, 4, 4, 4), new Vector_4(5, 5, 5, 5), new Vector_4(6, 6, 6, 6), new Vector_4());
        assertEquals(new Matrix_4x4(new Vector_4(5, 5, 5, 5), new Vector_4(7, 7, 7, 7), new Vector_4(9, 9, 9, 9), new Vector_4()).toString(), m1.sum(m2).toString());
    }

    @Test
    void dif() {
        Matrix_4x4 m1 = new Matrix_4x4(new Vector_4(1, 1, 1, 1), new Vector_4(2, 2, 2, 2), new Vector_4(3, 3, 3, 3), new Vector_4());
        Matrix_4x4 m2 = new Matrix_4x4(new Vector_4(4, 4, 4, 4), new Vector_4(5, 5, 5, 5), new Vector_4(6, 6, 6, 6), new Vector_4());
        assertEquals(new Matrix_4x4(new Vector_4(-3, -3, -3, -3), new Vector_4(-3, -3, -3, -3), new Vector_4(-3, -3, -3, -3), new Vector_4()).toString(), m1.dif(m2).toString());
    }

    @Test
    void multiV() {
        Matrix_4x4 m = new Matrix_4x4(new Vector_4(1, 1, 1, 1), new Vector_4(2, 2, 2, 2), new Vector_4(3, 3, 3, 3), new Vector_4());
        Vector_4 v = new Vector_4(4, 5, 6, 0);
        assertEquals(new Vector_4(32, 32, 32, 32).toString(), m.multiV(v).toString());
    }

    @Test
    void multiM() {
        Matrix_4x4 m1 = new Matrix_4x4(new Vector_4(1, 1, 1, 1), new Vector_4(2, 2, 2, 2), new Vector_4(3, 3, 3, 3), new Vector_4());
        Matrix_4x4 m2 = new Matrix_4x4(new Vector_4(4, 4, 4, 4), new Vector_4(5, 5, 5, 5), new Vector_4(6, 6, 6, 6), new Vector_4());
        assertEquals(new Matrix_4x4(new Vector_4(24, 24, 24, 24), new Vector_4(30, 30, 30, 30), new Vector_4(36, 36, 36, 36), new Vector_4()).toString(), m1.multiM(m2).toString());
    }

    @Test
    void trans() {
        Matrix_4x4 m = new Matrix_4x4(new Vector_4(1, 1, 1, 1), new Vector_4(2, 2, 2, 2), new Vector_4(3, 3, 3, 3), new Vector_4());
        assertEquals("1.0, 1.0, 1.0, 1.0\n2.0, 2.0, 2.0, 2.0\n3.0, 3.0, 3.0, 3.0\n0.0, 0.0, 0.0, 0.0", m.trans().toString());
    }

    @Test
    void identityM() {
        Matrix_4x4 m = new Matrix_4x4().identityM();
        assertEquals("1.0, 0.0, 0.0, 0.0\n0.0, 1.0, 0.0, 0.0\n0.0, 0.0, 1.0, 0.0\n0.0, 0.0, 0.0, 1.0", m.trans().toString());
    }
}