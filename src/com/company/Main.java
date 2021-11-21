package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {


        HashTable Tabla = new HashTable();
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         PrintStream out = System.out;

         do {
             out.println("Ingrese palabra: ");
             String line = in.readLine();
             out.println("Palabra ingresada: " + line);
             Tabla.add(line);
             out.println(Tabla.print());
        }while (true);





    }


}
