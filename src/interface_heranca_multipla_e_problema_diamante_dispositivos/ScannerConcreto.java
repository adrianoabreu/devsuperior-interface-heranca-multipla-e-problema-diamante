package interface_heranca_multipla_e_problema_diamante_dispositivos;

public class ScannerConcreto extends DispositivoAbstrato implements Scanner{

	public ScannerConcreto(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public String scannear() {
		return "Conteudo do Scanner";		
	}

	@Override
	public void processarDocumento(String doc) {
		System.out.println("Processando Scanner: " + doc);
		
	}
	
}
