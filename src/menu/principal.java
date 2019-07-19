//TODO: ¿usar un MAP para el ID de la pila?
//TODO:static para la ID del menu, incremental para el id del item, NOMBRE DEL MENU para cada menu que cree

package menu;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String entrada = new String();
	boolean continuar = true;

	ArrayList<Menu> pila = new ArrayList<Menu>();

        String opcionesMenuPrincipal[] = {"CUENTA","OPCIONES","SALIR"};
	Menu menuPrincipal = new Menu("0", "MENU PRINCIPAL" , opcionesMenuPrincipal);
	pila.add(menuPrincipal);
	
        String opcionesMenuCuenta[] = {"CARGAR SALDO", "RETIRAR SALDO","CONSULTAR SALDO","SALIR"};
//	Menu menuCuenta = new Menu("1", "CARGAR SALDO", opcionesMenuCuenta);
//	pila.add(menuCuenta);

//	System.out.println(menuPrincipal.getItem(1));
	
//	System.out.println(pila.get(pila.size()-1).getLargo()); //Conbino dos tipos: obtengo el largo(tipo menu) del ultimo de la fila (tipo ArrayList)
	
	
	do {
	    pila.get(pila.size()-1).mostrarMenu();
	    System.out.println("Seleccione una opción.");
	    entrada = pila.get(pila.size()-1).getId() + "." + scanner.nextLine();
	    
	    for (int i = 0; i < pila.get(pila.size()-1).getLargo(); i++) { //no hace el loop sobre la pila sino sobre el largo del ultimo item en esa pila
		if (entrada.equals(pila.get(pila.size()-1).getId() + "." + i)) {      //¿esta en la pila? <------------------------------------------ corregir esto
		    System.out.println(pila.get(pila.size()-1).getNombreMenu());
		    System.out.println(pila.get(pila.size()-1).getItem(i) + "-----ELEGIDO------");
		    
		    //funcion del tipo menu que retorna un string, va donde opcionesMenuCuenta, realiza un bucle buscando el nombre en la pila y retorna el ID
		    Menu nuevoMenu = new Menu( "2",pila.get(pila.size()-1).getItem(i), opcionesMenuCuenta);
		    
		    System.out.println("el guion de arriba es prueba");
		    System.out.println(nuevoMenu);
		    pila.add(nuevoMenu);
		    System.out.println(pila.size() + " largoo");
		}
		if (entrada.equals(pila.get(pila.size()-1).getId() + "." + "salir")) {      //¿esta en la pila?
		    continuar = false;
		}
	    }
	    
//	    for (int i = 0; i < 10; i++) {
//		System.out.println(pila.get(pila.size()-1).getItem(1));
//	    }

	} while (continuar);

//
//	pila.add(menuCuenta.mostrarMenu());
//        System.out.println(menuPrincipal.getMenu());

//        for (String string : opcionesMenuPrincipal) {
//            System.out.println( string );
//        }
    }
}
