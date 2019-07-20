package menu;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String entrada = new String();
	boolean continuar = true;
	Menu menuSiguente;

	ArrayList<Menu> pila = new ArrayList<Menu>();

	String opcionesMenuPrincipal[] = {"CUENTA", "OPCIONES", "SALIR"};
	Menu menuPrincipal = new Menu("MENU PRINCIPAL", opcionesMenuPrincipal);
	pila.add(menuPrincipal);

	String opcionesMenuCuenta[] = {"CARGAR SALDO", "RETIRAR SALDO", "CONSULTAR SALDO", "ATRAS", "SALIR"};
	Menu menuCuenta = new Menu("CARGAR SALDO", opcionesMenuCuenta);

	String opcionesMenuOpciones[] = {"PEDIR AYUDA", "CAMBIAR CONTRASEÑA", "ATRAS", "SALIR"};
	Menu menuOpciones = new Menu("OPCIONES", opcionesMenuOpciones);

	String opcionesAtras[] = {"ATRAS"};
	Menu menuAtras = new Menu("ATRAS", opcionesAtras);

	String opcionesSalir[] = {"SALIR"};
	Menu menuSalir = new Menu("SALIR", opcionesSalir);

	menuSiguente = menuPrincipal;

	do {
	    System.out.println("************************************");
	    pila.get(pila.size() - 1).mostrarMenu();
	    System.out.println("************************************");
	    System.out.println("Seleccione una opción.");
	    entrada = scanner.nextLine().toUpperCase();
	    for (int i = 0; i < pila.get(pila.size() - 1).getCantidadOpciones(); i++) { //no hace el loop sobre la pila sino sobre el largo del ultimo item en esa pila
		if (entrada.equals(pila.get(pila.size() - 1).getItem(i))) {      //¿esta entre las opciones en la pila? <------------------------------------------ corregir esto
		    System.out.println("-----ELEGIDO------>: " + pila.get(pila.size() - 1).getItem(i));

		    if (pila.get(pila.size() - 1).getItem(i) == "CUENTA") {
			menuSiguente = menuCuenta;
		    }

		    if (pila.get(pila.size() - 1).getItem(i) == "OPCIONES") {
			menuSiguente = menuOpciones;
		    }

		    if (pila.get(pila.size() - 1).getItem(i) == "ATRAS") {
			menuSiguente = menuAtras;
		    }

		    if (pila.get(pila.size() - 1).getItem(i) == "SALIR") {
			menuSiguente = menuSalir;
			continuar = false;
		    }

//		    System.out.println(pila.size() + " tamaño de la pila");
		}
	    }
	    pila.add(menuSiguente);
	    if (pila.get(pila.size() - 1).getNombreMenu() == "ATRAS") {
		pila.remove(pila.size() - 1);
		pila.remove(pila.size() - 1);
	    }
	} while (continuar);
    }
}
