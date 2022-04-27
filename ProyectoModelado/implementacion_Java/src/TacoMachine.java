import java.util.Scanner;

public class TacoMachine{
	

	public static void main(String[] args) {
		TacoMachineFacade facade = new TacoMachineFacade();
		facade.bienvenida();
		facade.menu();
		facade.componerOrden();
		
    }
 }


