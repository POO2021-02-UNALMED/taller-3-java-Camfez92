package taller3.televisores;

public class Control {
	TV tv;
	
	public void turnOn() {
		this.tv.estado=true;
	}
	
	public void turnOff() {
		this.tv.estado=false;
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDown() {
		this.tv.volumenDown();
	}
	public void setCanal(int canal) {
		if (1<=canal & canal<=120) {
			this.tv.canal=canal;
		}
	}
	
	public void enlazar(TV tv) {
		this.tv=tv;
		this.tv.control=this;
	}
	
	public void setTv(TV tv) {
		this.tv=tv;
	}
	
	public TV getTv() {
		return this.tv;
	}
}
