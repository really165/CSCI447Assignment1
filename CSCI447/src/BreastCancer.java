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
}

