package org.example.Matrices;

import org.example.Vectors.Vector_3;

import java.util.Scanner;

public class Matrix_3x3 {
    double[][] matrix = new double[3][3];
    Vector_3 v1;
    Vector_3 v2;
    Vector_3 v3;

    public Matrix_3x3() {
        v1 = new Vector_3(matrix[0][0], matrix[1][0], matrix[2][0]);
        v2 = new Vector_3(matrix[0][1], matrix[1][1], matrix[2][1]);
        v3 = new Vector_3(matrix[0][2], matrix[1][2], matrix[2][2]);
    }
    public Matrix_3x3(Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        v1 = new Vector_3(matrix[0][0], matrix[1][0], matrix[2][0]);
        v2 = new Vector_3(matrix[0][1], matrix[1][1], matrix[2][1]);
        v3 = new Vector_3(matrix[0][2], matrix[1][2], matrix[2][2]);
    }
    public Matrix_3x3(Matrix_3x3 matrix) {
        assert matrix.matrix.length == 3 && matrix.matrix[0].length == 3 : "Valid matrix of dimension 3x3";
        this.matrix = matrix.matrix;
        v1 = new Vector_3(matrix.matrix[0][0], matrix.matrix[1][0], matrix.matrix[2][0]);
        v2 = new Vector_3(matrix.matrix[0][1], matrix.matrix[1][1], matrix.matrix[2][1]);
        v3 = new Vector_3(matrix.matrix[0][2], matrix.matrix[1][2], matrix.matrix[2][2]);
    }
    public Matrix_3x3(double[][] matrix) {
        assert matrix.length == 3 && matrix[0].length == 3 : "Valid matrix of dimension 3x3";
        this.matrix = matrix;
        v1 = new Vector_3(matrix[0][0], matrix[1][0], matrix[2][0]);
        v2 = new Vector_3(matrix[0][1], matrix[1][1], matrix[2][1]);
        v3 = new Vector_3(matrix[0][2], matrix[1][2], matrix[2][2]);
    }
    public Matrix_3x3(Vector_3 v1, Vector_3 v2, Vector_3 v3) {
        matrix[0] = new Vector_3(v1.getX(), v2.getX(), v3.getX()).getVector();
        matrix[1] = new Vector_3(v1.getY(), v2.getY(), v3.getY()).getVector();
        matrix[2] = new Vector_3(v1.getZ(), v2.getZ(), v3.getZ()).getVector();
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public Matrix_3x3(double[] v1, double[] v2, double[] v3) {
        assert v1.length == 3 && v2.length == 3 && v3.length == 3 : "Valid vector of dimension 3";
        matrix[0] = new Vector_3(v1[0], v2[0], v3[0]).getVector();
        matrix[1] = new Vector_3(v1[1], v2[1], v3[1]).getVector();
        matrix[2] = new Vector_3(v1[2], v2[2], v3[2]).getVector();
        this.v1 = new Vector_3(v1);
        this.v2 = new Vector_3(v2);
        this.v3 = new Vector_3(v3);
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public Vector_3 getV1() {
        return v1;
    }

    public Vector_3 getV2() {
        return v2;
    }

    public Vector_3 getV3() {
        return v3;
    }

    public Matrix_3x3 sum(Matrix_3x3 m2) {
        Matrix_3x3 m = new Matrix_3x3();
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[0].length; j++){
                m.matrix[i][j] =  this.matrix[i][j] + m2.matrix[i][j];
            }
        }
        return new Matrix_3x3(m);
    }
    public String toString() {
        StringBuilder sB = new StringBuilder();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                sB.append(this.matrix[i][j]).append(j == 2 ? "" : ", ");
            }
            sB.append(i == 2 ? "" : "\n");
        }
        return sB.toString();
    }

    public Matrix_3x3 sum(double[][] m2) {
        double[][] m = new double[3][3];
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[0].length; j++){
                m[i][j] =  this.matrix[i][j] + m2[i][j];
            }
        }
        return new Matrix_3x3(m);
    }

    public Matrix_3x3 dif(Matrix_3x3 m2) {
        Matrix_3x3 m = new Matrix_3x3();
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[0].length; j++){
                m.matrix[i][j] =  this.matrix[i][j] - m2.matrix[i][j];
            }
        }
        return new Matrix_3x3(m);
    }
    public Matrix_3x3 dif(double[][] m2) {
        double[][] m = new double[3][3];
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[0].length; j++){
                m[i][j] =  this.matrix[i][j] - m2[i][j];
            }
        }
        return new Matrix_3x3(m);
    }
    public Vector_3 multiV(double[] v1) {
        double[] v = new double[3];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                v[i] += this.matrix[i][j] * v1[j];
            }
        }
        return new Vector_3(v);
    }

    public Vector_3 multiV(Vector_3 v1) {
        Vector_3 v = new Vector_3();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                v.getVector()[i] += this.matrix[i][j] * v1.getVector()[j];
            }
        }
        return new Vector_3(v);
    }
    public Matrix_3x3 multiM(double[][] m2) {
        double[][] m = new double[3][3];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                for (int k = 0; k < this.matrix.length; k++) {
                    m[i][j] += this.matrix[i][k] * m2[k][j];
                }
            }
        }
        return new Matrix_3x3(m);
    }

    public Matrix_3x3 multiM(Matrix_3x3 m2) {
        Matrix_3x3 m = new Matrix_3x3();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                for (int k = 0; k < this.matrix.length; k++) {
                    m.matrix[i][j] += this.matrix[i][k] * m2.matrix[k][j];
                }
            }
        }
        return new Matrix_3x3(m);
    }

    public Matrix_3x3 trans() {
        Matrix_3x3 m = new Matrix_3x3();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                m.matrix[j][i] = this.matrix[i][j];
            }
        }
        return new Matrix_3x3(m);
    }
    public Matrix_3x3 identityM () {
        Matrix_3x3 m = new Matrix_3x3();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    m.matrix[i][j] = 1;
                }
            }
        }
        return new Matrix_3x3(m);
    }
}
