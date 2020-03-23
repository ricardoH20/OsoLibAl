package hn.edu.ujcv.progra;
import java.util.Scanner;

public class LectorTeclado {
    // Patron de diseño Singleton.
    private static LectorTeclado instance;
    private Scanner m_SC;

    public static LectorTeclado getInstance()
    {
        if(instance == null)
        {
            instance = new LectorTeclado();
        }
        return instance;
    }

    private LectorTeclado()
    {
        m_SC = new Scanner(System.in);
    }

    public int obtenerEntero(int valorPorDefecto, String mensaje)
    {
        int retval = valorPorDefecto;

        try
        {
            retval = m_SC.nextInt();
        }
        catch (Exception e)
        {
            System.out.println(mensaje);
        }

        return retval;
    }

    public int obtenerEnteroValidado(String mensajeReintento)
    {
        int retval = 0;

        while (!m_SC.hasNextInt())
        {
            m_SC.next();
            System.out.println(mensajeReintento);
        }

        retval = m_SC.nextInt();
        return retval;
    }

    public double obtenerDoubleValidado(String mensajeReintento)
    {
        double retval = 0;

        while (!m_SC.hasNextDouble())
        {
            m_SC.next();
            System.out.println(mensajeReintento);
        }

        retval = m_SC.nextDouble();
        return retval;
    }
    public OVecR2 lectorVectorR2() {
        LectorTeclado lec = new LectorTeclado();
        OVecR2 vector = new OVecR2();
        System.out.println("Ingrese el valor x del vector:");
        vector.setX(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor y del vector:");
        vector.setY(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        return vector;
    }
    public OVecR3 lectorVectorR3() {
        LectorTeclado lec = new LectorTeclado();
        OVecR3 vector = new OVecR3();
        System.out.println("Ingrese el valor x del vector:");
        vector.setX(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor y del vector:");
        vector.setZ(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor z del vector:");
        vector.setV(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        return vector;
    }
    public  OVecR4 lectorVectorR4(){
        LectorTeclado lec = new LectorTeclado();
        OVecR4 vector = new OVecR4();
        System.out.println("Ingrese el valor x del vector:");
        vector.setX(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor y del vector:");
        vector.setZ(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor z del vector:");
        vector.setV(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor t del vector:");
        vector.setW(lec.obtenerEnteroValidado("Ingrese un numero valido"));
        return vector;
    }
    public  OMat2x2 lectorMatriz2x2(){
        LectorTeclado lec = new LectorTeclado();
        OMat2x2 matriz = new OMat2x2();
        System.out.println("Ingrese el valor 11 correspondiente a la matriz: ");
        matriz.setM11(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 12 correspondiente a la matriz:");
        matriz.setM12(lec.obtenerDoubleValidado("Ingrese numero valido"));
        System.out.println("Ingrese el valor 21 correspondiente a la matriz:");
        matriz.setM21(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 22 orrespondiente de la matriz:");
        matriz.setM22(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        return matriz;
    }

    public  OMat3x3 lectorMatriz3x3(){
        LectorTeclado lec = new LectorTeclado();
        OMat3x3 matriz = new OMat3x3();
        System.out.println("Ingrese el valor 11 correspondiente a la matriz: ");
        matriz.setM11(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 12 correspondiente a la matriz:");
        matriz.setM12(lec.obtenerDoubleValidado("Ingrese numero valido"));
        System.out.println("Ingrese el valor 13 correspondiente a la matriz:");
        matriz.setM13(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 21 correspondiente a la matriz:");
        matriz.setM21(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 22 correspondiente de la matriz:");
        matriz.setM22(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 23 correspondiente de la matriz:");
        matriz.setM23(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 31 corrsppndiente a la matriz:");
        matriz.setM31(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 32 correspondiente a la matriz:");
        matriz.setM32(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 33 correspondiente a la matriz:");
        matriz.setM33(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        return matriz;
    }

    public  OMat4x4 lectorMatriz4x4(){
        LectorTeclado lec = new LectorTeclado();
        OMat4x4 matriz = new OMat4x4();
        System.out.println("Ingrese el valor 11 correspondiente a la matriz: ");
        matriz.setM11(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 12 correspondiente a la matriz:");
        matriz.setM12(lec.obtenerDoubleValidado("Ingrese numero valido"));
        System.out.println("Ingrese el valor 13 correspondiente a la matriz:");
        matriz.setM13(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 14 correspondiente a la matriz:");
        matriz.setM14(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 21 correspondiente a la matriz:");
        matriz.setM21(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 22 correspondiente de la matriz:");
        matriz.setM22(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 23 correspondiente de la matriz:");
        matriz.setM23(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 24 correspondiente de la matriz:");
        matriz.setM24(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 31 corrsppndiente a la matriz:");
        matriz.setM31(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 32 correspondiente a la matriz:");
        matriz.setM32(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 33 correspondiente a la matriz:");
        matriz.setM33(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 34 correspondiente a la matriz:");
        matriz.setM34(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 41 correspondiente a la matriz:");
        matriz.setM41(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 42 correspondiente a la matriz:");
        matriz.setM42(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 43 correspondiente a la matriz:");
        matriz.setM43(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        System.out.println("Ingrese el valor 44 correspondiente a la matriz:");
        matriz.setM44(lec.obtenerDoubleValidado("Ingrese un numero valido"));
        return matriz;
    }

    public float obtenerNumerof()
    {
        return 0.0f;
    }

    public float obtenerNumeroValidadof()
    {
        return 0.0f;
    }

    public double obtenerNumero()
    {
        return 0.0;
    }

    public double obtenerNumeroValidado()
    {
        return 0.0;
    }
}

