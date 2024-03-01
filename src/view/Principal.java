package view;

import controller.MDCController;

public class Principal {
	public static void main (String [] args) {
		
		MDCController classe = new MDCController();
		
		int y = 20; 
		int x = 24; 
		int resultado = classe.FuncaoMdc(x,y);
		System.out.println("O MDC de " + x + " e " + y + " é: " + resultado);
		
		
		
	}
	
	
}
