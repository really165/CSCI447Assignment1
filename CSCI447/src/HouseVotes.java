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
	
	HouseVotes(String cn, String hi, String wpcs, String aotbr, String pff, String esa, String rgis, String astb, String atnc, String mm, String i, String scc, String es, String srts, String c, String dfe, String eaasa){
		this.className = cn;
		this.handicappedInfants = hi;
		this.waterProjectCostSharing = wpcs;
		this.adoptionOfTheBudgetResolution = aotbr;
		this.physicianFeeFreeze = pff;
		this.elSalvadorAid = esa;
		this.religiousGroupsInSchools = rgis;
		this.antiSatelliteTestBan = astb;
		this.aidToNicaraguanContras = atnc;
		this.mxMissile = mm;
		this.immigration = i;
		this.synfuelsCorporationCutback = scc;
		this.educationSpending = es;
		this.superfundRightToSue = srts;
		this.crime = c;
		this.dutyFreeExports = dfe;
		this.exportAdministrationActSouthAfrica = eaasa;
	}
	
	public void printHouseVotes(){
    	System.out.println("Class name: " + this.className + ", Handicapped infants: " + this.handicappedInfants + ", Water project cost sharing: " + this.waterProjectCostSharing + ", Adoption of the budget resolution: " + this.adoptionOfTheBudgetResolution + ", Physician fee freeze: " + this.physicianFeeFreeze + ", El salvador aid: " + this.elSalvadorAid + ", Religious groups in schools: " + this.religiousGroupsInSchools + ", Anti satellite test ban: " + this.antiSatelliteTestBan + ", Aid to nicaraguan contras: " + this.aidToNicaraguanContras + ", Mx missile: " + this.mxMissile + ", Immigration: " + this.immigration + ", Synfuels corporation cutback: " + this.synfuelsCorporationCutback + ", Education spending: " + this.educationSpending + ", Superfund right to sue: " + this.superfundRightToSue + ", Crime: " + this.crime + ", Duty free exports: " + this.dutyFreeExports + ", Export administration act south africa: " + this.exportAdministrationActSouthAfrica ); 
    }
}