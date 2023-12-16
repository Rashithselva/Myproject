package Myproject;

public class Bus {
    private int bno;
	private boolean ac;
	private int cap;
	
	Bus(int bno,boolean ac,int cap){
		this.bno=bno;
		this.ac=ac;
		this.cap=cap;
	}
		
		public int getbno(){
			return bno;
		}
		public boolean getac(){
			return ac; 
		}
		public void setac(boolean ac) {
			this.ac=ac;
		}
		public int getCap() {
			return cap;
		}
		public void setCap(int cap) {
			this.cap=cap;
		}
		public void displaybusinfo() {
			System.out.println("Busno :"+bno+" Ac :"+ac+" Capacity :"+cap);
		}

    
}
