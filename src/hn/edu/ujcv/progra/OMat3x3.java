package hn.edu.ujcv.progra;

public class OMat3x3 {
    // miembros
    private double m11,m12,m13;
    private double m21,m22,m23;
    private double m31,m32,m33;




    // accesoras y mutadoras

    public double getM11() {
        return m11;
    }

    public double getM12() {
        return m12;
    }

    public double getM13() {
        return m13;
    }

    public double getM21() {
        return m21;
    }

    public double getM22() {
        return m22;
    }

    public double getM23() {
        return m23;
    }

    public double getM31() {
        return m31;
    }

    public double getM32() {
        return m32;
    }

    public double getM33() {
        return m33;
    }

    public void setM11(double m11) {
        this.m11 = m11;
    }

    public void setM12(double m12) {
        this.m12 = m12;
    }

    public void setM13(double m13) {
        this.m13 = m13;
    }

    public void setM21(double m21) {
        this.m21 = m21;
    }

    public void setM22(double m22) {
        this.m22 = m22;
    }

    public void setM23(double m23) {
        this.m23 = m23;
    }

    public void setM31(double m31) {
        this.m31 = m31;
    }

    public void setM32(double m32) {
        this.m32 = m32;
    }

    public void setM33(double m33) {
        this.m33 = m33;
    }
    // metodos

    public OMat3x3 transpuesta(){
        //TODO: implementar
        return new OMat3x3();
    }

    public OMat3x3 inversa(){
        //TODO: implementar
        return new OMat3x3();
    }
    public OMat3x3 suma(OMat3x3 b){
        //TODO: implementar
        return new OMat3x3();
    }

    public OMat3x3 resta(OMat3x3 b){
        //TODO: implementar
        return new OMat3x3();
    }

    public OMat3x3 mult(OMat3x3 b){
        //TODO: implementar
        //    m11  m12
        //    m21  m22
        //
        //
        //  m11   =  a.m11 * b.m11 + a.m12 * b.m21
        //  m12   =  a.m11 * b.m12 + a.m12 * b.m22
        //
        return new OMat3x3();
    }

    public double determinante(){
        //TODO: implementar
        return 0.0f;
    }

    // Metodos de la clase.
    public static OMat3x3 rotX(double alpha){


        return new OMat3x3();
    }

    public static OMat3x3 rotY(double alpha){


        return new OMat3x3();
    }

    public static OMat3x3 rotZ(double alpha){


        return new OMat3x3();
    }

    public static OMat3x3 identidad(){


        //TODO: implementar
        return new OMat3x3();
    }

    // constructores


}
