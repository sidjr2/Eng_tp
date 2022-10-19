package Visao;

import Control.Controlador;
import java.util.Scanner;


public class Visao {

	  private Controlador controller;
	  private Scanner scan = new Scanner(System.in);

	  public Visao(Controlador controller) {
	    this.controller = controller;
	  }

	  public void update(int id) {
	    System.out.print("\n\nId: " + id + "\n\n");
	  }

	  public void run() {
		  while(true) {
			  switch(menu()){
				  case 1:
					  Vender();
					  break;
				  case 2:
					  Cardapio();
					  break;
				  case 3:
					  sair();
			  }	
				  
		  }
	  }
		
	  public int menu() {    
		    System.out.println("\n\n1 - Vender\n2- Cardapio\n3 - Sair\n");
			System.out.print("Sua opcao: ");
			return scan.nextInt();
	  }

	  public void Vender() {
			controller.vender();
	  }
		
	  public void Cardapio() {
			controller.Cardapio();
	  }

	  public void sair() {
	    scan.close();
	  }

}

