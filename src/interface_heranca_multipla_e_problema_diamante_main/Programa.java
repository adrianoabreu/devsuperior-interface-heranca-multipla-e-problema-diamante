package interface_heranca_multipla_e_problema_diamante_main;

import interface_heranca_multipla_e_problema_diamante_dispositivos.DispositivoCombo;
import interface_heranca_multipla_e_problema_diamante_dispositivos.ImpressoraConcreta;
import interface_heranca_multipla_e_problema_diamante_dispositivos.ScannerConcreto;

public class Programa {

	public static void main(String[] args) {
		
		ImpressoraConcreta p = new ImpressoraConcreta("1080");
		p.processarDocumento("Minha Carta");
		p.imprimir("Minha Carta");

		System.out.println();
		ScannerConcreto s = new ScannerConcreto("2003");
		s.processarDocumento("Meu Email");
		System.out.println("Resultado do Scanner: " + s.scannear());
		
		System.out.println();
		DispositivoCombo c = new DispositivoCombo("2081");
		c.processarDocumento("Minha Dissertação");
		c.imprimir("Minha Dissertação");
		System.out.println("Resultado do Scanner: " + c.scannear());
		
	}

}
