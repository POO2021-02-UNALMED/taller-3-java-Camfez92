package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
		
	}
	
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	
	public Marca getMarca() {
		return this.marca;
	}

	public void setControl(Control control) {
		this.control=control;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setVolumen(int volumen) {
		if (volumen<=7 & volumen>=0) {}
			this.volumen=volumen;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setCanal(int canal) {
		if (canal<=120 && canal>=0) {}
			this.canal=canal;
	}
	
	public int getCanal() {
		return this.canal;
}
	public void turnOn() {
		this.estado=true;
	}
	
	public void turnOff() {
		this.estado=false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if (this.estado==true) {
			if (this.canal<120){
				canal++;
			}
		}
	}
	
	public void canalDown() {
		if (this.estado==true) {
			if (this.canal>0){
				canal--;
			}
		}
	}
	
	public void volumenUp() {
		if (this.estado==true) {
			if (this.volumen<7){
				volumen++;
			}
		}
	}
	
	public void volumenDown() {
		if (this.estado==true) {
			if (this.volumen>0){
				volumen--;
			}
		}
	}
	
	public static void setNumTV(int numTV) {
		
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	
}
