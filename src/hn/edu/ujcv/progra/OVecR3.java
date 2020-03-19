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

    public OVecR3 suma(OVecR3 b){
        //TODO: implementar
        return new OVecR3();
    }

    public OVecR3 resta(OVecR3 b){
        //TODO: implementar
        return new OVecR3();
    }

    public OVecR3 prodCruz(OVecR3 b){
        //
        //  x  y  z
        //  x1 y1 z1       i = y * z1 - z * y1;
        //                 j = - ();
        //                 k = ;
        //
        return new OVecR3();
    }

    public double prodPunto(OVecR3 b){
        //TODO: implementar
        return 0.0f;
    }

    public double magnitud(){
        //TODO: implementar
        return 0.0f;
    }

    // metodos


    // constructores
}
