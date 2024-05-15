package com.mycompany.actividades;

import javax.swing.JOptionPane;

public class Ejercicioplatos {
     public static void main(String[] args) {
        int codMenuPpal=0, cantPlatos=0, cantPlatosTipicos=0, cantPlatosInternacionales=0, cantPlatosCarta=0;
        float precioTotal = 0;
        final float PRECIO_PLATO_TIPICO = 12000, PRECIO_PLATO_CARTA = 8000, PRECIO_PLATO_INTERNACIONAL = 25000;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente"), factura="== Factura ==\n";
        do {
            String menu="MENU RESTAURANTE\n\n";
            menu+="1. Plato Tipico\n";
            menu+="2. Plato a la Carta\n";
            menu+="3. Plato Internacional\n";
            menu+="4. Salir\n\n";
            menu+="Por favor seleccione una opción \n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (codMenuPpal >= 1 && codMenuPpal <= 3)
                cantPlatos += 1;
            switch (codMenuPpal) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Frijoles, el costo es de $"+PRECIO_PLATO_TIPICO);
                    precioTotal += PRECIO_PLATO_TIPICO;
                    cantPlatosTipicos += 1;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Sopa de verduras, el costo es de $"+PRECIO_PLATO_CARTA);
                    precioTotal += PRECIO_PLATO_CARTA;
                    cantPlatosCarta += 1;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Se ha solicitado un cabiar, el costo es $"+PRECIO_PLATO_INTERNACIONAL);
                    precioTotal += PRECIO_PLATO_INTERNACIONAL;
                    cantPlatosInternacionales += 1;
                    break;
                case 4:
                    if (cantPlatosTipicos > 0)
                        factura += "Platos tipicos x"+cantPlatosTipicos+" = $"+(cantPlatosTipicos * PRECIO_PLATO_TIPICO)+"\n";
                    if (cantPlatosCarta > 0)
                        factura += "Platos de la carta x"+cantPlatosCarta+" = $"+(cantPlatosCarta * PRECIO_PLATO_CARTA)+"\n";
                    if (cantPlatosInternacionales > 0)
                        factura += "Platos de la carta x"+cantPlatosInternacionales+" = $"+(cantPlatosInternacionales * PRECIO_PLATO_INTERNACIONAL)+"\n";
                    factura +="\nCliente :"+nombre;
                    factura += "\nTotal a pagar: "+precioTotal;
                    System.out.println(factura);
                    JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
                default:
                    break;
            }
        } while (codMenuPpal!=4);
    }
}

