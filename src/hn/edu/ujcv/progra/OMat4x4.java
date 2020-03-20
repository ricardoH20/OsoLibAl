package hn.edu.ujcv.progra;

public class OMat4x4 {
    // miembros
    private double m11,m12,m13,m14;
    private double m21,m22,m23,m24;
    private double m31,m32,m33,m34;
    private double m41,m42,m43,m44;
    


    // accesoras y mutadoras

    // metodos

    public OMat4x4 transpuesta(){
        //TODO: implementar
        return new OMat4x4();
    }

    public OMat4x4 inversa(){
        //TODO: implementar
        return new OMat4x4();
    }
    public OMat4x4 suma(OMat4x4 b){
        //TODO: implementar
        return new OMat4x4();
    }

    public OMat4x4 resta(OMat4x4 b){
        //TODO: implementar
        return new OMat4x4();
    }

    public OMat4x4 mult(OMat4x4 b){
        //TODO: implementar
        //    m11  m12
        //    m21  m22
        //
        //
        //  m11   =  a.m11 * b.m11 + a.m12 * b.m21
        //  m12   =  a.m11 * b.m12 + a.m12 * b.m22
        //
        return new OMat4x4();
    }

    public double determinante(){
        //TODO: implementar
        return 0.0f;
    }

    // Metodos de la clase.
    public static OMat4x4 rotX(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotY(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotZ(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotW(double alpha){

        return new OMat4x4();
    }

    public static OMat4x4 identidad(){


        //TODO: implementar
        return new OMat4x4();
    }

    // constructores
}
