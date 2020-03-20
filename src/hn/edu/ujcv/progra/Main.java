package hn.edu.ujcv.progra;

import java.util.Scanner;

public class Main
{
    {
        OVecR2 a = new OVecR2(1,2);
        OVecR2 b = new OVecR2(2,2);
        System.out.println(a.suma(b));
        OMat3x3 a1 = new OMat3x3(1,2,3,4,5,6,7,8,9);
        System.out.println(a1.rotacionX(25));
    }

    public static void main(String[] args) {
        LectorTeclado lector = LectorTeclado.getInstance();
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t    Vectores Y Matrices :D");

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t    ¿Que operacion desea realizar?");

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 1. Vectores");

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 2. Matrices");

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 3. Salir");

        System.out.println("\n\n");

        System.out.println("Seleccione una opcion.");
        int opcion = sc.nextInt();
        switch (opcion)
        {
            case 1:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t  Vectores");

                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 1. Vector en R2");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 2. Vector en R3");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 3. Vector en R4");

                System.out.println("\t\t\t\t\t\t\t\t\t\t\t Seleccione una opcion.");
                int opcionB = sc.nextInt();
                switch (opcionB) {
                    case 1:
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  Vector en R2");
                        System.out.println("\n");
                        System.out.println("1. Suma de Vectores");
                        System.out.println("2. Resta de  vectores");
                        System.out.println("3. Producto Punto");
                        System.out.println("4. Magnitud");
                        System.out.println("\n");
                        System.out.println(" ");
                        int opcionC = sc.nextInt();
                        switch (opcionC)
                        {
                            case 1:

                                System.out.println("Ingrese un Valor de i del vector A");
                                double Ax = lector.obtenerEnteroValidado("Ingrese un numero weon");
                                System.out.println("Ingrese un Valor de j del vector A");
                                double Ay = lector.obtenerEnteroValidado("Ingrese un dato");
                                OVecR2 a = new OVecR2(Ax, Ay);
                                System.out.println("Ingrese Un Valor de i del vector B");
                                double Bx = lector.obtenerEnteroValidado("Ingrese un digito");
                                System.out.println("Ingrese un Valor de j del vector B");
                                double By = lector.obtenerEnteroValidado("Ingrese un numero, excepto letra");
                                OVecR2 b = new OVecR2(Bx, By);
                                System.out.println("La suma de los dos vectores es:"+ a.suma(b));

                                break;

                            case 2:

                                System.out.println("Ingrese un Valor de i del vector A");
                                double Cx = lector.obtenerEnteroValidado("Ingrese un numero weon");
                                System.out.println("Ingrese un Valor de j del vector A");
                                double Cy = lector.obtenerEnteroValidado("Ingrese un dato");
                                OVecR2 c = new OVecR2(Cx, Cy);
                                System.out.println("Ingrese un Valor de i del vector B");
                                double Dx = lector.obtenerEnteroValidado("Ingrese un digito");
                                System.out.println("Ingrese un Valor de j del vector B");
                                double Dy = lector.obtenerEnteroValidado("Ingrese un numero, no letras");
                                OVecR2 d = new OVecR2(Dx, Dy);
                                System.out.println("La resta de los Vectores es"+ c.resta(d));
                                break;

                            case 3:
                                System.out.println("Ingrese Un Valor de i del vector A");
                                double Ex = lector.obtenerEnteroValidado("Ingrese un numero weon");
                                System.out.println("Ingrese Un Valor de j del vector A");
                                double Ey = lector.obtenerEnteroValidado("Ingrese un digito");
                                OVecR2 e = new OVecR2(Ex, Ey);
                                System.out.println("Ingrese Un Valor de i del vector B");
                                double Fx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese un Valor de j del vector B");
                                double Fy = lector.obtenerEnteroValidado("Ingrese un dato");
                                OVecR2 f = new OVecR2(Fx, Fy);
                                System.out.println("El producto punto es"+ e.prodPunto(f));
                                break;

                            case 4:
                                System.out.println("Ingrese un Valor de i del vector ");
                                double Gx = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un valor de j del vector ");
                                double Gy = lector.obtenerEnteroValidado("Ingrese un digito");
                                OVecR2 g = new OVecR2(Gx, Gy);
                                System.out.println("La Magnitud es"+ g.magnitud());
                                break;

                            case 5:
                                break;
                        }
                    case 2:

                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Vector en R3");

                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 1. Suma de vectores");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 2. Resta de vectores");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 3. Producto Punto");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 4. Magnitud");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 5. Producto cruz");

                        System.out.println(" ");
                        int opcionD = sc.nextInt();
                        switch (opcionD) {
                            case 1:

                                System.out.println("Ingrese Un valor de i del vector A");
                                double Ax = lector.obtenerEnteroValidado("Ingrese un numero weon");
                                System.out.println("Ingrese un valor de j del vector A");
                                double Ay = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un valor de k del vector A");
                                double Az = lector.obtenerEnteroValidado("Ingrese numero, no una letra");
                                OVecR3 a = new OVecR3(Ax, Ay, Az);
                                System.out.println("Ingrese un valor de i del vector B");
                                double Bx = lector.obtenerEnteroValidado("Ingrese un digito");
                                System.out.println("Ingrese un valor de j del vector B");
                                double By = lector.obtenerEnteroValidado("Ingrese un datp");
                                System.out.println("Ingrese al valor de k del vector B");
                                double Bz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 b = new OVecR3(Bx, By, Bz);
                                System.out.println("La suma de los dos vectores es:"+ a.suma(b));
                                break;

                            case 2:

                                System.out.println("Ingrese un Valor de i del vector A");
                                double Cx = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de j del vector A");
                                double Cy = lector.obtenerEnteroValidado("Ingrese un numero weon");
                                System.out.println("Ingrese un Valor de k del vector A");
                                double Cz = lector.obtenerEnteroValidado("Ingrese numero, no un digito");
                                OVecR3 c = new OVecR3(Cx, Cy, Cz);
                                System.out.println("Ingrese un Valor de i del vector B");
                                double Dx = lector.obtenerEnteroValidado("Ingrese un numero no una letra");
                                System.out.println("Ingrese un Valor de j del vector B");
                                double Dy = lector.obtenerEnteroValidado("Ingrese un numero porfavor");
                                System.out.println("Ingrese un Valor de k del vector B");
                                double Dz = lector.obtenerEnteroValidado("Ingrese dato");
                                OVecR3 d = new OVecR3(Dx, Dy, Dz);
                                System.out.println("La resta de su vector es"+c.resta(d));
                                break;

                            case 3:
                                System.out.println("Ingrese un Valor de i del vector A");
                                double Ex = lector.obtenerEnteroValidado("Ingrese un weon");
                                System.out.println("Ingrese un Valor de j del vector A");
                                double Ey = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de k del vector A");
                                double Ez = lector.obtenerEnteroValidado("Ingrese numero porfavor");
                                OVecR3 e = new OVecR3(Ex, Ey, Ez);
                                System.out.println("Ingrese un Valor de i del vector B");
                                double Fx = lector.obtenerEnteroValidado("Ingrese un digito");
                                System.out.println("Ingrese un Valor de j del vector B");
                                double Fy = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingrese un valor de k del vector B");
                                double Fz = lector.obtenerEnteroValidado("Ingrese digito");
                                OVecR3 f = new OVecR3(Fx, Fy, Fz);
                                System.out.println("el prod.punto de su vector es"+e.prodPunto(f));
                                break;

                            case 4:
                                System.out.println("Ingrese un valor de j del vector ");
                                double Gx = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese el valor de j del vector ");
                                double Gy = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingrese al valor de k del vector A");
                                double Gz = lector.obtenerEnteroValidado("Ingrese digito");
                                OVecR3 g = new OVecR3(Gx, Gy, Gz);
                                System.out.println("la magnitud de su vector es"+g.magnitud());
                                break;
                            case 5:
                                System.out.println("Ingrese un Valor de i del vector A");
                                double Hx = lector.obtenerEnteroValidado("Ingrese un digito");
                                System.out.println("Ingrese un Valor de j del vector A");
                                double Hy = lector.obtenerEnteroValidado("Ingrese un numero weon");
                                System.out.println("Ingrese un Valor de k del vector A");
                                double Hz = lector.obtenerEnteroValidado("Ingrese numero porfavor");
                                OVecR3 h = new OVecR3(Hx, Hy, Hz);
                                System.out.println("Ingrese un Valor de i del vector B");
                                double Ix = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingrese un Valor de j del vector B");
                                double Iy = lector.obtenerEnteroValidado("Ingrese un numero");
                                System.out.println("Ingrese un Valor de k del vector B");
                                double Iz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 i = new OVecR3(Ix, Iy, Iz);
                                System.out.println("el producto cruz es"+h.prodCruz(i));
                                break;
                            case 6:
                                break;

                        }
                    case 3:
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tVector en R4");

                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  1. Suma de dos vectores");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  2. Resta de dos vectores");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  3. Producto Punto");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  4. Magnitud");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  5. Salir");

                        int opcionE = sc.nextInt();
                        switch (opcionE) {
                            case 1:

                                System.out.println("Ingrese un Valor de i del vector A");
                                double Ax = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de j del vector A");
                                double Ay = lector.obtenerEnteroValidado("Ingrese un digito");
                                System.out.println("Ingrese un Valor de k del vector A");
                                double Az = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingrese un Valor de t del vector A");
                                double At = lector.obtenerEnteroValidado("Ingrese numero porfavor");
                                OVecR4 a = new OVecR4(Ax, Ay, Az, At);
                                System.out.println("Ingrese un Valor de i del vector B");
                                double Bx = lector.obtenerEnteroValidado("Ingrese un numero, no una letra");
                                System.out.println("Ingrese un Valor de j del vector B");
                                double By = lector.obtenerEnteroValidado("Ingrese un su cumpleaños");
                                System.out.println("Ingrese un Valor de k del vector B");
                                double Bz = lector.obtenerEnteroValidado("Ingrese numero del 0 al 10");
                                System.out.println("Ingrese un Valor de t del vector B");
                                double Bt = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR4 b = new OVecR4(Bx, By, Bz, Bt);
                                System.out.println("La suma de los dos vectores es:"+a.suma(b));
                                break;

                            case 2:

                                System.out.println("Ingrese un Valor de i del vector A");
                                double Cx = lector.obtenerEnteroValidado("Ingrese un numero weon");
                                System.out.println("Ingrese un Valor de j del vector A");
                                double Cy = lector.obtenerEnteroValidado("Ingrese un numero certificado por 9 de 10 dentistas");
                                System.out.println("Ingrese un Valor de k del vector A");
                                double Cz = lector.obtenerEnteroValidado("Ingrese numero, no una letra");
                                System.out.println("Ingrese un Valor de t del vector A");
                                double Ct = lector.obtenerEnteroValidado("Ingrese numero valido, porfavor");
                                OVecR4 c = new OVecR4(Cx, Cy, Cz, Ct);
                                System.out.println("Ingrese un Valor de i del vector B");
                                double Dx = lector.obtenerEnteroValidado("Ingrese un numero porfavor");
                                System.out.println("Ingrese un Valor de j del vector B");
                                double Dy = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingrese un Valor de k del vector B");
                                double Dz = lector.obtenerEnteroValidado("Ingrese digito");
                                System.out.println("Ingrese un Valor de t del vector B");
                                double Dt = lector.obtenerEnteroValidado("Ingrese numero");
                                OVecR4 d = new OVecR4(Dx, Dy, Dz, Dt);
                                System.out.println("La resta de los dos vectores es:"+c.resta(d));
                                break;

                            case 3:

                                System.out.println("Ingrese un Valor de i del vector A");
                                double Ex = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de j del vector A");
                                double Ey = lector.obtenerEnteroValidado("Ingrese un numero weon");
                                System.out.println("Ingrese un Valor de k del vector A");
                                double Ez = lector.obtenerEnteroValidado("Ingrese numero porfavor");
                                System.out.println("Ingrese un Valor de t del vector A");
                                double Et = lector.obtenerEnteroValidado("Ingrese numero del 0 al 10");
                                OVecR4 e = new OVecR4(Ex, Ey, Ez, Et);
                                System.out.println("Ingrese un Valor de i del vector B");
                                double Fx = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingrese un Valor de j del vector B");
                                double Fy = lector.obtenerEnteroValidado("Ingrese un digito");
                                System.out.println("Ingrese un Valor de k del vector B");
                                double Fz = lector.obtenerEnteroValidado("Ingrese solo numeros");
                                System.out.println("Ingrese un Valor de t del vector B");
                                double Ft = lector.obtenerEnteroValidado("Ingrese numero validado");
                                OVecR4 f = new OVecR4(Fx, Fy, Fz, Ft);
                                System.out.println("el prodPunto del vectores es:"+e.prodPunto(f));
                                break;

                            case 4:
                                System.out.println("Ingrese un Valor de i del vector ");
                                double Gx = lector.obtenerEnteroValidado("Ingrese un numero validado");
                                System.out.println("Ingrese un Valor de j del vector ");
                                double Gy = lector.obtenerEnteroValidado("Ingrese un numero de 0 al 10");
                                System.out.println("Ingrese un Valor de k del vector A");
                                double Gz = lector.obtenerEnteroValidado("Ingrese numero digito");
                                System.out.println("Ingrese un Valor de t del vector");
                                double Gt = lector.obtenerEnteroValidado("Ingrese numero dato");
                                OVecR4 g = new OVecR4(Gx, Gy, Gz, Gt);
                                System.out.println("la magnitud de su vector es"+g.magnitud());
                                break;
                            case 5:
                                break;
                        }
                }
            case 2:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  Matrices");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  1. Matriz de 2x2");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  2. Matriz de 3x3");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  3. Matriz de 4x4");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  4. Salir");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  Seleccione una opcion.");
                int opcionC = sc.nextInt();
                switch(opcionC)
                {
                    case 1:
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Matriz de 2x2");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   1. Suma de dos matrices");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   2. Resta de dos matrices");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   3. Multipicacion de dos matrices");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   4. Transpuesta de la matriz");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   5. Inversa de la matriz");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   6. Determinante de la matriz");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   7. Rotacion de la matriz");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   8. Matriz Identidad");
                        System.out.println("\n" );
                        int opcionD = sc.nextInt();
                        switch (opcionD)
                        {
                            case 1:
                                System.out.println("Ingrese un Valor de A11");
                                double a11 = lector.obtenerEnteroValidado("Ingrese un numerito weon");
                                System.out.println("Ingrese un Valor de A12");
                                double a12 = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de A21");
                                double a21 = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingrese un Valor de A22");
                                double a22 = lector.obtenerEnteroValidado("Ingrese un digito");
                                OMat2x2 a = new OMat2x2(a11,a12,a21,a22);
                                System.out.println("Ingrese un Valor de B11");
                                double b11 = lector.obtenerEnteroValidado("Ingrese un numero campeon");
                                System.out.println("Ingrese un Valor de B12");
                                double b12 = lector.obtenerEnteroValidado("Ingrese un NUMERO!");
                                System.out.println("Ingrese un Valor de B21");
                                double b21 = lector.obtenerEnteroValidado("Ingrese un numero porfavor");
                                System.out.println("Ingrese un Valor de B22");
                                double b22 = lector.obtenerEnteroValidado("Ingrese un numero validado");
                                OMat2x2 b = new OMat2x2(b11,b12,b21,b22);
                                System.out.println("La suma de matriz es "+a.suma(b));
                                break;

                            case 2:
                                System.out.println("Ingrese un Valor de A11");
                                double c11 = lector.obtenerEnteroValidado("Ingrese un numero Hijo");
                                System.out.println("Ingrese un Valor de A12");
                                double c12 = lector.obtenerEnteroValidado("Ingrese un numero porfavor");
                                System.out.println("Ingrese un Valor de A21");
                                double c21 = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de A22");
                                double c22 = lector.obtenerEnteroValidado("Ingrese un dato");
                                OMat2x2 c = new OMat2x2(c11,c12,c21,c22);
                                System.out.println("Ingrese un Valor de B11");
                                double d11 = lector.obtenerEnteroValidado("Ingrese un digito");
                                System.out.println("Ingrese un Valor de B12");
                                double d12 = lector.obtenerEnteroValidado("Ingrese un NUMERO!");
                                System.out.println("Ingrese un Valor de B21");
                                double d21 = lector.obtenerEnteroValidado("Ingrese un datito");
                                System.out.println("Ingrese un Valor de B22");
                                double d22 = lector.obtenerEnteroValidado("Ingrese un numero validadisimo");
                                OMat2x2 d = new OMat2x2(d11,d12,d21,d22);
                                System.out.println("la resta de la matriz es"+c.resta(d));
                                break;

                            case 3:
                                System.out.println("Ingrese un Valor de A11");
                                double e11 = lector.obtenerEnteroValidado("Ingrese un numero validado");
                                System.out.println("Ingrese un Valor de A12");
                                double e12 = lector.obtenerEnteroValidado("Ingrese un numero digito");
                                System.out.println("Ingrese un Valor de A21");
                                double e21 = lector.obtenerEnteroValidado("Ingrese un numero dato");
                                System.out.println("Ingrese un Valor de A22");
                                double e22 = lector.obtenerEnteroValidado("Ingrese un numero weon");
                                OMat2x2 e = new OMat2x2(e11,e12,e21,e22);
                                System.out.println("Ingrese un Valor de B11");
                                double f11 = lector.obtenerEnteroValidado("Ingrese un numero, no una letra");
                                System.out.println("Ingrese un Valor de B12");
                                double f12 = lector.obtenerEnteroValidado("Ingrese un numero porfavor");
                                System.out.println("Ingrese un Valor de B21");
                                double f21 = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de B22");
                                double f22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OMat2x2 f = new OMat2x2(f11,f12,f21,f22);
                                System.out.println("la multiplicacion de la matriz es "+e.mult(f));
                                break;
                            case 4:
                                System.out.println("Ingrese un Valor de A11");
                                double g11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese un Valor de A12");
                                double g12 = lector.obtenerEnteroValidado("Ingrese un digito valido");
                                System.out.println("Ingrese un Valor de A21");
                                double g21 = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de A22");
                                double g22 = lector.obtenerEnteroValidado("Ingrese un dato");
                                OMat2x2 g = new OMat2x2(g11,g12,g21,g22);
                                System.out.println("la transpuesta es"+g.transpuesta());
                                break;
                            case 5:
                                System.out.println("Ingrese un Valor de A11");
                                double h11 = lector.obtenerEnteroValidado("Ingrese un numero porfavor");
                                System.out.println("Ingrese un Valor de A12");
                                double h12 = lector.obtenerEnteroValidado("Ingrese un numero si señor");
                                System.out.println("Ingrese un Valor de A21");
                                double h21 = lector.obtenerEnteroValidado("Ingrese una pocion de invicibilidad");
                                System.out.println("Ingrese un Valor de A22");
                                double h22 = lector.obtenerEnteroValidado("Ingrese un dato");
                                OMat2x2 h = new OMat2x2(h11,h12,h21,h22);
                                System.out.println("la inversa de la matriz es"+h.inversa());
                                break;
                            case 6:
                                System.out.println("Ingrese un Valor de A11");
                                double i11 = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingrese un Valor de A12");
                                double i12 = lector.obtenerEnteroValidado("Ingrese un Digito");
                                System.out.println("Ingrese un Valor de A21");
                                double i21 = lector.obtenerEnteroValidado("Ingrese un numero");
                                System.out.println("Ingrese un Valor de A22");
                                double i22 = lector.obtenerEnteroValidado("Ingrese un number");
                                OMat2x2 i = new OMat2x2(i11,i12,i21,i22);
                                System.out.println("el determinante de la matriz es"+i.determinante());
                                break;
                            case 7:
                                System.out.println("Ingrese un Valor de A11");
                                double j11 = lector.obtenerEnteroValidado("Ingrese un numero porfavor");
                            System.out.println("Ingrese un Valor de A12");
                            double j12 = lector.obtenerEnteroValidado("Ingrese un digito");
                            System.out.println("Ingrese un Valor de A21");
                            double j21 = lector.obtenerEnteroValidado("Ingrese un dato");
                            System.out.println("Ingrese un Valor de A22");
                            double j22 = lector.obtenerEnteroValidado("Ingrese un number");
                            OMat2x2 j = new OMat2x2(j11,j12,j21,j22);
                            double alpha = lector.obtenerEnteroValidado("Ingrese un numero validado");
                            System.out.println("la rotacion de la matriz es"+j.rotacion(alpha));
                            break;
                            case 8:
                                OMat2x2 ident = new OMat2x2();
                                System.out.println(ident.identidad());
                                break;
                            case 9:
                                break;

                        }
                    case 2:
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
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  11. Salir");
                        System.out.println("\n");
                        int opcionE = sc.nextInt();
                        switch (opcionE)
                        {
                            case 1:
                                System.out.println("Ingrese un Valor de A11");
                                double a11 = lector.obtenerEnteroValidado("Ingrese un Numerito");
                                System.out.println("Ingrese un Valor de A12");
                                double a12 = lector.obtenerEnteroValidado("Ingrese un numeron");
                                System.out.println("Ingrese un Valor de A13");
                                double a13 = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de A21");
                                double a21 = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingrese un Valor de A22");
                                double a22 = lector.obtenerEnteroValidado("Ingrese un digito");
                                System.out.println("Ingrese un Valor de A23");
                                double a23 = lector.obtenerEnteroValidado("Ingrese un number");
                                System.out.println("Ingrese un Valor de A31");
                                double a31 = lector.obtenerEnteroValidado("Ingrese un numerito");
                                System.out.println("Ingrese un Valor de A32");
                                double a32 = lector.obtenerEnteroValidado("Ingrese un numero validado");
                                System.out.println("Ingrese un Valor de A33");
                                double a33 = lector.obtenerEnteroValidado("Ingrese un numero porfavor ");
                                OMat3x3 a = new OMat3x3(a11,a12,a13,a21,a22,a23,a31,a32,a33);
                                System.out.println("Ingrese un Valor de B11");
                                double b11 = lector.obtenerEnteroValidado("Ingrese un numero weon");
                                System.out.println("Ingrese un Valor de B12");
                                double b12 = lector.obtenerEnteroValidado("Ingrese un numero plox");
                                System.out.println("Ingrese un Valor de B13");
                                double b13 = lector.obtenerEnteroValidado("Ingrese un numero, no una letra");
                                System.out.println("Ingrese un Valor de B21");
                                double b21 = lector.obtenerEnteroValidado("Ingrese un pinche Numero!");
                                System.out.println("Ingrese un Valor de B22");
                                double b22 = lector.obtenerEnteroValidado("Ingrese un number del 0 al 10");
                                System.out.println("Ingrese un Valor de B23");
                                double b23 = lector.obtenerEnteroValidado("Ingrese un numer");
                                System.out.println("Ingrese un Valor de B31");
                                double b31 = lector.obtenerEnteroValidado("Ingrese un numero para ganar");
                                System.out.println("Ingrese un Valor de B32");
                                double b32 = lector.obtenerEnteroValidado("Ingrese un numero para perder");
                                System.out.println("Ingrese un Valor de B33");
                                double b33 = lector.obtenerEnteroValidado("Ingrese un numero wey");
                                OMat3x3 b = new OMat3x3(b11,b12,b13,b21,b22,b23,b31,b32,b33);
                                System.out.println("la suma de la matriz es"+a.suma(b));
                                break;
                            case 2:
                                System.out.println("Ingrese un Valor de A11");
                                double c11 = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de A12");
                                double c12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese un Valor de A13");
                                double c13 = lector.obtenerEnteroValidado("Ingrese un numero validado");
                                System.out.println("Ingrese un Valor de A21");
                                double c21 = lector.obtenerEnteroValidado("Ingrese un numero");
                                System.out.println("Ingrese un Valor de A22");
                                double c22 = lector.obtenerEnteroValidado("Ingrese un number");
                                System.out.println("Ingrese un Valor de A23");
                                double c23 = lector.obtenerEnteroValidado("Ingrese un numero weon");
                                System.out.println("Ingrese un Valor de A31");
                                double c31 = lector.obtenerEnteroValidado("Ingrese un numero porfavorcito");
                                System.out.println("Ingrese un Valor de A32");
                                double c32 = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de A33");
                                double c33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OMat3x3 c = new OMat3x3(c11,c12,c13,c21,c22,c23,c31,c32,c33);
                                System.out.println("Ingrese un Valor de B11");
                                double d11 = lector.obtenerEnteroValidado("Ingrese un numero wey ");
                                System.out.println("Ingrese un Valor de B12");
                                double d12 = lector.obtenerEnteroValidado("Ingrese un numero validado");
                                System.out.println("Ingrese un Valor de B13");
                                double d13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese un Valor de B21");
                                double d21 = lector.obtenerEnteroValidado("Ingrese un numero ");
                                System.out.println("Ingrese un Valor de B22");
                                double d22 = lector.obtenerEnteroValidado("Ingrese un numero!");
                                System.out.println("Ingrese un Valor de B23");
                                double d23 = lector.obtenerEnteroValidado("Ingrese un numero cruck");
                                System.out.println("Ingrese un Valor de B31");
                                double d31 = lector.obtenerEnteroValidado("Ingrese un number del 1 al 10");
                                System.out.println("Ingrese un Valor de B32");
                                double d32 = lector.obtenerEnteroValidado("Ingrese un numero wey si?");
                                System.out.println("Ingrese un Valor de B33");
                                double d33 = lector.obtenerEnteroValidado("Ingrese un numero cruck");
                                OMat3x3 d = new OMat3x3(d11,d12,d13,d21,d22,d23,d31,d32,d33);
                                System.out.println("la resta de la matriz"+c.resta(d));
                                break;
                            case 3:
                                System.out.println("Ingresar un Valor de A11");
                                double e11 = lector.obtenerEnteroValidado("Ingresar un numero ");
                                System.out.println("Ingresar un Valor de A12");
                                double e12 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un Valor de A13");
                                double e13 = lector.obtenerEnteroValidado("Ingresar un digito");
                                System.out.println("Ingresar un Valor de A21");
                                double e21 = lector.obtenerEnteroValidado("Ingresar un numeo");
                                System.out.println("Ingresar un Valor de de A22");
                                double e22 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un Valor A23");
                                double e23 = lector.obtenerEnteroValidado("Ingresar un digito");
                                System.out.println("Ingresar un Valor de A31");
                                double e31 = lector.obtenerEnteroValidado("Ingresar un numero");
                                System.out.println("Ingresar un Valor de A32");
                                double e32 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un Valor de A33");
                                double e33 = lector.obtenerEnteroValidado("Ingresar un numero");
                                OMat3x3 e = new OMat3x3(e11,e12,e13,e21,e22,e23,e31,e32,e33);
                                System.out.println("Ingresar un Valor de B11");
                                double f11 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un Valor de B12");
                                double f12 = lector.obtenerEnteroValidado("Ingresar un digito");
                                System.out.println("Ingresar un Valor de B13");
                                double f13 = lector.obtenerEnteroValidado("Ingresar un Numero");
                                System.out.println("Ingresar un Valor de B21");
                                double f21 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un Valor de B22");
                                double f22 = lector.obtenerEnteroValidado("Ingresar un numero");
                                System.out.println("Ingresar un Valor de B23");
                                double f23 = lector.obtenerEnteroValidado("Ingresar un digito");
                                System.out.println("Ingresar Un Valor de B31");
                                double f31 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un Valor de B32");
                                double f32 = lector.obtenerEnteroValidado("Ingresar un digito");
                                System.out.println("Ingresar un Valor de B33");
                                double f33 = lector.obtenerEnteroValidado("Ingresar un dato");
                                OMat3x3 f = new OMat3x3(f11,f12,f13,f21,f22,f23,f31,f32,f33);
                                System.out.println("la multiplicacion de la matriz es"+e.multiplicacion(f));
                                break;
                            case 4:
                                System.out.println("Ingresar un Valor de A11");
                                double g11 = lector.obtenerEnteroValidado("Ingresar un numero ");
                                System.out.println("Ingresar un Valor de A12");
                                double g12 = lector.obtenerEnteroValidado("Ingresar un digito ");
                                System.out.println("Ingresar un Valor de A13");
                                double g13 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un Valor de A21");
                                double g21 = lector.obtenerEnteroValidado("Ingresar un numero");
                                System.out.println("Ingresar un Valor de A22");
                                double g22 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un Valor de A23");
                                double g23 = lector.obtenerEnteroValidado("Ingresar un digito");
                                System.out.println("Ingresar un Valor de A31");
                                double g31 = lector.obtenerEnteroValidado("Ingresar un numero");
                                System.out.println("Ingresar un Valor de A32");
                                double g32 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un Valor de A33");
                                double g33 = lector.obtenerEnteroValidado("Ingresar un digito");
                                OMat3x3 g = new OMat3x3(g11,g12,g13,g21,g22,g23,g31,g32,g33);
                                System.out.println("la transpuesta es"+g.transpuesta());
                                break;
                            case 5:
                                System.out.println("Ingresar un Valor de A11");
                                double h11 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un Valor de A12");
                                double h12 = lector.obtenerEnteroValidado("Ingresar un digito");
                                System.out.println("Ingresar un valor de A13");
                                double h13 = lector.obtenerEnteroValidado("Ingresar un numero");
                                System.out.println("Ingresar un valor de A21");
                                double h21 = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingresar un valor de A22");
                                double h22 = lector.obtenerEnteroValidado("Ingrese un numero");
                                System.out.println("Ingresar un valor de A23");
                                double h23 = lector.obtenerEnteroValidado("Ingrese un digito");
                                System.out.println("Ingresar un valor de A31");
                                double h31 = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingresar un valor de A32");
                                double h32 = lector.obtenerEnteroValidado("Ingresar un numero");
                                System.out.println("Ingresar un valor de A33");
                                double h33 = lector.obtenerEnteroValidado("Ingresar un digito");
                                OMat3x3 h = new OMat3x3(h11,h12,h13,h21,h22,h23,h31,h32,h33);
                                System.out.println("La inversa es "+h.inversa());
                                break;
                            case 6:
                                System.out.println("Ingresar un valor de A11");
                                double i11 = lector.obtenerEnteroValidado("Ingresar un numero validisimo");
                                System.out.println("Ingresar un valor de A12");
                                double i12 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un valor de A13");
                                double i13 = lector.obtenerEnteroValidado("Ingresar un digito");
                                System.out.println("Ingresar un valor de A21");
                                double i21 = lector.obtenerEnteroValidado("Ingresar un numero");
                                System.out.println("Ingresar un valor de A22");
                                double i22 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un valor de A23");
                                double i23 = lector.obtenerEnteroValidado("Ingresar un digito");
                                System.out.println("Ingresar un valor de A31");
                                double i31 = lector.obtenerEnteroValidado("Ingresar un numero");
                                System.out.println("Ingresar un valor de A32");
                                double i32 = lector.obtenerEnteroValidado("Ingrese un dato");
                                System.out.println("Ingresar un valor de A33");
                                double i33 = lector.obtenerEnteroValidado("Ingrese un digito");
                                OMat3x3 i = new OMat3x3(i11,i12,i13,i21,i22,i23,i31,i32,i33);
                                System.out.println("el valor de la determinante es"+i.determinante());
                                break;
                            case 7:
                                System.out.println("Ingresar un valor de A11");
                                double j11 = lector.obtenerEnteroValidado("Ingresar un numero ");
                                System.out.println("Ingresar un valor de A12");
                                double j12 = lector.obtenerEnteroValidado("Ingresar un digito");
                                System.out.println("Ingresar un valor de A13");
                                double j13 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un valor de A21");
                                double j21 = lector.obtenerEnteroValidado("Ingresar un numero");
                                System.out.println("Ingresar un valor de A22");
                                double j22 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un valor de A23");
                                double j23 = lector.obtenerEnteroValidado("Ingresar un digito");
                                System.out.println("Ingresar un valor de A31");
                                double j31 = lector.obtenerEnteroValidado("Ingresar un dato");
                                System.out.println("Ingresar un valor de A32");
                                double j32 = lector.obtenerEnteroValidado("Ingresar un numero");
                                System.out.println("Ingresar un valor de A33");
                                double j33 = lector.obtenerEnteroValidado("Ingresar un number");
                                OMat3x3 j = new OMat3x3(j11,j12,j13,j21,j22,j23,j31,j32,j33);
                                double alphaX = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("la rotacion es"+j.rotacionX(alphaX));
                                break;
                            case 8:
                                System.out.println("Ingresar un valor de A11");
                                double k11 = lector.obtenerEnteroValidado("Ingresar un numero ");
                                System.out.println("Ingresar un valor de A12");
                                double k12 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar un valor de A13");
                                double k13 = lector.obtenerEnteroValidado("Ingresar un numero ");
                                System.out.println("Ingresar un valor de A21");
                                double k21 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar un valor de A22");
                                double k22 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar un valor de A23");
                                double k23 = lector.obtenerEnteroValidado("Ingresar un numero ");
                                System.out.println("Ingresar un valor de A31");
                                double k31 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar un valor de A32");
                                double k32 = lector.obtenerEnteroValidado("Ingresar un numero ");
                                System.out.println("Ingresar un valor de A33");
                                double k33 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                OMat3x3 k = new OMat3x3(k11,k12,k13,k21,k22,k23,k31,k32,k33);
                                double alphaY = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("la rotacion en y es"+k.rotacionY(alphaY));
                                break;
                            case 9:
                                System.out.println("Ingresar el valor de A11");
                                double l11 = lector.obtenerEnteroValidado("Ingresar un numero ");
                                System.out.println("Ingresar el valor de A12");
                                double l12 = lector.obtenerEnteroValidado("Ingresar un dato ");
                                System.out.println("Ingresar el valor de A13");
                                double l13 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de A21");
                                double l21 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de A22");
                                double l22 = lector.obtenerEnteroValidado("Ingresar un numero ");
                                System.out.println("Ingresar el valor de A23");
                                double l23 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de A31");
                                double l31 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de A32");
                                double l32 = lector.obtenerEnteroValidado("Ingresar un dato ");
                                System.out.println("Ingresar el valor de A33");
                                double l33 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                OMat3x3 l = new OMat3x3(l11,l12,l13,l21,l22,l23,l31,l32,l33);
                                double alphaZ = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("la rotacion en z"+l.rotacionZ(alphaZ));
                                break;
                            case 10:
                                OMat3x3 iden = new OMat3x3();
                                System.out.println(iden.identidad());
                                break;
                            case 11:
                                break;
                        }
                    case 3:
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Matriz de 4x4");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  1. Suma de dos matrices");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. Resta de dos matrices");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3. Multiplicacion de dos matrices");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4. Transpuesta de la matriz");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t5. Inversa de la matriz");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t6. Determinante de la matriz");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t7. Rotacion de la matriz en X");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t8. Rotacion de la matriz en Y");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t9. Rotacion de la matriz en Z");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10. Matriz Identidad");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t11. Salir");
                        System.out.println("\n ");
                        int opcionF = sc.nextInt();
                        switch (opcionF)
                        {
                            case 1:
                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Ingrese el valor de A11");
                                double a11 = lector.obtenerEnteroValidado("Ingresar un numero ");
                                System.out.println("Ingresar el valor de A12");
                                double a12 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de A13");
                                double a13 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de A14");
                                double a14 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de A21");
                                double a21 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de A22");
                                double a22 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de A23");
                                double a23 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de A24");
                                double a24 = lector.obtenerEnteroValidado(" Ingrear un dato valido");
                                System.out.println("Ingresar el valor de A31");
                                double a31 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de A32");
                                double a32 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de A33");
                                double a33 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de A34");
                                double a34 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el calor de A41");
                                double a41 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de A42");
                                double a42 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de A43");
                                double a43 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de A44");
                                double a44 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                OMat4x4 a = new OMat4x4(a11,a12,a13,a14,a21,a22,a23,a24,a31,a32,a33,a34,a41,a42,a43,a44);
                                System.out.println("Ingresar el valor de B11");
                                double b11 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de B12");
                                double b12 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de B13");
                                double b13 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de B14");
                                double b14 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de B21");
                                double b21 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de B22");
                                double b22 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de B23");
                                double b23 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de B24");
                                double b24 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de B31");
                                double b31 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de B32");
                                double b32 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de B33");
                                double b33 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de B34");
                                double b34 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de B41");
                                double b41 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de B42");
                                double b42 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de B43");
                                double b43 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de B44");
                                double b44 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                OMat4x4 b = new OMat4x4(b11,b12,b13,b14,b21,b22,b23,b24,b31,b32,b33,b34,b41,b42,b43,b44);
                                System.out.println(" la suma de la matriz es "+a.suma(b));
                                break;
                            case 2:
                                System.out.println("Ingresar el valor de A11");
                                double c11 = lector.obtenerEnteroValidado("Ingresar un numero ");
                                System.out.println("Ingresar el valor de A12");
                                double c12 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de A13");
                                double c13 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de A14");
                                double c14 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de A21");
                                double c21 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de A22");
                                double c22 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de A23");
                                double c23 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de A24");
                                double c24 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de A31");
                                double c31 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de A32");
                                double c32 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de A33");
                                double c33 = lector.obtenerEnteroValidado("Ingresar un digito valido");
                                System.out.println("Ingresar el valor de A34");
                                double c34 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el calor de A41");
                                double c41 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de A42");
                                double c42 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de A43");
                                double c43 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de A44");
                                double c44 = lector.obtenerEnteroValidado("Ingresar un digite valido");
                                OMat4x4 c = new OMat4x4(c11,c12,c13,c14,c21,c22,c23,c24,c31,c32,c33,c34,c41,c42,c43,c44);
                                System.out.println("Ingresar el valor de B11");
                                double d11 = lector.obtenerEnteroValidado("Ingrese un dato valido");
                                System.out.println("Ingresar el valor de B12");
                                double d12 = lector.obtenerEnteroValidado("Ingrese un digito valido");
                                System.out.println("Ingresar el valor de B13");
                                double d13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingresar el valor de B14");
                                double d14 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de B21");
                                double d21 = lector.obtenerEnteroValidado("Ingresar un digite valido");
                                System.out.println("Ingresar el valor de B22");
                                double d22 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de B23");
                                double d23 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de B24");
                                double d24 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de B31");
                                double d31 = lector.obtenerEnteroValidado("Ingresar un digite valido");
                                System.out.println("Ingresar el valor de B32");
                                double d32 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de B33");
                                double d33 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de B34");
                                double d34 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de B41");
                                double d41 = lector.obtenerEnteroValidado("Ingresar un digite valido");
                                System.out.println("Ingresar el valor de B42");
                                double d42 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                System.out.println("Ingresar el valor de B43");
                                double d43 = lector.obtenerEnteroValidado("Ingresar un dato valido");
                                System.out.println("Ingresar el valor de B44");
                                double d44 = lector.obtenerEnteroValidado("Ingresar un numero valido");
                                OMat4x4 d = new OMat4x4(d11,d12,d13,d14,d21,d22,d23,d24,d31,d32,d33,d34,d41,d42,d43,d44);
                                System.out.println("la resta de la matriz es "+c.resta(d));
                                break;
                            case 3:
                                System.out.println("Ingrese el valor de A11");
                                double e11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A12");
                                double e12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A13");
                                double e13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A14");
                                double e14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A21");
                                double e21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A22");
                                double e22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A23");
                                double e23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A24");
                                double e24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A31");
                                double e31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A32");
                                double e32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A33");
                                double e33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A34");
                                double e34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el calor de A41");
                                double e41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A42");
                                double e42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A43");
                                double e43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A44");
                                double e44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OMat4x4 e = new OMat4x4(e11,e12,e13,e14,e21,e22,e23,e24,e31,e32,e33,e34,e41,e42,e43,e44);
                                System.out.println("Ingrese el valor de B11");
                                double f11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B12");
                                double f12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B13");
                                double f13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B14");
                                double f14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B21");
                                double f21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B22");
                                double f22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B23");
                                double f23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B24");
                                double f24 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B31");
                                double f31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B32");
                                double f32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B33");
                                double f33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B34");
                                double f34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B41");
                                double f41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B42");
                                double f42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B43");
                                double f43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de B44");
                                double f44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OMat4x4 f = new OMat4x4(f11,f12,f13,f14,f21,f22,f23,f24,f31,f32,f33,f34,f41,f42,f43,f44);
                                System.out.println(e.multiplicacion(f));
                                break;
                            case 4:
                                System.out.println("Ingrese el valor de A11");
                                double g11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A12");
                                double g12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A13");
                                double g13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A14");
                                double g14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A21");
                                double g21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A22");
                                double g22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A23");
                                double g23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A24");
                                double g24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A31");
                                double g31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A32");
                                double g32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A33");
                                double g33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A34");
                                double g34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el calor de A41");
                                double g41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A42");
                                double g42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A43");
                                double g43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A44");
                                double g44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OMat4x4 g = new OMat4x4(g11,g12,g13,g14,g21,g22,g23,g24,g31,g32,g33,g34,g41,g42,g43,g44);
                                System.out.println("la transpuesta es"+g.transpuesta());
                                break;
                            case 5:
                                System.out.println("Ingrese el valor de A11");
                                double h11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A12");
                                double h12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A13");
                                double h13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A14");
                                double h14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A21");
                                double h21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A22");
                                double h22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A23");
                                double h23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A24");
                                double h24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A31");
                                double h31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A32");
                                double h32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A33");
                                double h33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A34");
                                double h34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el calor de A41");
                                double h41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A42");
                                double h42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A43");
                                double h43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A44");
                                double h44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OMat4x4 h = new OMat4x4(h11,h12,h13,h14,h21,h22,h23,h24,h31,h32,h33,h34,h41,h42,h43,h44);
                                System.out.println("la inversa es"+h.inversa());
                                break;
                            case 6:
                                System.out.println("Ingrese el valor de A11");
                                double i11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A12");
                                double i12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A13");
                                double i13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A14");
                                double i14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A21");
                                double i21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A22");
                                double i22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A23");
                                double i23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A24");
                                double i24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A31");
                                double i31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A32");
                                double i32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A33");
                                double i33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A34");
                                double i34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el calor de A41");
                                double i41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A42");
                                double i42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A43");
                                double i43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A44");
                                double i44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OMat4x4 i = new OMat4x4(i11,i12,i13,i14,i21,i22,i23,i24,i31,i32,i33,i34,i41,i42,i43,i44);
                                System.out.println("la determinante es "+i.determinante());
                                break;
                            case 7:
                                System.out.println("Ingrese el valor de A11");
                                double j11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A12");
                                double j12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A13");
                                double j13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A14");
                                double j14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A21");
                                double j21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A22");
                                double j22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A23");
                                double j23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A24");
                                double j24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A31");
                                double j31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A32");
                                double j32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A33");
                                double j33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A34");
                                double j34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el calor de A41");
                                double j41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A42");
                                double j42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A43");
                                double j43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A44");
                                double j44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OMat4x4 j = new OMat4x4(j11,j12,j13,j14,j21,j22,j23,j24,j31,j32,j33,j34,j41,j42,j43,j44);
                                double alphaX = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("la rotacionen el eje X es"+j.rotX(alphaX));
                                break;
                            case 8:
                                System.out.println("Ingrese el valor de A11");
                                double k11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A12");
                                double k12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A13");
                                double k13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A14");
                                double k14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A21");
                                double k21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A22");
                                double k22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A23");
                                double k23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A24");
                                double k24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A31");
                                double k31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A32");
                                double k32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A33");
                                double k33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A34");
                                double k34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el calor de A41");
                                double k41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A42");
                                double k42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A43");
                                double k43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A44");
                                double k44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OMat4x4 k = new OMat4x4(k11,k12,k13,k14,k21,k22,k23,k24,k31,k32,k33,k34,k41,k42,k43,k44);
                                double alphaY = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("la rotacion en Y es"+k.rotY(alphaY));
                                break;
                            case 9:
                                System.out.println("Ingrese el valor de A11");
                                double l11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A12");
                                double l12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A13");
                                double l13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A14");
                                double l14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A21");
                                double l21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A22");
                                double l22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A23");
                                double l23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A24");
                                double l24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A31");
                                double l31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A32");
                                double l32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A33");
                                double l33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A34");
                                double l34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el calor de A41");
                                double l41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A42");
                                double l42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A43");
                                double l43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de A44");
                                double l44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OMat4x4 l = new OMat4x4(l11,l12,l13,l14,l21,l22,l23,l24,l31,l32,l33,l34,l41,l42,l43,l44);
                                double alphaZ = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println(l.rotZ(alphaZ));
                                break;
                            case 10:
                                OMat4x4 iden = new OMat4x4();
                                System.out.println(iden.identidad());
                                break;
                            case 11:
                                break;
                        }
                }
            case 3: break;


        }
    }

}
