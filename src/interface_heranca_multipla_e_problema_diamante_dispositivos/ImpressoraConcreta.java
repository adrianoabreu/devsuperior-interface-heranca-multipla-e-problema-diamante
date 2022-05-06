package interface_heranca_multipla_e_problema_diamante_dispositivos;

public class ImpressoraConcreta extends DispositivoAbstrato implements Impressora{

	public ImpressoraConcreta(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void imprimir(String doc) {
		System.out.println("Imprimindo: " + doc);
	}

	@Override
	public void processarDocumento(String doc) {
		System.out.println("Processando Impressora: " + doc);
	}
	
	
	
}
