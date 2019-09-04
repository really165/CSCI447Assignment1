package project1;

public class HouseVotes {
	private String className;
	private String handicappedInfants;
	private String waterProjectCostSharing;
	private String adoptionOfTheBudgetResolution;
	private String physicianFeeFreeze;
	private String elSalvadorAid;
	private String religiousGroupsInSchools;
	private String antiSatelliteTestBan;
	private String aidToNicaraguanContras;
	private String mxMissile;
	private String immigration;
	private String synfuelsCorporationCutback;
	private String educationSpending;
	private String superfundRightToSue;
	private String crime;
	private String dutyFreeExports;
	private String exportAdministrationActSouthAfrica;
	
	String[] dataArray = new String[17];
	
	HouseVotes(String cn, String hi, String wpcs, String aotbr, String pff, String esa, String rgis, String astb, String atnc, String mm, String i, String scc, String es, String srts, String c, String dfe, String eaasa){
		this.className = dataArray[0] = cn;
		this.handicappedInfants = dataArray[1] = hi;
		this.waterProjectCostSharing = dataArray[2] = wpcs;
		this.adoptionOfTheBudgetResolution = dataArray[3] = aotbr;
		this.physicianFeeFreeze = dataArray[4] = pff;
		this.elSalvadorAid = dataArray[5] = esa;
		this.religiousGroupsInSchools = dataArray[6] = rgis;
		this.antiSatelliteTestBan = dataArray[7] = astb;
		this.aidToNicaraguanContras = dataArray[8] = atnc;
		this.mxMissile = dataArray[9] = mm;
		this.immigration = dataArray[10] = i;
		this.synfuelsCorporationCutback = dataArray[11] = scc;
		this.educationSpending = dataArray[12] = es;
		this.superfundRightToSue = dataArray[13] = srts;
		this.crime = dataArray[14] = c;
		this.dutyFreeExports = dataArray[15] = dfe;
		this.exportAdministrationActSouthAfrica = dataArray[16] = eaasa;
	}
	
	public void printHouseVotes(){
    	System.out.println("Class name: " + this.className + ", Handicapped infants: " + this.handicappedInfants + ", Water project cost sharing: " + this.waterProjectCostSharing + ", Adoption of the budget resolution: " + this.adoptionOfTheBudgetResolution + ", Physician fee freeze: " + this.physicianFeeFreeze + ", El salvador aid: " + this.elSalvadorAid + ", Religious groups in schools: " + this.religiousGroupsInSchools + ", Anti satellite test ban: " + this.antiSatelliteTestBan + ", Aid to nicaraguan contras: " + this.aidToNicaraguanContras + ", Mx missile: " + this.mxMissile + ", Immigration: " + this.immigration + ", Synfuels corporation cutback: " + this.synfuelsCorporationCutback + ", Education spending: " + this.educationSpending + ", Superfund right to sue: " + this.superfundRightToSue + ", Crime: " + this.crime + ", Duty free exports: " + this.dutyFreeExports + ", Export administration act south africa: " + this.exportAdministrationActSouthAfrica ); 
    }
	
	//updates value at given index
	public void changeValueAtIndex(int index, String value) {
		switch(index){
		case 0:
			this.className = value;
			dataArray[0] = value;
			break;
		case 1:
			this.handicappedInfants = value;
			this.dataArray[1] = value;
			break;
		case 2:
			this.waterProjectCostSharing = value;
			this.dataArray[2] = value;
			break;
		case 3:
			this.adoptionOfTheBudgetResolution = value;
			this.dataArray[3] = value;
			break;
		case 4:
			this.physicianFeeFreeze = value;
			this.dataArray[4] = value;
			break;
		case 5:
			this.elSalvadorAid = value;
			this.dataArray[5] = value;
			break;
		case 6:
			this.religiousGroupsInSchools = value;
			this.dataArray[6] = value;
			break;
		case 7:
			this.antiSatelliteTestBan = value;
			this.dataArray[7] = value;
			break;
		case 8:
			this.aidToNicaraguanContras = value;
			this.dataArray[8] = value;
			break;
		case 9:
			this.mxMissile = value;
			this.dataArray[9] = value;
			break;
		case 10:
			this.immigration = value;
			this.dataArray[10] = value;
			break;
		case 11:
			this.synfuelsCorporationCutback = value;
			this.dataArray[11] = value;
			break;
		case 12:
			this.educationSpending = value;
			this.dataArray[12] = value;
			break;
		case 13:
			this.superfundRightToSue = value;
			this.dataArray[13] = value;
			break;
		case 14:
			this.crime = value;
			this.dataArray[14] = value;
			break;
		case 15:
			this.dutyFreeExports = value;
			this.dataArray[15] = value;
			break;
		case 16:
			this.exportAdministrationActSouthAfrica = value;
			this.dataArray[16] = value;
			break;
		default:
			break;
		}
	}
}
