package project1;

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
	float[] dataArray = new float[11];
	
    Glass(int IDnumber, float refractiveIndex, float sodium, float magnesium, float aluminum, float silicon, float potassium, float calcium, float barium, float iron, int typeOfGlass){
    	this.ID = IDnumber;
    	dataArray[0] = (float) IDnumber;	
    	this.ri = dataArray[1] = refractiveIndex;
    	this.na = dataArray[2] = sodium;
    	this.mg = dataArray[3] = magnesium;
    	this.al = dataArray[4] = aluminum;
    	this.si = dataArray[5] = silicon;
    	this.k = dataArray[6] = potassium;
    	this.ca = dataArray[7] = calcium;
    	this.ba = dataArray[8] = barium;
    	this.fe = dataArray[9] = iron;
    	this.type = typeOfGlass;
    	dataArray[10] = (float) typeOfGlass;
    }
    
    public void printGlass(){
    	System.out.println("ID number: " + this.ID + ", Refractive Index: " + this.ri + ", Sodium: " + this.na + ", Magnesium: " + this.mg + ", Aluminum: " + this.al + ", Silicon: " + this.si + ", Potassium: " + this.k + ", Calcium: " + this.ca + ", Barium: " + this.ba + ", Iron: " + this.fe + ", Type of glass: " + this.type); 
    }
    
    public void setGroup(int index, int value) {
    	switch(index){
		case 0:
			this.ID = value;
			this.dataArray[0] = value;
			break;
		case 1:
			this.ri = value;
			this.dataArray[1] = value;
			break;
		case 2:
			this.na = value;
			this.dataArray[2] = value;
			break;
		case 3:
			this.mg = value;
			this.dataArray[3] = value;
			break;
		case 4:
			this.al = value;
			this.dataArray[4] = value;
			break;
		case 5:
			this.si = value;
			this.dataArray[5] = value;
			break;
		case 6:
			this.k = value;
			this.dataArray[6] = value;
			break;
		case 7:
			this.ca = value;
			this.dataArray[7] = value;
			break;
		case 8:
			this.ba = value;
			this.dataArray[8] = value;
			break;
		case 9:
			this.fe = value;
			this.dataArray[9] = value;
			break;
		case 10:
			this.type = value;
			this.dataArray[10] = value;
			break;
		default:
			break;
		}
    }
    
    public int getColumn(int column) {
    	switch(column) {
    	case 0: return this.ID;
    	case 1: return (int) this.ri;
    	case 2: return (int) this.na; 
    	case 3: return (int) this.mg;
    	case 4:	return (int) this.al; 
    	case 5: return (int) this.si; 
    	case 6: return (int) this.k; 
    	case 7: return (int) this.ca; 
    	case 8: return (int) this.ba; 
    	case 9: return (int) this.fe; 
    	case 10: return this.type;
    	}
    	return 1000;
    }
}
