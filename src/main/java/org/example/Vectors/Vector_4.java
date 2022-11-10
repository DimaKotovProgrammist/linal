package org.example.Vectors;

public class Vector_4 {
    private double[] vector;
    private double x;
    private double y;
    private double z;
    private double q;

    public Vector_4() {
        this.vector = new double[4];
    }
    public Vector_4(double...coords) {
        assert coords.length == 4 : "Valid vector of dimension 4";
        vector = coords;
        x = coords[0];
        y = coords[1];
        z = coords[2];
        q = coords[3];
    }
    public Vector_4(Vector_4 v) {
        assert v.vector.length == 4 : "Valid vector of dimension 4";
        vector = v.vector;
        x = v.vector[0];
        y = v.vector[1];
        z = v.vector[2];
        q = v.vector[3];
    }

    public double[] getVector() {
        return vector;
    }
    public void setVector(double...coords) {
        vector = coords;
        x = coords[0];
        y = coords[1];
        z = coords[2];
        q = coords[3];
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getQ() {
        return q;
    }
    public String toString(){
        return this.x + ", " + this.y +  ", " + this.z + ", " + this.q;
    }

    public Vector_4 sum(Vector_4 v2) {
        return new Vector_4(this.x + v2.x, this.y + v2.y, this.z + v2.z, this.q + v2.q);
    }

    public Vector_4 dif(Vector_4 v2){
        return new Vector_4(this.x - v2.x, this.y - v2.y, this.z - v2.z, this.q - v2.q);
    }

    public Vector_4 multi(double n){
        return new Vector_4(this.x * n, this.y * n, this.z * n, this.q * n);
    }

    public Vector_4 division(double n){
        return new Vector_4(this.x / n, this.y / n, this.z / n, this.q / n);
    }

    public double getLength(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z + this.q * this.q);
    }

    public Vector_4 normalization() {
        return new Vector_4(this.x / getLength(), this.y / getLength(), this.z / getLength(), this.q / getLength());
    }

    public double scalarMulti(Vector_4 v2){
        return this.x * v2.x + this.y * v2.y + this.z * v2.z + this.q * v2.q;
    }
}
