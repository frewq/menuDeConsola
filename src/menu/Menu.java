package menu;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    private String nombreMenu;
    private String[] opciones;

    public Menu(String nombreMenu, String[] opciones) {
	this.nombreMenu = nombreMenu.toUpperCase();
	this.opciones = opciones;

	for (String opcion : this.opciones) {
	    opcion.toUpperCase();
	}
    }

    public String getNombreMenu() {
	return nombreMenu;
    }

    public int getCantidadOpciones() {
	return opciones.length;
    }

    public String getItem(int item) {
	return opciones[item];
    }

    public String getOpciones() {
	return Arrays.toString(opciones);
    }

    public void mostrarMenu() {
	for (String string : opciones) {
	    System.out.println(string);
	}
    }

}
