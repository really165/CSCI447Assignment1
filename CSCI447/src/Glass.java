public class Glass {
	private int ID;
	private float ri;
	private float na;
	private float mg;
	private float al;
	private float si;
	private float k;
	private float ca;
	private float ba;
	private float fe;
	private int type;
    
    Glass(int IDnumber, float refractiveIndex, float sodium, float magnesium, float aluminum, float silicon, float potassium, float calcium, float barium, float iron, int typeOfGlass){
    	this.ID = IDnumber;
    	this.ri = refractiveIndex;
    	this.na = sodium;
    	this.mg = magnesium;
    	this.al = aluminum;
    	this.si = silicon;
    	this.k = potassium;
    	this.ca = calcium;
    	this.ba = barium;
    	this.fe = iron;
    	this.type = typeOfGlass;
    }
    
    public void printGlass(){
    	System.out.println("ID number: " + this.ID + ", Refractive Index: " + this.ri + ", Sodium: " + this.na + ", Magnesium: " + this.mg + ", Aluminum: " + this.al + ", Silicon: " + this.si + ", Potassium: " + this.k + ", Calcium: " + this.ca + ", Barium: " + this.ba + ", Iron: " + this.fe + ", Type of glass: " + this.type); 
    }
}
