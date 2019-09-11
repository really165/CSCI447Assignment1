package project1;

public class SoyBean {
	private int date;
	private int plantStand;
	private int precip;
	private int temp;
	private int hail;
	private int cropHist;
	private int areaDamage;
	private int severity;
	private int seedTmt;
	private int germination;
	private int plantGrowth;
	private int leaves;
	private int leafspotsHalo;
	private int leafspotsMarg;
	private int leafspotsSize;
	private int leafShread;
	private int leafMalf;
	private int leafMild;
	private int stem;
	private int lodging;
	private int stemCankers;
	private int cankerLesion;
	private int fruitingBodies;
	private int externalDecay;
	private int mycelium;
	private int intDiscolor;
	private int sclerotia;
	private int fruitPods;
	private int fruitSpots;
	private int seed;
	private int moldGrowth;
	private int seedDiscolor;
	private int seedSize;
	private int shriveling;
	private int roots;
	private String data;
	
	SoyBean(int date, int plantStand, int precip, int temp, int hail, int cropHist, int areaDamage, int severity, int seedTmt, int germination, 
			int plantGrowth, int leaves, int leafspotsHalo, int leafspotsMarg, int leafspotsSize, int leafShread, int leafMalf, int leafMild, 
			int stem, int lodging, int stemCankers, int cankerLesion, int fruitingBodies, int externalDecay, int mycelium, int intDiscolor, int sclerotia, 
			int fruitPods,int fruitSpots, int seed, int moldGrowth, int seedDiscolor, int seedSize, int shriveling, int roots, String data){
		this.date	=	date; 
		this.plantStand	=	plantStand;
		this.precip	=	precip;
		this.temp	=	temp;
		this.hail	=	hail;
		this.cropHist	=	cropHist;
		this.areaDamage	=	areaDamage;
		this.severity	=	severity;
		this.seedTmt	=	seedTmt;
		this.germination	=	germination; 
		this.plantGrowth	=	plantGrowth;
		this.leaves	=	leaves;
		this.leafspotsHalo	=	leafspotsHalo;
		this.leafspotsMarg	=	leafspotsMarg;
		this.leafspotsSize	=	leafspotsSize;
		this.leafShread	=	leafShread;
		this.leafMalf	=	leafMalf;
		this.leafMild	=	leafMild; 
		this.stem	=	stem;
		this.lodging	=	lodging;
		this.stemCankers	=	stemCankers;
		this.cankerLesion	=	cankerLesion;
		this.fruitingBodies	=	fruitingBodies;
		this.externalDecay	=	externalDecay;
		this.mycelium	=	mycelium;
		this.intDiscolor	=	intDiscolor;
		this.sclerotia	=	sclerotia; 
		this.fruitPods	=	fruitPods;
		this.fruitSpots 	=	fruitSpots;
		this.seed	=	seed;
		this.moldGrowth	=	moldGrowth;
		this.seedDiscolor	=	seedDiscolor;
		this.seedSize	=	seedSize;
		this.shriveling	=	shriveling;
		this.roots	=	roots;
		this.data	=	data;
	}
	
	public void printSoyBean(){
    	System.out.println("Date: "	+	this.date	+	", Plant Stand: "	+	this.plantStand	+	", Precip: "	+	this.precip	+	", Temp: "	+	this.temp +
		", Hail: "	+	this.hail	+	", Crop Hist: "	+	this.cropHist	+	", Area Damage: "	+	this.areaDamage	+	", Severity: "	+	this.severity	+
		", Seed TMT: "	+	this.seedTmt	+	", Germination: "	+	this.germination	+	", Plant Growth: "	+	this.plantGrowth	+	", Leaves: "	+	this.leaves	+
		", Leaf Spots Halo: "	+	this.leafspotsHalo	+	", Leaf Spots Marg: "	+	this.leafspotsMarg	+	", Leaf Spots Size: "	+	this.leafspotsSize	+
		", Leaf Shread: "	+	this.leafShread	+	", Leaf Malf: "	+	this.leafMalf	+	", Leaf Mild: "	+	this.leafMild	+	", Stem: "	+	this.stem	+
		", Lodging: "	+	this.lodging	+	", Stem Cankers: "	+	this.stemCankers	+	", Canker Lesion: "	+	this.cankerLesion	+
		", Fruiting Bodies: "	+	this.fruitingBodies	+	", External Decay: "	+	this.externalDecay	+	", Mycelium: "	+	this.mycelium	+
		", Int Discolor: "	+	this.intDiscolor	+	", Sclerotia: "	+	this.sclerotia	+	", Fruit Pods: "	+	this.fruitPods	+
		", Fruit Spots: "	+	this.fruitSpots	+	", Seed: "	+	this.seed	+	", Mold Growth: "	+	this.moldGrowth	+	", Seed Discolor: "	+	this.seedDiscolor	+
		", Seed Size: "	+	this.seedSize	+	", Shriveling: "	+	this.shriveling	+	", Roots: "	+	this.roots	+	", Data: "	+	this.data); 
    }
	
	public int getColumn(int column) {
    	switch(column) {
    	case 0: return this.date;
    	case 1: return this.plantStand;
    	case 2: return this.precip; 
    	case 3: return this.temp;
    	case 4:	return this.hail; 
    	case 5: return this.cropHist; 
    	case 6: return this.areaDamage; 
    	case 7: return this.severity; 
    	case 8: return this.seedTmt; 
    	case 9: return this.germination; 
    	case 10: return this.plantGrowth;
    	case 11: return this.leaves;
    	case 12: return this.leafspotsHalo;
    	case 13: return this.leafspotsMarg; 
    	case 14: return this.leafspotsSize;
    	case 15: return this.leafShread; 
    	case 16: return this.leafMalf; 
    	case 17: return this.leafMild; 
    	case 18: return this.stem; 
    	case 19: return this.lodging; 
    	case 20: return this.stemCankers; 
    	case 21: return this.cankerLesion;
    	case 22: return this.fruitingBodies;
    	case 23: return this.externalDecay;
    	case 24: return this.mycelium; 
    	case 25: return this.intDiscolor;
    	case 26:	return this.sclerotia; 
    	case 27: return this.fruitPods; 
    	case 28: return this.fruitSpots; 
    	case 29: return this.seed; 
    	case 30: return this.moldGrowth; 
    	case 31: return this.seedDiscolor; 
    	case 32: return this.seedSize;
    	case 33: return this.shriveling;
    	case 34: return this.roots;
    	case 35:
    		if(this.data.equals("D1")) {
    			return 1;
    		}
    		else if(this.data.equals("D2")) {
    			return 2;
    		}
    		else if(this.data.equals("D3")) {
    			return 3;
    		}
    		else {
    			return 4;
    		}
    	}
    	return 1000;
    }
}
