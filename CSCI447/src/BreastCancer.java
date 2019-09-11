package project1;

public class BreastCancer {
	private int ID;
	private int clumpThickness;
	private int uniformityCellSize;
	private int uniformityCellShape;
	private int marginalAdhesion;
	private int singleEpithelialCellSize;
	private int bareNuclei;
	private int blandChromatin;
	private int normalNucleoli;
	private int mitoses;
	private int type;
    
    BreastCancer(int IDnumber, int ct, int ucSize, int ucShape, int mA, int secs, int bn, int bc, int nc, int m, int type){
    	this.ID = IDnumber;
    	this.clumpThickness = ct;
    	this.uniformityCellSize = ucSize;
    	this.uniformityCellShape = ucShape;
    	this.marginalAdhesion = mA;
    	this.singleEpithelialCellSize = secs;
    	this.bareNuclei = bn;
    	this.blandChromatin = bc;
    	this.normalNucleoli = nc;
    	this.mitoses = m;
    	this.type = type;
    }
    
    public void printBreastCancer(){
    	System.out.println("ID number: " + this.ID + ", Clump Thickness: " + this.clumpThickness + ", Uniformity Cell Size: " + this.uniformityCellSize + 
    			", Uniformity Cell Shape: " + this.uniformityCellShape + ", Marginal Adhesion: " + this.marginalAdhesion + 
    			", Single Epithelial Cell Size: " + this.singleEpithelialCellSize + ", Bare Nuclei: " + this.bareNuclei + 
    			", Bland Chromatin: " + this.blandChromatin + ", Normal Nucleoli: " + this.normalNucleoli + ", Mitoses: " + this.mitoses + ", Type: " + this.type); 
    }
    
    public int getColumn(int column) {
    	switch(column) {
    	case 0: return this.ID;
    	case 1: return this.clumpThickness;
    	case 2: return this.uniformityCellSize; 
    	case 3: return this.uniformityCellShape;
    	case 4:	return this.marginalAdhesion; 
    	case 5: return this.singleEpithelialCellSize; 
    	case 6: return this.bareNuclei; 
    	case 7: return this.blandChromatin; 
    	case 8: return this.normalNucleoli; 
    	case 9: return this.mitoses; 
    	case 10: return this.type; 
    	}
    	return 1000;
    }
    public void setColumn(int column, int value) {
    	switch(column) {
    	case 0: this.ID=value;
    	case 1: this.clumpThickness=value;
    	case 2: this.uniformityCellSize=value; 
    	case 3: this.uniformityCellShape=value;
    	case 4:	this.marginalAdhesion=value; 
    	case 5: this.singleEpithelialCellSize=value; 
    	case 6: this.bareNuclei=value; 
    	case 7: this.blandChromatin=value; 
    	case 8: this.normalNucleoli=value; 
    	case 9: this.mitoses=value; 
    	case 10: this.type=value; 
    	}
    }
}

