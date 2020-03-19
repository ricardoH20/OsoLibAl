package hn.edu.ujcv.progra;

public class OVecR3 {

    // miembros
    private double x;
    private double z;
    private double v;

    // accesoras y mutadoras

    public void setX(double x) {
        this.x = x;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getZ() {
        return z;
    }

    public double getX() {
        return x;
    }

    public double getV() {
        return v;
    }
    
    // metodos
    public OVecR3 suma(OVecR3 b)
    {

        return new OVecR3(this.x + b.x, this.v + b.v, this.z + b.z);
    }

    public OVecR3 resta(OVecR3 b)
    {
        return new OVecR3(this.x - b.x, this.v - b.v, this.z - b.z);
    }

    public OVecR3 prodCruz(OVecR3 b)
    {
        double i, j, k;
        i = (this.v * b.z) - (this.z * b.v);
        j = -((this.x * b.z) - (this.z * b.x));
        k =  (this.x * b.v) - (this.v * b.x);
        return new OVecR3(i,j,k);
    }

    public double prodPunto(OVecR3 b){
        double respuesta;
        respuesta = (this.x * b.x) + (this.y * b.y) + (this.z * b.z);
        return respuesta;
    }

    public double magnitud()
    {
        double respuesta;
        respuesta = Math.sqrt( Math.pow(this.x,2) + Math.pow(this.y,2) + Math.pow(this.z,2));
        return respuesta;
    }

    @java.lang.Override
    public String toString(){
        return "i: " + getX() + " j: " + getY() + " k: " + getZ();
    }





    // constructores
    public OVecR3(){}

    public OVecR3(OVecR3 a){}

    public OVecR3(double x, double y,double z)
    {
        this.x = x;
        this.v = v;
        this.z = z;
    }
}
