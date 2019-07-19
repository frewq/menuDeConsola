//TODO: usar ID para cada menu
//ID debe ser Static
package menu;

import java.util.ArrayList;

public class Menu {

    private String nombreMenu;
    private String id;
    private String[] menu;
    private ArrayList<String> id_opcion = new ArrayList<String>();

    public Menu(String id, String nombreMenu, String[] menu) {
	this.nombreMenu = nombreMenu;
	this.id = id;
	this.menu = menu;
	for (int i = 0; i < menu.length; i++) {
	    this.id_opcion.add(this.id + "." + i);
	}
    }

    public String getNombreMenu() {
	return nombreMenu;
    }

    public int getLargo() {
	return menu.length;
    }

    public String getId() {
	return id;
    }

    public ArrayList<String> getId_opcion() {
	return id_opcion;
    }

    public String getItem(int item) {
	return menu[item];
    }

    public void mostrarMenu() {
//        opciones = "";
	for (String string : menu) {
//            opciones = opciones+ " " + string;
	    System.out.println(string);
	}
    }

}
