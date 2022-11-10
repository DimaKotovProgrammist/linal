package org.example.Matrices;

import org.example.Vectors.Vector_4;

import java.util.Scanner;

public class Matrix_4x4 {
    double[][] matrix = new double[4][4];
    Vector_4 v1;
    Vector_4 v2;
    Vector_4 v3;
    Vector_4 v4;

    public Matrix_4x4() {
        v1 = new Vector_4(matrix[0][0], matrix[1][0], matrix[2][0], matrix[3][0]);
        v2 = new Vector_4(matrix[0][1], matrix[1][1], matrix[2][1], matrix[3][1]);
        v3 = new Vector_4(matrix[0][2], matrix[1][2], matrix[2][2], matrix[3][2]);
        v4 = new Vector_4(matrix[0][3], matrix[1][3], matrix[2][3], matrix[3][3]);
    }
    public Matrix_4x4(Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        v1 = new Vector_4(matrix[0][0], matrix[1][0], matrix[2][0], matrix[3][0]);
        v2 = new Vector_4(matrix[0][1], matrix[1][1], matrix[2][1], matrix[3][1]);
        v3 = new Vector_4(matrix[0][2], matrix[1][2], matrix[2][2], matrix[3][2]);
        v4 = new Vector_4(matrix[0][3], matrix[1][3], matrix[2][3], matrix[3][3]);
    }
    public Matrix_4x4(Matrix_4x4 matrix) {
        assert matrix.matrix.length == 4 && matrix.matrix[0].length == 4 : "Valid matrix of dimension 4x4";
        this.matrix = matrix.matrix;
        v1 = new Vector_4(matrix.matrix[0][0], matrix.matrix[1][0], matrix.matrix[2][0], matrix.matrix[3][0]);
        v2 = new Vector_4(matrix.matrix[0][1], matrix.matrix[1][1], matrix.matrix[2][1], matrix.matrix[3][1]);
        v3 = new Vector_4(matrix.matrix[0][2], matrix.matrix[1][2], matrix.matrix[2][2], matrix.matrix[3][2]);
        v4 = new Vector_4(matrix.matrix[0][3], matrix.matrix[1][3], matrix.matrix[2][3], matrix.matrix[3][3]);
    }
    public Matrix_4x4(double[][] matrix) {
        assert matrix.length == 4 && matrix[0].length == 4 : "Valid matrix of dimension 4x4";
        this.matrix = matrix;
        v1 = new Vector_4(matrix[0][0], matrix[1][0], matrix[2][0], matrix[3][0]);
        v2 = new Vector_4(matrix[0][1], matrix[1][1], matrix[2][1], matrix[3][1]);
        v3 = new Vector_4(matrix[0][2], matrix[1][2], matrix[2][2], matrix[3][2]);
        v4 = new Vector_4(matrix[0][3], matrix[1][3], matrix[2][3], matrix[3][3]);
    }
    public Matrix_4x4(Vector_4 v1, Vector_4 v2, Vector_4 v3, Vector_4 v4) {
        matrix[0] = new Vector_4(v1.getX(), v2.getX(), v3.getX(), v4.getX()).getVector();
        matrix[1] = new Vector_4(v1.getY(), v2.getY(), v3.getY(), v4.getY()).getVector();
        matrix[2] = new Vector_4(v1.getZ(), v2.getZ(), v3.getZ(), v4.getZ()).getVector();
        matrix[3] = new Vector_4(v1.getQ(), v2.getQ(), v3.getQ(), v4.getQ()).getVector();
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }
    public Matrix_4x4(double[] v1, double[] v2, double[] v3, double[] v4) {
        assert v1.length == 4 && v2.length == 4 && v3.length == 4 && v4.length == 4: "Valid vector of dimension 4";
        matrix[0] = new Vector_4(v1[0], v2[0], v3[0], v4[0]).getVector();
        matrix[1] = new Vector_4(v1[1], v2[1], v3[1], v4[1]).getVector();
        matrix[2] = new Vector_4(v1[2], v2[2], v3[2], v4[2]).getVector();
        matrix[3] = new Vector_4(v1[3], v2[3], v3[3], v4[3]).getVector();
        this.v1 = new Vector_4(v1);
        this.v2 = new Vector_4(v2);
        this.v3 = new Vector_4(v3);
        this.v4 = new Vector_4(v4);
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public Vector_4 getV1() {
        return v1;
    }

    public Vector_4 getV2() {
        return v2;
    }

    public Vector_4 getV3() {
        return v3;
    }

    public String toString() {
        StringBuilder sB = new StringBuilder();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                sB.append(this.matrix[i][j]).append(j == 3 ? "" : ", ");
            }
            sB.append(i == 3 ? "" : "\n");
        }
        return sB.toString();
    }

    public Matrix_4x4 sum(Matrix_4x4 m2) {
        Matrix_4x4 m = new Matrix_4x4();
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[0].length; j++){
                m.matrix[i][j] =  this.matrix[i][j] + m2.matrix[i][j];
            }
        }
        return new Matrix_4x4(m);
    }

    public Matrix_4x4 sum(double[][] m2) {
        double[][] m = new double[4][4];
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[0].length; j++){
                m[i][j] =  this.matrix[i][j] + m2[i][j];
            }
        }
        return new Matrix_4x4(m);
    }

    public Matrix_4x4 dif(Matrix_4x4 m2) {
        Matrix_4x4 m = new Matrix_4x4();
        for(int i = 0; i < this.matrix.length; i++) {
            for(int j = 0; j < this.matrix[0].length; j++){
                m.matrix[i][j] =  this.matrix[i][j] - m2.matrix[i][j];
            }
        }
        return new Matrix_4x4(m);
    }
    public Matrix_4x4 dif(double[][] m2) {
        double[][] m = new double[4][4];
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[0].length; j++){
                m[i][j] =  this.matrix[i][j] - m2[i][j];
            }
        }
        return new Matrix_4x4(m);
    }
    public Vector_4 multiV(double[] v1) {
        double[] v = new double[4];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                v[i] += this.matrix[i][j] * v1[j];
            }
        }
        return new Vector_4(v);
    }

    public Vector_4 multiV(Vector_4 v1) {
       Vector_4 v = new Vector_4();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                v.getVector()[i] += this.matrix[i][j] * v1.getVector()[j];
            }
        }
        return new Vector_4(v);
    }
    public Matrix_4x4 multiM(double[][] m2) {
        double[][] m = new double[4][4];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                for (int k = 0; k < this.matrix.length; k++) {
                    m[i][j] += this.matrix[i][k] * m2[k][j];
                }
            }
        }
        return new Matrix_4x4(m);
    }

    public Matrix_4x4 multiM(Matrix_4x4 m2) {
        Matrix_4x4 m = new Matrix_4x4();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                for (int k = 0; k < this.matrix.length; k++) {
                    m.matrix[i][j] += this.matrix[i][k] * m2.matrix[k][j];
                }
            }
        }
        return new Matrix_4x4(m);
    }

    public Matrix_4x4 trans() {
        Matrix_4x4 m = new Matrix_4x4();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                m.matrix[j][i] = this.matrix[i][j];
            }
        }
        return new Matrix_4x4(m);
    }
    public Matrix_4x4 identityM () {
        Matrix_4x4 m = new Matrix_4x4();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    m.matrix[i][j] = 1;
                }
            }
        }
        return new Matrix_4x4(m);
    }
}
