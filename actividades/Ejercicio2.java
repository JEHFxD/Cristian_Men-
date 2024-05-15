package com.mycompany.actividades;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        int n, opcion, n1, n2;
        String nombre, menu;
        menu = "Seleccione una opción\n\n1. Saludar\n2. Pedir nombre de una persona\n3. Sumar 2 números\n";
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces que se ejecutará el programa"));
        for (int i = 0;i<n; i++) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Hello There", "Hello There",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showInputDialog("Ingrese el nombre de una persona");
                    break;
                case 3:
                    n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
                    JOptionPane.showMessageDialog(null,n1+n2, "Resultado",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"El valor ingresado no es valido", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
