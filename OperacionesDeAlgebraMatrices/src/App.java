import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int repeticiones = 0;
        int opcion = 0;
        int cantidadFilas, cantidadColumnas;
        int tamaño, determinante, dimension;

        do{

           System.out.println(".     Operaciones de algebra de matrices    .");
           System.out.println("...................MENU......................");
           System.out.println(".1) Verificar si 2 matrices son iguales o no.");
           System.out.println(".2)       Sumar 2 matrices                  .");
           System.out.println(".3)      Generar una matriz 0               .");
           System.out.println(".4) Obtener el inverso aditivo de una matriz.");
           System.out.println(".5)       Restar 2 matrices                 .");
           System.out.println(".6) Multiplicar un escalar por una matriz   .");
           System.out.println(".7) Multiplicar 2 matrices compatibles      .");
           System.out.println(".8)   Obtener una matriz identidad          .");
           System.out.println(".9)   Obtener la inversa de una matriz      .");
           System.out.println(".10)  Obtener el determinante de una matriz .");
           System.out.println("");

           System.out.print("Seleccione la operacion que desea realizar: ");
           opcion = entrada.nextInt();

             if(opcion >= 1 && opcion <= 10){

                switch (opcion) {

                    case 1: 
                           
                            do{
                          
                                System.out.print("Ingrese la cantidad de filas de la primera matriz: ");
                                cantidadFilas = entrada.nextInt();
                                System.out.print("Ingrese la cantidad de columnas de la primera matriz: ");
                                cantidadColumnas = entrada.nextInt();
                                System.out.println("");

                                if(cantidadFilas >= 1 && cantidadColumnas >= 1){

                                     int [][] primMatriz = new int [cantidadFilas][cantidadColumnas];

                                     System.out.println("Ingrese los valores de la primera matriz");

                                     for(int i = 0; i < primMatriz.length; i++){
                                        for(int j = 0; j < primMatriz[i].length; j++){
                                           System.out.print("Matriz1 [" + i + "," + j + "] = ");
                                           primMatriz[i][j] = entrada.nextInt();

                                        }
                                    }

                                    System.out.println("Valores de la matriz 1");

                                    for(int i = 0; i < primMatriz.length; i++){
                                      for(int j = 0; j < primMatriz[i].length; j++){
                                          System.out.print("[" +primMatriz[i][j]+ "]");
                                      }
                                      System.out.println();
                                    }

                                    do{
                                        System.out.print("Ingrese la cantidad de filas de la segunda matriz: ");
                                        cantidadFilas = entrada.nextInt();
                                        System.out.print("Ingrese la cantidad de columnas de la segunda matriz: ");
                                        cantidadColumnas = entrada.nextInt();
                                        System.out.println("");

                                        if(cantidadFilas >= 1 && cantidadColumnas >= 1){

                                          int [][] segMatriz = new int [cantidadFilas][cantidadColumnas];

                                          System.out.println("Ingrese los valores de la segunda matriz");

                                            for(int i = 0; i < segMatriz.length; i++){
                                               for(int j = 0; j < segMatriz[i].length; j++){
                                                  System.out.print("Matriz2 [" + i + "," + j + "] = ");
                                                  segMatriz[i][j] = entrada.nextInt();
                                                }

                                            }

                                           System.out.println("Valores de la matriz 2");

                                            for(int i = 0; i < segMatriz.length; i++){
                                              for(int j = 0; j < segMatriz[i].length; j++){
                                                  System.out.print("[" +segMatriz[i][j]+ "]");
                                                }
                                                System.out.println();
                                            }


                                            if(Arrays.deepEquals(primMatriz, segMatriz)){
                                              System.out.println("Las matrices son iguales.");
                                            }else{
                                              System.out.println("Las matrices son distintas.");
                                            }

                                        }else{

                                            System.out.println("No se ingresan numeros negativos.");

                                            repeticiones++;

                                            if(repeticiones == 3){
                                            System.out.println("Error! se intento varias veces.");
                                            }
                                        }

                                    }while(repeticiones < 3);

                                

                                }else{

                                    System.out.println("No se ingresan numeros negativos.");

                                    repeticiones++;

                                    if(repeticiones == 3){
                                       System.out.println("Error! se intento varias veces.");
                                    }

                                }

                            }while(repeticiones < 3);
                               
                        break;

                    case 2: 
                            
                    
                        do{
                            
                            System.out.print("Ingrese la cantidad de filas para ambas matrices: ");
                            cantidadFilas = entrada.nextInt();
                            System.out.print("Ingrese la cantidad de columnas para ambas matrices: ");
                            cantidadColumnas = entrada.nextInt();
                            System.out.println("");

                            if(cantidadFilas >= 1 && cantidadColumnas >= 1){
 
                               int [][] primeraMatriz = new int [cantidadFilas][cantidadColumnas];

                               System.out.println("Ingrese los valores de la primera matriz");

                                for(int i = 0; i < primeraMatriz.length; i++){
                                    for(int j = 0; j < primeraMatriz[i].length; j++){
                                      System.out.print("Matriz1 [" + i + "," + j + "] = ");
                                      primeraMatriz[i][j] = entrada.nextInt();
                                    }

                                }

                                System.out.println("Valores de la matriz 1");

                                for(int i = 0; i < primeraMatriz.length; i++){
                                    for(int j = 0; j < primeraMatriz[i].length; j++){
                                      System.out.print("[" +primeraMatriz[i][j]+ "]");
                                    }
                                    System.out.println();
                                }

                               int [][] segundaMatriz = new int [cantidadFilas][cantidadColumnas];

                               System.out.println("Ingrese los valores de la segunda matriz");

                                for(int i = 0; i < segundaMatriz.length; i++){
                                    for(int j = 0; j < segundaMatriz[i].length; j++){
                                       System.out.print("Matriz2 [" + i + "," + j + "] = ");
                                       segundaMatriz[i][j] = entrada.nextInt();
                                    
                                    }
                                }

                                System.out.println("Valores de la matriz 2");

                                for(int i = 0; i < segundaMatriz.length; i++){
                                    for(int j = 0; j < segundaMatriz[i].length; j++){
                                        System.out.print("[" +segundaMatriz[i][j]+ "]");
                                    }
                                    System.out.println();
                                }

                               int [][] sumaMatriz = new int [cantidadFilas][cantidadColumnas];

                               System.out.println("La suma de las 2 mastrices es: ");

                                for(int i = 0; i < primeraMatriz.length; i++){
                                    for(int j = 0; j < segundaMatriz[i].length; j++){

                                     sumaMatriz[i][j] = primeraMatriz[i][j] + segundaMatriz[i][j];
                                 
                                     System.out.print("[" +sumaMatriz[i][j]+ "]");
                                    }
                                    System.out.println();
                                }


                            }else{

                                System.out.println("No se ingresan numeros negativos.");

                                repeticiones++;

                                if(repeticiones == 3){
                                   System.out.println("Error se intento varias veces.");
                                }
                            }

                            
                         
                        }while(repeticiones < 3);
                        
                    break;
                        
                    case 3: 
                    
                        do{   
                            
                            System.out.println("Ingrese las dimensiones de la matriz.");
                            System.out.println("");
                            System.out.print("Ingrese la cantidad de filas: ");
                            cantidadFilas = entrada.nextInt();
                            System.out.print("Ingrese la cantidad de columnas: ");
                            cantidadColumnas = entrada.nextInt();

                            if(cantidadFilas >= 1 && cantidadColumnas >= 1){

                              int [][] matrizNula = new int[cantidadFilas][cantidadColumnas];

                                for(int i = 0; i < matrizNula.length; i++){
                                    for(int j = 0; j < matrizNula[i].length; j++){

                                       matrizNula[i][j] = 0;
                                       System.out.print( "[" +matrizNula[i][j]+ "]");

                                    }
                                    System.out.println();
                               }

                            }else{

                                System.out.println("No se ingresan numeros negativos.");

                                repeticiones++;

                                if(repeticiones == 3){
                                   System.out.println("Error! se intento varias veces.");
                                }

                            } 

                           
                        }while(repeticiones < 3);

                        
                    break;

                    case 4: 
                     
                        do{
                    
                           System.out.print("Ingrese la cantidad de filas para la matriz: ");
                           cantidadFilas = entrada.nextInt();
                           System.out.print("Ingrese la cantidad de columnas para la matriz: ");
                           cantidadColumnas = entrada.nextInt();
                           System.out.println("");

                            if(cantidadFilas >= 1 && cantidadColumnas >= 1){

                                int [][] matrizOriginal = new int[cantidadFilas][cantidadColumnas];

                                System.out.println("Ingrese los valores de la matriz");

                                for(int i = 0; i < matrizOriginal.length; i++){
                                    for(int j = 0; j < matrizOriginal[i].length; j++){

                                     System.out.print("Matriz A [" +i+ "," +j+ "] = ");
                                     matrizOriginal[i][j] = entrada.nextInt();
                                    }
                                }

                                System.out.println("Valores de la matriz A");

                                for(int i = 0; i < matrizOriginal.length; i++){
                                    for(int j = 0; j < matrizOriginal[i].length; j++){

                                     System.out.print("[" +matrizOriginal[i][j]+ "]");

                                    }
                                  System.out.println();
                                }

                                int [][] inversoAditivo = new int [cantidadFilas][cantidadColumnas];

                                System.out.println("El inverso aditivo de A es : ");
                                System.out.println("");

                                for(int i = 0; i < matrizOriginal.length; i++){
                                    for(int j = 0; j < matrizOriginal[i].length; j++){
                        
                                     inversoAditivo[i][j] = - (matrizOriginal[i][j]);
                                     System.out.print("[" +inversoAditivo[i][j]+ "]");

                                    }
                                    System.out.println();
                                }
                                
                            }else{

                                System.out.println("No se ingresan numeros negativos.");

                                repeticiones++;

                                if(repeticiones == 3){
                                   System.out.println("Error! se intento varias veces.");
                                }
                            }

                        }while(repeticiones < 3);
                        
                    break;

                    case 5: 
                     
                        do{
                            
                            System.out.print("Ingrese la cantidad de filas para ambas matrices: ");
                            int cantFilas = entrada.nextInt();
                            System.out.print("Ingrese la cantidad de columnas para ambas matrices: ");
                            int cantColumnas = entrada.nextInt();
                            System.out.println("");

                            if(cantFilas >= 1 && cantColumnas >= 1){

                              int [][] matrizPrimera = new int [cantFilas][cantColumnas];
                            
                              System.out.println("Ingrese los valores de la primera matriz");

                                for(int i = 0; i < matrizPrimera.length; i++){
                                    for(int j = 0; j < matrizPrimera[i].length; j++){
                                      System.out.print("Matriz1 [" + i + "," + j + "] = ");
                                      matrizPrimera[i][j] = entrada.nextInt();
                                    }

                                }

                                System.out.println("Valores de la matriz 1");

                                for(int i = 0; i < matrizPrimera.length; i++){
                                    for(int j = 0; j < matrizPrimera[i].length; j++){
                                       System.out.print("[" +matrizPrimera[i][j]+ "]");
                                    }
                                    System.out.println();
                                }

                                int [][] matrizSegunda = new int [cantFilas][cantColumnas];

                                System.out.println("Ingrese los valores de la segunda matriz");

                                for(int i = 0; i < matrizSegunda.length; i++){
                                    for(int j = 0; j < matrizSegunda[i].length; j++){

                                        System.out.print("Matriz 2 [" + i + "," + j + "] = ");
                                        matrizSegunda[i][j] = entrada.nextInt();
                                    
                                    }
                                }

                                System.out.println("Valores de la matriz 2");

                                for(int i = 0; i < matrizSegunda.length; i++){
                                    for(int j = 0; j < matrizSegunda[i].length; j++){
                                        System.out.print("[" +matrizSegunda[i][j]+ "]");
                                    }
                                    System.out.println();
                               }

                               int [][] matrizResta = new int [cantFilas][cantColumnas];

                               System.out.println("La resta de las 2 mastrices es: ");

                               for(int i = 0; i < matrizPrimera.length; i++){
                                    for(int j = 0; j < matrizSegunda[i].length; j++){

                                     matrizResta[i][j] = matrizPrimera[i][j] - matrizSegunda[i][j];
                                     System.out.print("[" +matrizResta[i][j]+ "]");
                                    }
                                    System.out.println();
                               }

                            }else{

                                System.out.println("No se ingresan numeros negativos.");

                                repeticiones++;

                                if(repeticiones == 3){
                                  System.out.println("Error! se intento vaias veces.");
                                }

                            }

                            
                        }while(repeticiones < 3);

                    break;

                    case 6: 
                     
                        do{

                           System.out.print("Ingrese la cantidad de filas: ");
                           cantidadFilas = entrada.nextInt();
                           System.out.print("Ingrese la cantidad de columnas: ");
                           cantidadColumnas = entrada.nextInt();
                           System.out.println("");

                           if(cantidadFilas >= 1 && cantidadColumnas >= 1){

                              int [][] matriz = new int [cantidadFilas][cantidadColumnas];

                              System.out.println("Ingrese los valores de la matriz");

                               for(int i = 0; i < matriz.length; i++){
                                    for(int j = 0; j < matriz[i].length; j++){
                                      System.out.print("MatrizA [" + i + "," + j + "] = ");
                                      matriz[i][j] = entrada.nextInt();
                                    }

                                }

                               System.out.println("Valores de la matriz");

                                for(int i = 0; i < matriz.length; i++){
                                    for(int j = 0; j < matriz[i].length; j++){
                                      System.out.print("[" +matriz[i][j]+ "]");
                                    }
                                    System.out.println();
                                }

                               System.out.print("Ingrese el numero a multiplicar: ");
                               int escalar = entrada.nextInt();
                               System.out.println("");

                               int [][] escalarPorMatriz = new int [cantidadFilas][cantidadColumnas];

                               for(int i = 0; i < matriz.length; i++){
                                    for(int j = 0; j < matriz[i].length; j++){
                                    
                                      escalarPorMatriz[i][j] = escalar * matriz[i][j];
                                      System.out.print("[" +escalarPorMatriz[i][j]+ "]");
                                   }
                                   System.out.println();
                                } 


                           }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }

                           }

                            
                        }while(repeticiones < 3);

                        
                    break;

                    case 7:
                    
                        do{       
                             
                            System.out.print("Ingrese la cantidad de filas de la primera matriz: ");
                            int cantidadFilas1 = entrada.nextInt();
                            System.out.print("Ingrese la cantidad de columnas de la primera matriz: ");
                            int cantidadColumnas1 = entrada.nextInt();
                            System.out.println("");

                            if(cantidadFilas1 >= 1 && cantidadColumnas1 >= 1){

                              int [][] matriz1 = new int [cantidadFilas1][cantidadColumnas1];

                              System.out.println("Ingrese los valores de la matriz A");

                                for(int i = 0; i < matriz1.length; i++){
                                    for(int j = 0; j < matriz1[i].length; j++){

                                     System.out.print("matrizA [" +i+ "," +j+ "] = ");
                                     matriz1 [i][j] = entrada.nextInt();

                                    }
                                }

                               System.out.println("Valores de la matriz A");

                               for(int i = 0; i < matriz1.length; i++){
                                    for(int j = 0; j < matriz1[i].length; j++){
                                      System.out.print("[" +matriz1[i][j]+ "]");
                                    }
                                  System.out.println();
                                }

                                
                                do{

                                   System.out.print("Ingrese la cantidad de filas de la segunda matriz: ");
                                   int cantidadFilas2 = entrada.nextInt();
                                   System.out.print("Ingrese la cantidad de columnas de la segunda matriz: ");
                                   int cantidadColumnas2 = entrada.nextInt();
                                   System.out.println("");

                                    if(cantidadFilas2 >= 1 && cantidadColumnas2 >= 1){

                                       int [][] matriz2 = new int [cantidadFilas2][cantidadColumnas2];

                                       System.out.println("Ingrese los valores de la matriz B");

                                        for(int i = 0; i < matriz2.length; i++){
                                            for(int j = 0; j < matriz2[i].length; j++){

                                             System.out.print("MatrizB [" +i+ "," +j+ "] = ");
                                              matriz2[i][j]= entrada.nextInt();

                                            }
                                        }

                                       System.out.println("Valores de la matriz B");
 
                                        for(int i = 0; i < matriz2.length; i++){
                                            for(int j = 0; j < matriz2[i].length; j++){

                                             System.out.print("[" +matriz2[i][j]+ "]");

                                            }
                                            System.out.println();
                                        }

                                        if(cantidadColumnas1 == cantidadFilas2){

                                          System.out.println("Las matrices son compatibles.");

                                          int [][] multiplicacionDeMatriz = new int [cantidadFilas1][cantidadColumnas2];

                                            for(int i = 0; i < cantidadFilas1; i++){
                                                for(int j = 0; j < cantidadColumnas2; j++){
                                                    for(int k = 0; k < cantidadColumnas1; k++){

                                                     multiplicacionDeMatriz[i][j] += matriz1[i][k] * matriz2[k][j];
                                           
                                                    }
                                                    System.out.print("[" +multiplicacionDeMatriz[i][j]+ "]");
                                                } 
                                             System.out.println();
                                            }
                                    
                                        }else{

                                          System.out.println("Las matrices no son compatibles.");
                                          System.out.println("No se puede realizar la multiplicacion de matrices.");
                                        }


                                    }else{

                                        System.out.println("No se ingresan numeros negativos.");

                                        repeticiones++;

                                        if(repeticiones == 3){
                                          System.out.println("Error! se intento varias veces.");
                                        }

                                    }

                                }while(repeticiones < 3);
                                   
                            
                            }else{

                                System.out.println("No se ingresan numeros negativos.");

                                repeticiones++;

                                if(repeticiones == 3){
                                   System.out.println("Error! se intento varias veces.");
                                }
                            }

                        }while(repeticiones < 3);
                        
                    break;

                    case 8: 
                    
                        do{

                            System.out.print("Ingrese el tamaño de la matriz n: ");
                            dimension = entrada.nextInt();
                            System.out.println("");

                            if(dimension >= 1){

                             int [][] matrizIdentidad = new int[dimension][dimension];

                             for(int i = 0; i < matrizIdentidad.length; i++){
                                for(int j = 0; j < matrizIdentidad[i].length; j++){

                                    if(i == j){

                                        matrizIdentidad[i][j] = 1;

                                    }else{
                                        matrizIdentidad[i][j] = 0;
                                    } 

                                    System.out.print("[" +matrizIdentidad[i][j]+ "]");
                                }

                                System.out.println();
                             }

                            }else{

                                System.out.println("No se ingresan numeros negativos.");

                                repeticiones++;

                                if(repeticiones == 3){
                                   System.out.println("Error! se intento varias veces.");
                                }

                            }
                            
                        }while(repeticiones < 3);
                        
                    break;

                    case 9: 
                      
                        do{
                          
                            System.out.print("Ingrese el tamaño de la matriz n: " );
                            tamaño = entrada.nextInt();
                            System.out.println("");

                            if(tamaño >= 1){

                                int [][] originalMatriz = new int[tamaño][tamaño];

                                System.out.println("Ingrese los valores de la matriz A: ");

                                for(int i = 0; i < originalMatriz.length; i++){
                                  for(int j = 0; j < originalMatriz[i].length; j++){

                                      System.out.print("MatrizA [" + i + "," + j + "] = ");
                                      originalMatriz[i][j] = entrada.nextInt();

                                    }
                                }

                               System.out.println("Valores de la matriz A");
                               System.out.println("");

                                for(int i = 0; i < originalMatriz.length; i++){
                                   for(int j = 0; j < originalMatriz[i].length; j++){

                                       System.out.print("[" +originalMatriz[i][j]+ "]");
                                    }
                                    System.out.println();
                                }

                                int [][] matrizInversa = new int [tamaño][tamaño];

                                for(int i = 0; i < originalMatriz.length; i++){
                                    for(int j = 0; j < originalMatriz[i].length; j++){

                                      matrizInversa[i][j] = originalMatriz[j][i];

                                    }
                                }

                               System.out.println("La matriz inversa de A es: ");

                                for(int i = 0; i < originalMatriz.length; i++){
                                    for(int j = 0; j < originalMatriz[i].length; j++){

                                      System.out.print("[" +matrizInversa[i][j]+ "]");
                                
                                    }
                                    System.out.println();
                                }


                            }else{

                                System.out.println("No se ingresan numeros negativos.");

                                repeticiones++;

                                if(repeticiones == 3){
                                   System.out.println("Error! se intento varias veces.");
                                }

                            }
                            
                        }while(repeticiones < 3);
                        
                    break;

                    case 10:
                    
                        do{

                            System.out.print("Ingrese el tamaño de la matriz n: ");
                            tamaño = entrada.nextInt();

                            if(tamaño >= 1){

                                int [][] matrizDet = new int [tamaño][tamaño];

                                if(tamaño == 1){
  
                                   System.out.println("Ingrese los valores de la matriz A");

                                    for(int i = 0; i < matrizDet.length; i++){
                                        for(int j = 0; j < matrizDet[i].length; j++){

                                          System.out.print("MatrizA [" +i+ "," +j+ "] = ");
                                          matrizDet[i][j] = entrada.nextInt();
                                        }
                                    }

                                    determinante = matrizDet[0][0];
                                    System.out.println("El determinante de la matriz [A] es: " + determinante);
                            
                                }else if(tamaño == 2){

                                   System.out.println("Ingrese los valores de la matriz A");

                                    for(int i = 0; i < matrizDet.length; i++){
                                        for(int j = 0; j < matrizDet[i].length; j++){

                                          System.out.print("MatrizA [" +i+ "," +j+ "] = ");
                                          matrizDet[i][j] = entrada.nextInt();
                                        }
                                    }

                                   System.out.println("El valor de la matriz A es: ");

                                    for(int i = 0; i < matrizDet.length; i++){
                                        for(int j = 0; j < matrizDet[i].length; j++){

                                          System.out.print("["+matrizDet[i][j]+ "]");

                                        }
                                        System.out.println();
                                    }

                                    determinante = (matrizDet[0][0] * matrizDet[1][1]) - (matrizDet[0][1] * matrizDet[1][0]);
                                    System.out.println("El determinante de la matriz [A] es: " + determinante);
                                
                                     
                                }else if(tamaño == 3){

                                    System.out.println("Ingrese los valores de la matriz A");

                                    for(int i = 0; i < matrizDet.length; i++){
                                        for(int j = 0; j < matrizDet[i].length; j++){

                                          System.out.print("MatrizA [" +i+ "," +j+ "] = ");
                                          matrizDet[i][j] = entrada.nextInt();
                                        }
                             
                                    }

                                    System.out.println("El valor de la matriz A es: ");

                                    for(int i = 0; i < matrizDet.length; i++){
                                        for(int j = 0; j < matrizDet[i].length; j++){

                                          System.out.print("["+matrizDet[i][j]+ "]");

                                        }
                                        System.out.println();
                                    }

                                    determinante = ((matrizDet[0][0] * matrizDet[1][1] * matrizDet[2][2]) + (matrizDet[1][0] * matrizDet[2][1] * matrizDet[0][2]) + (matrizDet[0][1] * matrizDet[1][2] * matrizDet[2][0])) - ((matrizDet[0][2] * matrizDet[1][1] * matrizDet[2][0]) + (matrizDet[2][1] * matrizDet[1][2] * matrizDet[0][0]) + (matrizDet[1][0] * matrizDet[0][1] * matrizDet[2][2]));
                                    System.out.println("El determinante de la matriz [A] es: " + determinante);

                                } 

                            }else{

                               System.out.println("No se ingresan numeros negativos.");
                               System.out.println("");

                               repeticiones++;

                                if(repeticiones == 3){
                                 System.out.println("Error! se intento varias veces.");
                                }

                            } 

                        }while(repeticiones < 3);   

                    break;
                
                    default: System.out.println("No existe la opcion.");
                        
                    break;
                }

                repeticiones = 3;

            }else{
               System.out.println("No se puede ingresar numeros negativos.");

               repeticiones++;

               if(repeticiones == 3){
                  System.out.println("Error! se intento varias veces.");
               }

            }

        }while(repeticiones < 3);

        entrada.close();
    }
}
