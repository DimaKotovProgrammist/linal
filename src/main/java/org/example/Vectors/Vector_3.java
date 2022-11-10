package org.example.Vectors;

public class Vector_3 {
    private double[] vector;
    private double x;
    private double y;
    private double z;

    public Vector_3() {
        this.vector = new double[3];
    }
    public Vector_3(double...coords) {
        assert coords.length == 3 : "Valid vector of dimension 3";
        vector = coords;
        x = coords[0];
        y = coords[1];
        z = coords[2];
    }
    public Vector_3(Vector_3 v) {
        assert v.vector.length == 3 : "Valid vector of dimension 3";
        vector = v.vector;
        x = v.vector[0];
        y = v.vector[1];
        z = v.vector[2];
    }

    public double[] getVector() {
        return vector;
    }
    public void setVector(double...coords) {
        vector = coords;
        x = coords[0];
        y = coords[1];
        z = coords[2];
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
    public String toString(){
        return this.x + ", " + this.y +  ", " + this.z;
    }

    public Vector_3 sum(Vector_3 v2) {
        return new Vector_3(this.x + v2.x, this.y + v2.y, this.z + v2.z);
    }

    public Vector_3 dif(Vector_3 v2){
        return new Vector_3(this.x - v2.x, this.y - v2.y, this.z - v2.z);
    }

    public Vector_3 multi(double n){
        return new Vector_3(this.x * n, this.y * n, this.z * n);
    }

    public Vector_3 division(double n){
        return new Vector_3(this.x / n, this.y / n, this.z / n);
    }

    public double getLength(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public Vector_3 normalization() {
        return new Vector_3(this.x / getLength(), this.y / getLength(), this.z / getLength());
    }

    public double scalarMulti(Vector_3 v2){
        return this.x * v2.x + this.y * v2.y + this.z * v2.z;
    }
    public Vector_3 vectorMulti(Vector_3 v2){
        double x  = this.y * v2.z - v2.y * this.z;
        double y  = this.x * v2.z - v2.x * this.z;
        double z  = this.x * v2.y - v2.x * this.y;
        return new Vector_3(x, y == 0 ? 0 : -y, z);
    }
}
