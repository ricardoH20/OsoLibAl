package hn.edu.ujcv.progra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {
        LectorTeclado lector = LectorTeclado.getInstance();
        Scanner sc = new Scanner(System.in);
        int salir = 0;
        while(salir == 0)
        {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Vectores Y Matrices :D");

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ¿Que operacion desea realizar?");

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 1. Vectores");

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 2. Matrices");

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 3. Salir");

            System.out.println("\n\n");
            try {
                System.out.println("Seleccione una opcion.");
                int opcion = sc.nextInt();
                switch (opcion)
                {
                    case 1:
                        int salir1 = 0;
                        while(salir1 == 0)
                        {
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Vectores");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 1. Vector en R2");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 2. Vector en R3");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 3. Vector en R4");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 4. Menu principal");
                            try
                            {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Seleccione una opcion.");
                                int opcionB = sc.nextInt();
                                switch (opcionB)
                                {
                                    case 1:
                                        int salir2 = 0;
                                        while(salir2 == 0)
                                        {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  Vector en R2");
                                            System.out.println("\n");
                                            System.out.println("1. Suma de Vectores");
                                            System.out.println("2. Resta de  vectores");
                                            System.out.println("3. Producto Punto");
                                            System.out.println("4. Magnitud");
                                            System.out.println("5. Regresar");
                                            System.out.println(" ");
                                            try
                                            {
                                                System.out.println("Ingrese una opcion");
                                                int opcionC = sc.nextInt();
                                                switch (opcionC)
                                                {
                                                    case 1:
                                                        System.out.println("Vector A");
                                                        OVecR2 v1 = new OVecR2();
                                                        v1 = lector.lectorVectorR2();
                                                        System.out.println("Vector B");
                                                        OVecR2 v2 = new OVecR2();
                                                        v2 = lector.lectorVectorR2();
                                                        System.out.println("La suma de los dos vectores es:" + v1.suma(v2));
                                                        break;

                                                    case 2:
                                                        System.out.println("Vector A");
                                                        OVecR2 v3 = new OVecR2();
                                                        v3 = lector.lectorVectorR2();
                                                        System.out.println("Vector B");
                                                        OVecR2 v4 = new OVecR2();
                                                        v4 = lector.lectorVectorR2();
                                                        System.out.println("La resta de los Vectores es" + v3.resta(v4));
                                                        break;

                                                    case 3:
                                                        System.out.println("Vector A");
                                                        OVecR2 v5 = new OVecR2();
                                                        v5 = lector.lectorVectorR2();
                                                        System.out.println("Vector B");
                                                        OVecR2 v6 = new OVecR2();
                                                        v6 = lector.lectorVectorR2();
                                                        System.out.println("El producto punto es" + v5.prodPunto(v6));
                                                        break;

                                                    case 4:
                                                        OVecR2 v7 = new OVecR2();
                                                        v7 = lector.lectorVectorR2();
                                                        System.out.println("La Magnitud es" + v7.magnitud());
                                                        break;

                                                    case 5:
                                                        salir2 = 1;
                                                        break;

                                                    default:
                                                        System.out.println("Porfavor ingresa un numero valido");
                                                }
                                            }catch (InputMismatchException e){
                                                System.out.println("Debes insertar un número");
                                                sc.next();
                                            }
                                        }
                                        break;
                                    case 2:
                                        int salir3 = 0;
                                        while(salir3 == 0) {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Vector en R3");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 1. Suma de vectores");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 2. Resta de vectores");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 3. Producto Punto");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 4. Magnitud");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 5. Producto cruz");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 6. Regresar");
                                            System.out.println(" ");
                                            try {
                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Ingresa una opcion");
                                                int opcionD = sc.nextInt();
                                                switch (opcionD) {
                                                    case 1:

                                                        System.out.println("Vector A");
                                                        OVecR3 v1 = new OVecR3();
                                                        v1 = lector.lectorVectorR3();
                                                        System.out.println("Vector B");
                                                        OVecR3 v2 = new OVecR3();
                                                        v2 = lector.lectorVectorR3();
                                                        System.out.println("La suma de los dos vectores es:" + v1.suma(v2));
                                                        break;

                                                    case 2:

                                                        System.out.println("Vector A");
                                                        OVecR3 v3 = new OVecR3();
                                                        v3 = lector.lectorVectorR3();
                                                        System.out.println("Vector B");
                                                        OVecR3 v4 = new OVecR3();
                                                        v4 = lector.lectorVectorR3();
                                                        System.out.println("La resta de su vector es" + v3.resta(v4));
                                                        break;

                                                    case 3:
                                                        System.out.println("Vector A");
                                                        OVecR3 v5 = new OVecR3();
                                                        v5 = lector.lectorVectorR3();
                                                        System.out.println("Vector B");
                                                        OVecR3 v6 = new OVecR3();
                                                        v6 = lector.lectorVectorR3();
                                                        System.out.println("el prod.punto de su vector es" + v5.prodPunto(v6));
                                                        break;

                                                    case 4:
                                                        System.out.println("Vector");
                                                        OVecR3 v7 = new OVecR3();
                                                        v7 = lector.lectorVectorR3();
                                                        System.out.println("la magnitud de su vector es" + v7.magnitud());
                                                        break;
                                                    case 5:
                                                        System.out.println("Vector A");
                                                        OVecR3 v8 = new OVecR3();
                                                        v8 = lector.lectorVectorR3();
                                                        OVecR3 v9 = new OVecR3();
                                                        v9 = lector.lectorVectorR3();
                                                        System.out.println("el producto cruz es" + v8.prodCruz(v9));
                                                        break;
                                                    case 6:
                                                        salir3 = 1;
                                                        break;

                                                    default:
                                                        System.out.println("Ingresa un numero valido");
                                                }
                                            }catch (InputMismatchException e){
                                                System.out.println("Debes insertar un número");
                                                sc.next();
                                            }
                                        }
                                        break;
                                    case 3:
                                        int salir4 = 0;
                                        while(salir4 == 0)
                                        {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tVector en R4");

                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  1. Suma de dos vectores");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  2. Resta de dos vectores");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  3. Producto Punto");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  4. Magnitud");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  5. Regresar");
                                            try {
                                                System.out.println("Ingresa una opcion");
                                                int opcionE = sc.nextInt();
                                                switch (opcionE) {
                                                    case 1:
                                                        System.out.println("Vector A");
                                                        OVecR4 v1 = new OVecR4();
                                                        v1 = lector.lectorVectorR4();
                                                        System.out.println("Vector B");
                                                        OVecR4 v2 = new OVecR4();
                                                        v2 = lector.lectorVectorR4();
                                                        System.out.println("La suma de los dos vectores es:" + v1.suma(v2));
                                                        break;

                                                    case 2:

                                                        OVecR4 v3 = new OVecR4();
                                                        v3 = lector.lectorVectorR4();
                                                        OVecR4 v4 = new OVecR4();
                                                        v4 = lector.lectorVectorR4();
                                                        System.out.println("La resta de los dos vectores es:" + v3.resta(v4));
                                                        break;

                                                    case 3:

                                                        System.out.println("Vector A");
                                                        OVecR4 v5 = new OVecR4();
                                                        v5 = lector.lectorVectorR4();
                                                        System.out.println("Vector B");
                                                        OVecR4 v6 = new OVecR4();
                                                        v6 = lector.lectorVectorR4();
                                                        System.out.println("el prodPunto del vectores es:" + v5.prodPunto(v6));
                                                        break;

                                                    case 4:
                                                        System.out.println("Vector");
                                                        OVecR4 v7 = new OVecR4();
                                                        v7 = lector.lectorVectorR4();
                                                        System.out.println("la magnitud de su vector es" + v7.magnitud());
                                                        break;
                                                    case 5:
                                                        salir4 = 1;
                                                        break;
                                                }
                                            }catch (InputMismatchException e){
                                                System.out.println("Debes insertar un número");
                                                sc.next();
                                            }
                                        }
                                        break;
                                    case 4:
                                        salir1 = 1;
                                        break;

                                    default:
                                        System.out.println("Debes ingresar un numero valido");
                                }

                            }catch (InputMismatchException e){
                                System.out.println("Debes insertar un número");
                                sc.next();
                            }
                        }
                        break;
                    case 2:
                        int salir5 = 0;
                        while(salir5 == 0)
                        {
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Matrices");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  1. Matriz de 2x2");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  2. Matriz de 3x3");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  3. Matriz de 4x4");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  4. Menu principal.");
                            try {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Seleccione una opcion.");
                                int opcionC = sc.nextInt();
                                switch (opcionC)
                                {
                                    case 1:
                                        int salir6 = 0;
                                        while(salir6 == 0)
                                        {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Matriz de 2x2");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   1. Suma de dos matrices");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   2. Resta de dos matrices");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   3. Multipicacion de dos matrices");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   4. Transpuesta de la matriz");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   5. Inversa de la matriz");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   6. Determinante de la matriz");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   7. Rotacion de la matriz");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   8. Matriz Identidad");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   9. Regresar");
                                            System.out.println("\n");
                                            try {
                                                System.out.println("Ingresa una opcion");
                                                int opcionD = sc.nextInt();
                                                switch (opcionD)
                                                {
                                                    case 1:
                                                        System.out.println("Matriz A");
                                                        OMat2x2 m1 = new OMat2x2();
                                                        m1 = lector.lectorMatriz2x2();
                                                        System.out.println("Matriz B");
                                                        OMat2x2 m2 = new OMat2x2();
                                                        m2 = lector.lectorMatriz2x2();
                                                        System.out.println("La suma de matriz es " + m1.suma(m2));
                                                        break;

                                                    case 2:
                                                        System.out.println("Matriz A");
                                                        OMat2x2 m3 = new OMat2x2();
                                                        m3 = lector.lectorMatriz2x2();
                                                        System.out.println("Matriz B");
                                                        OMat2x2 m4 = new OMat2x2();
                                                        m4 = lector.lectorMatriz2x2();
                                                        System.out.println("la resta de la matriz es" + m3.resta(m4));
                                                        break;

                                                    case 3:
                                                        System.out.println("Matriz A");
                                                        OMat2x2 m5 = new OMat2x2();
                                                        m5 = lector.lectorMatriz2x2();
                                                        System.out.println("Matriz B");
                                                        OMat2x2 m6 = new OMat2x2();
                                                        m6 = lector.lectorMatriz2x2();
                                                        System.out.println("la multiplicacion de la matriz es " + m5.mult(m6));
                                                        break;
                                                    case 4:
                                                        System.out.println("Matriz");
                                                        OMat2x2 m7 = new OMat2x2();
                                                        m7 = lector.lectorMatriz2x2();
                                                        System.out.println("la transpuesta es" + m7.transpuesta());
                                                        break;
                                                    case 5:
                                                        System.out.println("Matriz");
                                                        OMat2x2 m8 = new OMat2x2();
                                                        m8 = lector.lectorMatriz2x2();
                                                        System.out.println("la inversa de la matriz es" + m8.inversa());
                                                        break;
                                                    case 6:
                                                        System.out.println("Matriz");
                                                        OMat2x2 m9 = new OMat2x2();
                                                        m9 = lector.lectorMatriz2x2();
                                                        System.out.println("el determinante de la matriz es" + m9.determinante());
                                                        break;
                                                    case 7:
                                                        System.out.println("Matriz");
                                                        OMat2x2 m10 = new OMat2x2();
                                                        m10 = lector.lectorMatriz2x2();
                                                        System.out.println("Ingrese el valor de alpha");
                                                        double alpha = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("la rotacion de la matriz es" + m10.rotacion(alpha));
                                                        break;
                                                    case 8:
                                                        OMat2x2 ident = new OMat2x2();
                                                        System.out.println("La matriz es:");
                                                        System.out.println(ident.identidad());
                                                        break;
                                                    case 9:
                                                        salir6 = 1;
                                                        break;

                                                    default:
                                                        System.out.println("Ingresa un numero valido");

                                                }
                                            }catch (InputMismatchException e){
                                                System.out.println("Debes insertar un número");
                                                sc.next();
                                            }
                                        }
                                        break;
                                    case 2:
                                        int salir7 = 0;
                                        while(salir7 == 0)
                                        {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Matriz de 3x3");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  1. Suma de matrices");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  2. Resta de d matrices");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  3. Multipicacion de matrices");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  4. Transpuesta de matriz");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  5. Inversa de matriz");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  6. Determinante de matriz");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  7. Rotacion de matriz en X");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  8. Rotacion de matriz en Y");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  9. Rotacion de matriz en Z");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  10. Matriz Identidad");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  11. Regresar");
                                            System.out.println("\n");
                                            try {
                                                System.out.println("Ingresa una opcion");
                                                int opcionE = sc.nextInt();
                                                switch (opcionE) {
                                                    case 1:
                                                        System.out.println("Matriz A");
                                                        OMat3x3 m1 = new OMat3x3();
                                                        m1 = lector.lectorMatriz3x3();
                                                        System.out.println("Matriz B");
                                                        OMat3x3 m2 = new OMat3x3();
                                                        m2 = lector.lectorMatriz3x3();
                                                        System.out.println("la suma de la matriz es" + m1.suma(m2));
                                                        break;
                                                    case 2:
                                                        System.out.println("Matriz A");
                                                        OMat3x3 m3 = new OMat3x3();
                                                        m3 = lector.lectorMatriz3x3();
                                                        System.out.println("Matriz B");
                                                        OMat3x3 m4 = new OMat3x3();
                                                        m4 = lector.lectorMatriz3x3();
                                                        System.out.println("la resta de la matriz" + m3.resta(m4));
                                                        break;
                                                    case 3:
                                                        System.out.println("Matriz A");
                                                        OMat3x3 m5 = new OMat3x3();
                                                        m5 = lector.lectorMatriz3x3();
                                                        System.out.println("Matriz B");
                                                        OMat3x3 m6 = new OMat3x3();
                                                        m6 = lector.lectorMatriz3x3();
                                                        System.out.println("la multiplicacion de la matriz es" + m5.multiplicacion(m6));
                                                        break;
                                                    case 4:
                                                        System.out.println("Matriz");
                                                        OMat3x3 m7 = new OMat3x3();
                                                        m7 = lector.lectorMatriz3x3();
                                                        System.out.println("la transpuesta es" + m7.transpuesta());
                                                        break;
                                                    case 5:
                                                        System.out.println("Matriz");
                                                        OMat3x3 m8 = new OMat3x3();
                                                        m8 = lector.lectorMatriz3x3();
                                                        System.out.println("La inversa es " + m8.inversa());
                                                        break;
                                                    case 6:
                                                        System.out.println("Matriz");
                                                        OMat3x3 m9 = new OMat3x3();
                                                        m9 = lector.lectorMatriz3x3();
                                                        System.out.println("el valor de la determinante es" + m9.determinante());
                                                        break;
                                                    case 7:
                                                        System.out.println("Matriz");
                                                        OMat3x3 m10 = new OMat3x3();
                                                        m10 = lector.lectorMatriz3x3();
                                                        System.out.println("Ingrese el valor de alpha X");
                                                        double alphaX = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                                        System.out.println("la rotacion es" + m10.rotacionX(alphaX));
                                                        break;
                                                    case 8:
                                                        System.out.println("Matriz");
                                                        OMat3x3 m11 = new OMat3x3();
                                                        m11 = lector.lectorMatriz3x3();
                                                        System.out.println("Ingrese el valor de alpha Y");
                                                        double alphaY = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                                        System.out.println("la rotacion en y es" + m11.rotacionY(alphaY));
                                                        break;
                                                    case 9:
                                                        System.out.println("Matriz");
                                                        OMat3x3 m12 = new OMat3x3();
                                                        m12 = lector.lectorMatriz3x3();
                                                        System.out.println("Ingrese el valor de alpha Z");
                                                        double alphaZ = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("la rotacion en z" + m12.rotacionZ(alphaZ));
                                                        break;
                                                    case 10:
                                                        OMat3x3 iden = new OMat3x3();
                                                        System.out.println("La matriz es:");
                                                        System.out.println(iden.identidad());
                                                        break;
                                                    case 11:
                                                        salir7 = 1;
                                                        break;

                                                    default:
                                                        System.out.println("Ingresa un numero valido");
                                                }
                                            }catch(InputMismatchException e){
                                                System.out.println("Debes insertar un número");
                                                sc.next();
                                            }
                                        }
                                        break;
                                    case 3:
                                        int salir8 = 0;
                                        while(salir8 ==0)
                                        {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Matriz de 4x4");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 1.Suma de dos matrices");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 2.Resta de dos matrices");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 3.Multiplicacion de dos matrices");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 4.Transpuesta de la matriz");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 5.Inversa de la matriz");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 6.Determinante de la matriz");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 7.Rotacion de la matriz en X");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 8.Rotacion de la matriz en Y");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 9.Rotacion de la matriz en Z");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 10.Matriz Identidad");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 11.Regresar");
                                            System.out.println("\n ");
                                            try {
                                                System.out.println("Ingresa una opcion");
                                                int opcionF = sc.nextInt();
                                                switch (opcionF) {
                                                    case 1:
                                                        System.out.println("Matriz A");
                                                        OMat4x4 m1 = new OMat4x4();
                                                        m1 = lector.lectorMatriz4x4();
                                                        System.out.println("Matriz B");
                                                        OMat4x4 m2 = new OMat4x4();
                                                        m2 = lector.lectorMatriz4x4();
                                                        System.out.println(" la suma de la matriz es " + m1.suma(m2));
                                                        break;
                                                    case 2:
                                                        System.out.println("Matriz A");
                                                        OMat4x4 m3 = new OMat4x4();
                                                        m3 = lector.lectorMatriz4x4();
                                                        System.out.println("Matriz B");
                                                        OMat4x4 m4 = new OMat4x4();
                                                        m4 = lector.lectorMatriz4x4();
                                                        System.out.println("la resta de la matriz es " + m3.resta(m4));
                                                        break;
                                                    case 3:
                                                        System.out.println("Matriz A");
                                                        OMat4x4 m5 = new OMat4x4();
                                                        m5 = lector.lectorMatriz4x4();
                                                        System.out.println("Matriz B");
                                                        OMat4x4 m6 = new OMat4x4();
                                                        m6 = lector.lectorMatriz4x4();
                                                        System.out.println("la multiplicacion es" + m5.multiplicacion(m6));
                                                        break;
                                                    case 4:
                                                        System.out.println("Matriz");
                                                        OMat4x4 m7 = new OMat4x4();
                                                        m7 = lector.lectorMatriz4x4();
                                                        System.out.println("la transpuesta es" + m7.transpuesta());
                                                        break;
                                                    case 5:
                                                        System.out.println("Matriz");
                                                        OMat4x4 m8 = new OMat4x4();
                                                        m8 = lector.lectorMatriz4x4();
                                                        System.out.println("la inversa es" + m8.inversa());
                                                        break;
                                                    case 6:
                                                        System.out.println("Matriz");
                                                        OMat4x4 m9 = new OMat4x4();
                                                        m9 = lector.lectorMatriz4x4();
                                                        System.out.println("la determinante es " + m9.determinante());
                                                        break;
                                                    case 7:
                                                        System.out.println("Matriz");
                                                        OMat4x4 m10 = new OMat4x4();
                                                        m10 = lector.lectorMatriz4x4();
                                                        System.out.println("Ingrese el valor de alpha X");
                                                        double alphaX = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("la rotacionen el eje X es" + m10.rotX(alphaX));
                                                        break;
                                                    case 8:
                                                        System.out.println("Matriz");
                                                        OMat4x4 m11 = new OMat4x4();
                                                        m11 = lector.lectorMatriz4x4();
                                                        System.out.println("Ingrese el valor de alpha Y");
                                                        double alphaY = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("la rotacion en Y es" + m11.rotY(alphaY));
                                                        break;
                                                    case 9:
                                                        System.out.println("Matriz");
                                                        OMat4x4 m12 = new OMat4x4();
                                                        m12 = lector.lectorMatriz4x4();
                                                        System.out.println("Ingrese el valor de alpha Z");
                                                        double alphaZ = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println(m12.rotZ(alphaZ));
                                                        break;
                                                    case 10:
                                                        OMat4x4 iden = new OMat4x4();
                                                        System.out.println("La matriz es:");
                                                        System.out.println(iden.identidad());
                                                        break;
                                                    case 11:
                                                        salir8 = 1;
                                                        break;

                                                    default:
                                                        System.out.println("Ingresa un numero valido");
                                                }
                                            }catch(InputMismatchException e){
                                                System.out.println("Debes insertar un número");
                                                sc.next();
                                            }
                                        }
                                        break;
                                    case 4:
                                        salir5 = 1;
                                        break;

                                    default:
                                        System.out.println("Debes ingresar un numero.");
                                }
                            }catch (InputMismatchException e){
                                System.out.println("Debes insertar un número");
                                sc.next();
                            }
                        }
                        break;

                    case 3:
                        salir = 1;
                        break;

                    default:
                        System.out.println("Debes ingresar un numero valido.");

                }
            }catch(InputMismatchException e){
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }
    }

}
