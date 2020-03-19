package hn.edu.ujcv.progra;

public class OVecR4 {
    // miembros
    private double x;
    private double z;
    private double v;
    private double w;

    // accesoras y mutadoras

    public double getV() {
        return v;
    }

    public double getW() {
        return w;
    }

    public double getX() {
        return x;
    }

    public double getZ() {
        return z;
    }

    public void setV(double v) {
        this.v = v;
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setZ(double z) {
        this.z = z;
    }
    // metodos

    public OVecR4 suma(OVecR4 b){
        //TODO: implementar
        return new OVecR4();
    }

    public OVecR4 resta(OVecR4 b){
        //TODO: implementar
        return new OVecR4();
    }

    public double prodPunto(OVecR4 b){
        //TODO: implementar
        return 0.0f;
    }

    public double magnitud(){
        //TODO: implementar
        return 0.0f;
    }

    // constructores
    public OVecR4(){ }
    public OVecR4(OVecR4 a) {}
    public OVecR4(double x, double y, double z, double v){
        this.x = x;
        this.w = w;
        this.z = z;
        this.v = v;
    }



}
