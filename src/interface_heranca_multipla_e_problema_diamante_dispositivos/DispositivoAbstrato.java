package interface_heranca_multipla_e_problema_diamante_dispositivos;

public abstract class DispositivoAbstrato {
	
	public String serialNumber;

	public DispositivoAbstrato(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public abstract void processarDocumento(String doc);
}
