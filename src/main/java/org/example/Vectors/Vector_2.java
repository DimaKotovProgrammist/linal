package org.example.Vectors;

public class Vector_2 {
    private double[] vector;
    private double x;
    private double y;

    public Vector_2() {
        this.vector = new double[2];
    }
    public Vector_2(double...coords) {
        assert coords.length == 2 : "Valid vector of dimension 2";
        vector = coords;
        x = coords[0];
        y = coords[1];
    }
    public Vector_2(Vector_2 v) {
        assert v.vector.length == 2 : "Valid vector of dimension 2";
        vector = v.vector;
        x = v.vector[0];
        y = v.vector[1];
    }

    public double[] getVector() {
        return vector;
    }
    public void setVector(double...coords) {
        vector = coords;
        x = coords[0];
        y = coords[1];
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString(){
        return this.x + ", " + this.y;
    }

    public Vector_2 sum(Vector_2 v2){
        return new Vector_2(this.x + v2.x, this.y + v2.y);
    }

    public Vector_2 dif(Vector_2 v2){
        return new Vector_2(this.x - v2.x, this.y - v2.y);
    }

    public Vector_2 multi(double n){
        return new Vector_2(this.x * n, this.y * n);
    }

    public Vector_2 division(double n){
        return new Vector_2(this.x / n, this.y / n);
    }

    public double getLength(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Vector_2 normalization() {
        return new Vector_2(this.x / getLength(), this.y / getLength());
    }

    public double scalarMulti(Vector_2 v2){
        return this.x * v2.x + this.y * v2.y;
    }
}
