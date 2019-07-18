package menu;

import java.util.Scanner;

public class principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String opcionesMenuPrincipal[] = {"CUENTA","OPCIONES","SALIR"};
        Menu menuPrincipal = new Menu(opcionesMenuPrincipal);
        
        String opcionesMenuCuenta[] = {"CARGAR SALDO", "RETIRAR SALDO","CONSULTAR SALDO","SALIR"};
        Menu menuCuenta = new Menu(opcionesMenuCuenta);
        
//        System.out.println( menuCuenta.getLargo() );
        
        for (String string : opcionesMenuPrincipal) {
            System.out.println( string );
        }
        
    }
}
