package interface_heranca_multipla_e_problema_diamante_dispositivos;

public class DispositivoCombo extends DispositivoAbstrato implements Scanner, Impressora{

	public DispositivoCombo(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void imprimir(String doc) {
		System.out.println("Imprimindo Dispositivo Combo: " + doc);
		
	}

	@Override
	public String scannear() {
		return "Resultado do scanner do Dispositivo Combo ";
	}

	@Override
	public void processarDocumento(String doc) {
		System.out.println("Processando Dispositivo Combo: " + doc);
		
	}
	
	
}
