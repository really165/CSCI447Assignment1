package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class main {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file1 = new File("./glass.data");
		Scanner scanner1 = new Scanner(file1);
		ArrayList<Glass> glassData = new ArrayList<Glass>();
		while (scanner1.hasNextLine()){
			String line = scanner1.nextLine();
			String[] values = line.split(",");
			Glass newObservation = new Glass(Integer.parseInt(values[0]), Float.parseFloat(values[1]), Float.parseFloat(values[2]), Float.parseFloat(values[3]), Float.parseFloat(values[4]), Float.parseFloat(values[5]), Float.parseFloat(values[6]), Float.parseFloat(values[7]), Float.parseFloat(values[8]), Float.parseFloat(values[9]), Integer.parseInt(values[10]));
			glassData.add(newObservation);
			//newObservation.printGlass();
		}
		for(int i=1; i<10; i++) {
			continuous(i, glassData);
		}
		for(int k = 0; k < glassData.size(); k++) {
			//glassData.get(k).printGlass();
		}
		//int[] values1= {4,4,6,5,4,5,3,1,7};
		//glass(glassData, values1);
		
		File file2 = new File("./iris.data");
		Scanner scanner2 = new Scanner(file2);
		ArrayList<Iris> irisData = new ArrayList<Iris>();
		while (scanner2.hasNextLine()){
			String line = scanner2.nextLine();
			String[] values = line.split(",");
			Iris newObservation = new Iris(Float.parseFloat(values[0]), Float.parseFloat(values[1]), Float.parseFloat(values[2]), Float.parseFloat(values[3]), values[4]);
			irisData.add(newObservation);
			//newObservation.printIris();
		}
		for(int i=0; i<4; i++) {
			continuousIris(i, irisData);
		}
		for(int k = 0; k < irisData.size(); k++) {
			//irisData.get(k).printIris();
		}
		int[] values1= {4,1,7,7};
		iris(irisData, values1);
		
		File file3 = new File("./house-votes-84.data");
		Scanner scanner3 = new Scanner(file3);
		ArrayList<HouseVotes> houseVotesData = new ArrayList<HouseVotes>();
		while (scanner3.hasNextLine()){
			String line = scanner3.nextLine();
			String[] values = line.split(",");
			HouseVotes newObservation = new HouseVotes(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11], values[12], values[13], values[14], values[15], values[16]);
			houseVotesData.add(newObservation);
			//newObservation.printHouseVotes();
		}
		int numberOfColumns = 17;
		//for each column
		for(int i = 0; i < numberOfColumns; i++){
			//get the most frequent value for that column
			String mostFrequentValue = houseVotesMFV(i, houseVotesData);
			//go down the column
			for(int j = 0; j < houseVotesData.size(); j++) {
				//if a value in that column is unkown
				if(houseVotesData.get(j).dataArray[i].equals("?")) {
					//replace that value with the most frequent value in that column
					houseVotesData.get(j).changeValueAtIndex(i, mostFrequentValue);
				}
			}
		}
		//print out final data
		for(int k = 0; k < houseVotesData.size(); k++) {
			//houseVotesData.get(k).printHouseVotes();
		}
		//print out probability
		//System.out.println("democrat probability = " + houseVotesPartyProbability(houseVotesData, "democrat"));
		//System.out.println("republican probability = " + houseVotesPartyProbability(houseVotesData, "republican"));
		//print out vote probability
		//System.out.println("vote 1 yes probability = " + houseVotesVoteProbability(houseVotesData, 1, "y"));
		//System.out.println("vote 1 no probability = " + houseVotesVoteProbability(houseVotesData, 1, "n"));
		//print out vote probability given party
		//System.out.println("vote 1 yes democrat probability = " + houseVotesVoteProbability(houseVotesData, 1, "y", "democrat"));
		//System.out.println("vote 1 no democrat probability = " + houseVotesVoteProbability(houseVotesData, 1, "n", "democrat"));
		//System.out.println("vote 1 yes republican probability = " + houseVotesVoteProbability(houseVotesData, 1, "y", "republican"));
		//System.out.println("vote 1 no republican probability = " + houseVotesVoteProbability(houseVotesData, 1, "n", "republican"));
		//String[] testVotes = {"y","y","y","n","n","n","y","y","y","n","y","n","n","n","y","y"};
		//String party = partyGivenVotes(houseVotesData, testVotes);
		//ArrayList<HouseVotes> shuffledList = houseVotesShuffle(houseVotesData, 1);
		//party = partyGivenVotes(shuffledList, testVotes);
		
		File file4 = new File("./soybean-small.data");
		Scanner scanner4 = new Scanner(file4);
		ArrayList<SoyBean> soyBeanData = new ArrayList<SoyBean>();
		while (scanner4.hasNextLine()){
			String line = scanner4.nextLine();
			String[] values = line.split(",");
			SoyBean newObservation = new SoyBean(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4]),
					Integer.parseInt(values[5]), Integer.parseInt(values[6]), Integer.parseInt(values[7]), Integer.parseInt(values[8]), Integer.parseInt(values[9]), Integer.parseInt(values[10]), 
					Integer.parseInt(values[11]), Integer.parseInt(values[12]), Integer.parseInt(values[13]), Integer.parseInt(values[14]), Integer.parseInt(values[15]), Integer.parseInt(values[16]), 
					Integer.parseInt(values[17]), Integer.parseInt(values[18]), Integer.parseInt(values[19]), Integer.parseInt(values[20]), Integer.parseInt(values[21]), Integer.parseInt(values[22]), 
					Integer.parseInt(values[23]), Integer.parseInt(values[24]), Integer.parseInt(values[25]), Integer.parseInt(values[26]), Integer.parseInt(values[27]), Integer.parseInt(values[28]), 
					Integer.parseInt(values[29]), Integer.parseInt(values[30]), Integer.parseInt(values[31]), Integer.parseInt(values[32]), Integer.parseInt(values[33]), Integer.parseInt(values[34]), values[35]);
			soyBeanData.add(newObservation);
			//newObservation.printSoyBean();
		}
		
		//int[] values1= {0,1,2,1,0,3,1,1,0,2,1,1,0,2,2,0,0,0,1,0,1,2,0,0,0,0,0,3,4,0,0,0,0,0,1};
		//soyBean(soyBeanData, values1);
		
		File file5 = new File("./breast-cancer-wisconsin.data");
		Scanner scanner5 = new Scanner(file5);
		ArrayList<BreastCancer> breastCancerData = new ArrayList<BreastCancer>();
		while (scanner5.hasNextLine()){
			String line = scanner5.nextLine();
			String[] values = line.split(",");
			if(!hasMissingValue(values)){
				BreastCancer newObservation = new BreastCancer(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]), Integer.parseInt(values[7]), Integer.parseInt(values[8]), Integer.parseInt(values[9]), Integer.parseInt(values[10]));
				breastCancerData.add(newObservation);
				//newObservation.printBreastCancer();
			}
	    }
		int[] values= {5, 1, 1, 7, 1, 1, 9, 4, 10};
		//breastCancer(breastCancerData, values);
	}

/////////////////////////////////////////////Pre processing/////////////////////////////////////////////////////////////////////////////////////////
	public static boolean hasMissingValue(String[] inputValues){
		for(int i = 0; i < inputValues.length; i++){
			if(inputValues[i].equals("?")) {
				return true;
			}
		}
		return false;
	}
	
	//Discretize the continuous variables for the glass data
	public static void continuous(int column, ArrayList<Glass> data){
		float m=10; //number of intervals
		float[] tempArray=new float[data.size()];
		int[] position=new int[data.size()];
		
		//Get min and max values of the data
		for(int i=0; i<data.size(); i++) {
			tempArray[i]=data.get(i).dataArray[column];
			position[i]=i;
		}
		
		float temp;
		int tempPosition;
		
		// Bubble Sort
		for (int i=0; i<data.size(); i++) {
			for (int j=1; j<data.size()-i; j++) {
				if(tempArray[j-1]>tempArray[j]) {
					temp=tempArray[j-1];
					tempArray[j-1]=tempArray[j];
					tempArray[j]=temp;
					tempPosition=position[j-1];
					position[j-1]=position[j];
					position[j]=position[j-1];
				}
			}
		}
		int count=0;
		int itemPerInterval=((data.size())/((int)m));
		
		for(int i=0; i<tempArray.length; i++) {
			for (int j=0; j<data.size(); j++) {
				if(i==(itemPerInterval*(count+1))) {
					count++;
				}
				if(data.get(j).dataArray[column]==tempArray[i]) {
					data.get(j).setGroup(column, count);
				}
			}
		}
		
	}
	
	//Discretize the continuous variables for the iris data
		public static void continuousIris(int column, ArrayList<Iris> data){
			float m=10; //number of intervals
			float[] tempArray=new float[data.size()];
			int[] position=new int[data.size()];
			
			//Get min and max values of the data
			for(int i=0; i<data.size(); i++) {
				tempArray[i]=data.get(i).dataArray[column];
				position[i]=i;
			}
			
			float temp;
			int tempPosition;
			
			// Bubble Sort
			for (int i=0; i<data.size(); i++) {
				for (int j=1; j<data.size()-i; j++) {
					if(tempArray[j-1]>tempArray[j]) {
						temp=tempArray[j-1];
						tempArray[j-1]=tempArray[j];
						tempArray[j]=temp;
						tempPosition=position[j-1];
						position[j-1]=position[j];
						position[j]=position[j-1];
					}
				}
			}
			int count=0;
			int itemPerInterval=((data.size())/((int)m));
			
			for(int i=0; i<tempArray.length; i++) {
				for (int j=0; j<data.size(); j++) {
					if(i==(itemPerInterval*(count+1))) {
						count++;
					}
					if(data.get(j).dataArray[column]==tempArray[i]) {
						data.get(j).setGroup(column, count);
					}
				}
			}
			
		}
		
	//find the most frequent value in a column of the House Votes data
	public static String houseVotesMFV(int column, ArrayList<HouseVotes> data){
		if(data.isEmpty()){
			return "?";
		}
		HouseVotes firstElement = data.get(0);
		int yesCount = 0, noCount = 0;
		for(int i = 0; i < data.size(); i++){
			if(data.get(i).dataArray[column].equals("y")) {
				yesCount++;
			}
			else if(data.get(i).dataArray[column].equals("n")) {
				noCount++;
			}
			else {
				//is an unknown value
			}
		}
		if(yesCount==0&&noCount==0) {
			return "?";
		}
		else if(yesCount>noCount) {
			return "y";
		}
		else {
			return "n";
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/////////////////////////////////////////Algorithm////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////Houses Votes//////////////////////////////////////////////////////////////////////////
	//takes in data set and party as argument, returns probability
	public static float houseVotesPartyProbability(ArrayList<HouseVotes> data, String party){
		//keep track of members in given party
		int partyCount = 0;
		//keep track of total members
		int totalCount = 0;
		
		for(int i = 0; i < data.size(); i++) {
			if(data.get(i).dataArray[0].equals(party)) {
				partyCount++;
				totalCount++;
			}
			else {
				totalCount++;
			}
		}
		return (float)partyCount/(float)totalCount;
	}
	
	//takes in data set, column, and vote, returns probability for that vote
	public static float houseVotesVoteProbability(ArrayList<HouseVotes> data, int column, String vote) {
		//keep track of number of votes with given outcome
		int voteCount = 0;
		//keep track of total votes
		int totalVotes = 0;
		
		for(int i = 0; i < data.size(); i++) {
			if(data.get(i).dataArray[column].equals(vote)) {
				voteCount++;
				totalVotes++;
			}
			else {
				totalVotes++;
			}
		}
		return (float)voteCount/(float)totalVotes;
	}
	
	//takes in data set, column, vote, and party, returns probability for vote given party
	public static float houseVotesVoteProbability(ArrayList<HouseVotes> data, int column, String vote, String party) {
		//keep track of number of votes with given outcome and given party
		int voteCount = 0;
		//keep track of number of votes with given party
		int totalVotes = 0;
		
		for(int i = 0; i < data.size(); i++) {
			//if vote from the right party
			if(data.get(i).dataArray[0].equals(party)) {
				//if vote is the given outcome
				if(data.get(i).dataArray[column].equals(vote)) {
					voteCount++;
					totalVotes++;
				}
				else {
					totalVotes++;
				}
			}
		}
		return (float)voteCount/(float)totalVotes;
	}
	
	public static String partyGivenVotes(ArrayList<HouseVotes> data, String[] votes) {
		//houseVotesPartyProbability(houseVotesData, "democrat");
		//houseVotesVoteProbability(houseVotesData, 1, "y");
		//houseVotesVoteProbability(houseVotesData, 1, "n", "republican");
		float numeratorDemocrat = 1;
		float denominatorDemocrat = 1;
		float numeratorRepublican = 1;
		float denominatorRepublican = 1;
		for(int i = 0; i < votes.length; i++) {
			numeratorDemocrat = numeratorDemocrat * houseVotesVoteProbability(data, i+1, votes[i], "democrat");
			denominatorDemocrat = denominatorDemocrat * houseVotesVoteProbability(data, i+1, votes[i]);
			numeratorRepublican = numeratorRepublican * houseVotesVoteProbability(data, i+1, votes[i], "republican");
			denominatorRepublican = denominatorRepublican * houseVotesVoteProbability(data, i+1, votes[i]);
		}
		numeratorDemocrat = numeratorDemocrat * houseVotesPartyProbability(data, "democrat");
		numeratorRepublican = numeratorRepublican * houseVotesPartyProbability(data, "republican");
		
		float probabilityDemocrat = numeratorDemocrat/denominatorDemocrat;
		//System.out.println("probabilityDemocrat = " + probabilityDemocrat);
		float probabilityRepublican = numeratorRepublican/denominatorRepublican;
		//System.out.println("probabilityRepublican = " + probabilityRepublican);
		
		if(probabilityDemocrat > probabilityRepublican) {
			//System.out.println("more likely to be democrat");
			return "democrat";
		}
		else if(probabilityRepublican > probabilityDemocrat) {
			//System.out.println("more likely to be republican");
			return "republican";
		}
		else {
			return "?";
		}
	}
	
	public static float houseVotesCrossValidation(ArrayList<HouseVotes> data) {
		//shuffle the dataset randomly
		Random randnum = new Random();
		ArrayList<HouseVotes> listCopy = (ArrayList<HouseVotes>) data.clone();
		ArrayList<HouseVotes> newList = new ArrayList<HouseVotes>();
		while(!listCopy.isEmpty()) {
			int index = randnum.nextInt(listCopy.size());
			newList.add(listCopy.get(index));
			listCopy.remove(index);
		}
		
		//split dataset into 10 groups
		int groupSize = newList.size()/10;
		ArrayList<ArrayList<HouseVotes>> groups = new ArrayList<ArrayList<HouseVotes>>();
		//make the first nine groups
		for(int i = 0; i < 9; i++) {
			ArrayList<HouseVotes> newGroup = new ArrayList<HouseVotes>();
			for(int j = 0; j < groupSize; j++) {
				newGroup.add(newList.get(0));
				newList.remove(0);
			}
			groups.add(newGroup);
		}
		//make the last group
		ArrayList<HouseVotes> lastGroup = new ArrayList<HouseVotes>();
		while(!newList.isEmpty()) {
			lastGroup.add(newList.get(0));
			newList.remove(0);
		}
		groups.add(lastGroup);
		
		//keep track of successes
		int correctGuesses = 0;
		int totalGuesses = 0;
		//for each group
		for(int k = 0; k < groups.size(); k++) {
			//select test data set
			ArrayList<HouseVotes> testGroup = groups.get(k);
			
			//construct training group
			ArrayList<HouseVotes> trainingGroup = new ArrayList<HouseVotes>();
			//for each of the partitions
			for(int m = 0; m < groups.size(); m++) {
				//skip test group
				if(m != k) {
					trainingGroup.addAll(groups.get(m));
				}
			}
			
			//go through the test data
			for(int n = 0; n < testGroup.size(); n++) {
				//get the data for that observation
				String testParty = testGroup.get(n).dataArray[0];
				String[] testVotes = new String[15];
				for(int p = 1; p < testGroup.get(n).dataArray.length-1; p++) {
					testVotes[p-1] = testGroup.get(n).dataArray[p];
				}
				String trainingParty = partyGivenVotes(trainingGroup, testVotes);
				if(trainingParty.equals(testParty)) {
					correctGuesses++;
					totalGuesses++;
				}
				else {
					totalGuesses++;
				}
			}
		}
		return (float)correctGuesses/(float)totalGuesses;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////breastCancer//////////////////////////////////////////////////////////////////////////////////////////////////
	public static void breastCancer(ArrayList<BreastCancer> data, int[] values) {
		int totalBenign=0;
		int totalMalignant=0;
		int totalValues=0;
		
		//For benigns 
		int[] BclumpThickness=new int[10];
		int[] Bucs=new int[10]; //Uniformity Cell Size
		int[] BucShape=new int[10]; //Uniformity Cell Shape
		int[] BmA=new int[10]; //Marginal Adhesion
		int[] Bscs=new int[10]; //Single Ephitelial Cell Size
		int[] Bbn=new int[10]; //Bare nuclei
		int[] Bbc=new int[10]; //Bland Chromatin
		int[] Bnc=new int[10]; //Normal Nuclei
		int[] Bm=new int[10]; //Mitoses
		
		//For Malignants
		int[] MclumpThickness=new int[10];
		int[] Mucs=new int[10]; //Uniformity Cell Size
		int[] MucShape=new int[10]; //Uniformity Cell Shape
		int[] MmA=new int[10]; //Marginal Adhesion
		int[] Mscs=new int[10]; //Single Ephitelial Cell Size
		int[] Mbn=new int[10]; //Bare nuclei
		int[] Mbc=new int[10]; //Bland Chromatin
		int[] Mnc=new int[10]; //Normal Nuclei
		int[] Mm=new int[10]; //Mitoses
		
		// Counter
		for(int i = 0; i < data.size(); i++) {// Rows
			for(int j=1; j<11; j++) {// Columns
				if (data.get(i).getColumn(10)==2) {
					switch(j) {
					case 1: BclumpThickness[data.get(i).getColumn(j)-1]++; break;
					case 2: Bucs[data.get(i).getColumn(j)-1]++; break;
					case 3: BucShape[data.get(i).getColumn(j)-1]++; break;
					case 4: BmA[data.get(i).getColumn(j)-1]++; break;
					case 5: Bscs[data.get(i).getColumn(j)-1]++; break;
					case 6: Bbn[data.get(i).getColumn(j)-1]++; break;
					case 7: Bbc[data.get(i).getColumn(j)-1]++; break;
					case 8: Bnc[data.get(i).getColumn(j)-1]++; break;
					case 9: Bm[data.get(i).getColumn(j)-1]++; break;
					case 10: totalBenign++; break;
					}
				}
				else if (data.get(i).getColumn(10)==4) {
					switch(j) {
					case 1: MclumpThickness[data.get(i).getColumn(j)-1]++; break;
					case 2: Mucs[data.get(i).getColumn(j)-1]++; break;
					case 3: MucShape[data.get(i).getColumn(j)-1]++; break;
					case 4: MmA[data.get(i).getColumn(j)-1]++; break;
					case 5: Mscs[data.get(i).getColumn(j)-1]++; break;
					case 6: Mbn[data.get(i).getColumn(j)-1]++; break;
					case 7: Mbc[data.get(i).getColumn(j)-1]++; break;
					case 8: Mnc[data.get(i).getColumn(j)-1]++; break;
					case 9: Mm[data.get(i).getColumn(j)-1]++; break;
					case 10: totalMalignant++; break;
					}
				}
				
			}
		}
		for(int i=0; i<10; i++) {
			//System.out.println(Bm[i]);
		}
		
		totalValues=totalBenign+totalMalignant;
	
		// Benign Probabilities
		float pBClumpThickness= (float) (BclumpThickness[values[0]-1])/totalBenign;
		float pBUcs=(float) (Bucs[values[1]-1])/totalBenign;
		float pBUcShape=(float) (BucShape[values[2]-1])/totalBenign;
		float pBMA=(float) (BmA[values[3]-1])/totalBenign;
		float pBScs=(float) (Bscs[values[4]-1])/totalBenign;
		float pBBn=(float) (Bbn[values[5]-1])/totalBenign;
		float pBBc=(float) (Bbc[values[6]-1])/totalBenign;
		float pBNc=(float) (Bnc[values[7]-1])/totalBenign;
		float pBM=(float) (Bm[values[8]-1])/totalBenign;
		
		// Malignant Probabilities
		float pMClumpThickness= (float) (MclumpThickness[values[0]-1])/totalMalignant;
		float pMUcs=(float) (Mucs[values[1]-1])/totalMalignant;
		float pMUcShape=(float) (MucShape[values[2]-1])/totalMalignant;
		float pMMA=(float) (MmA[values[3]-1])/totalMalignant;
		float pMScs=(float) (Mscs[values[4]-1])/totalMalignant;
		float pMBn=(float) (Mbn[values[5]-1])/totalMalignant;
		float pMBc=(float) (Mbc[values[6]-1])/totalMalignant;
		float pMNc=(float) (Mnc[values[7]-1])/totalMalignant;
		float pMM=(float) (Mm[values[8]-1])/totalMalignant;
		
		float benign=(float) totalBenign/totalValues;
		float malignant=(float) totalMalignant/totalValues;
		
		float pBenign= (float) pBClumpThickness * pBUcs * pBUcShape * pBMA * pBScs * pBBn * pBBc * pBNc * pBM * benign;
		float pMalignant= (float) pMClumpThickness * pMUcs * pMUcShape * pMMA * pMScs * pMBn * pMBc * pMNc * pMM * malignant;
		
		System.out.println(pBenign);
		System.out.println(pMalignant);
		if(pBenign>pMalignant) {
			System.out.println("Benign have a higher probability");
		}
		else if(pBenign<pMalignant) {
			System.out.println("Malignant have a higher probability");
		}
		else { //Same
			System.out.println("Benign and Malignant have the same probability");
		}
}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////Soy Bean//////////////////////////////////////////////////////////////
	public static void soyBean(ArrayList<SoyBean> data, int[] values) {
		int[] totals=new int[4]; //0 for 1, 1 for 2, 2 for 3, 3 for 4 
		
		//For D1 
		int[] date= new int[28]; //0-6 for 1, 7-13 for 2, 14-20 for 3, 21-27 for 4
		int[] plantStand= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4
		int[] precip= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;
		int[] temp= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;;
		int[] hail= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] cropHist= new int[16]; //0-3 for 1, 4-7 for 2, 8-11 for 3, 12-5 for 4;
		int[] areaDamage= new int[16]; //0-3 for 1, 4-7 for 2, 8-11 for 3, 12-5 for 4;
		int[] severity= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;
		int[] seedTmt= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;
		int[] germination= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;;
		int[] plantGrowth= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] leaves= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] leafspotsHalo= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;
		int[] leafspotsMarg= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;
		int[] leafspotsSize= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;
		int[] leafShread= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] leafMalf= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] leafMild= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;
		int[] stem= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] lodging= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[]stemCankers= new int[16]; //0-3 for 1, 4-7 for 2, 8-11 for 3, 12-5 for 4;
		int[] cankerLesion= new int[16]; //0-3 for 1, 4-7 for 2, 8-11 for 3, 12-5 for 4;
		int[] fruitingBodies= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] externalDecay= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;
		int[] mycelium= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] intDiscolor= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;
		int[] sclerotia= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] fruitPods= new int[16]; //0-3 for 1, 4-7 for 2, 8-11 for 3, 12-5 for 4;
		int[] fruitSpots= new int[20]; //0-4 for 1, 5-9 for 2, 10-14 for 3, 15-19 for 4;
		int[] seed= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] moldGrowth= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] seedDiscolor= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] seedSize= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] shriveling= new int[8]; //0-1 for 1, 2-3 for 2, 4-5 for 3, 6-7 for 4;
		int[] roots= new int[12]; //0-2 for 1, 3-5 for 2, 6-8 for 3, 9-11 for 4;

	
		// Counter
		for(int i = 0; i < data.size(); i++) {// Rows
			for(int j=0; j<36; j++) {// Columns
				if(data.get(i).getColumn(35)==1) {
					switch(j) {
			    	case 0: date[data.get(i).getColumn(j)]++; break;
			    	case 1: plantStand[data.get(i).getColumn(j)]++; break;
			    	case 2: precip[data.get(i).getColumn(j)]++;  break;
			    	case 3: temp[data.get(i).getColumn(j)]++; break;
			    	case 4:	hail[data.get(i).getColumn(j)]++;  break;
			    	case 5: cropHist[data.get(i).getColumn(j)]++;  break;
			    	case 6: areaDamage[data.get(i).getColumn(j)]++;  break;
			    	case 7: severity[data.get(i).getColumn(j)]++;  break;
			    	case 8: seedTmt[data.get(i).getColumn(j)]++;  break;
			    	case 9: germination[data.get(i).getColumn(j)]++;  break;
			    	case 10: plantGrowth[data.get(i).getColumn(j)]++; break;
			    	case 11: leaves[data.get(i).getColumn(j)]++; break;
			    	case 12: leafspotsHalo[data.get(i).getColumn(j)]++; break;
			    	case 13: leafspotsMarg[data.get(i).getColumn(j)]++;  break;
			    	case 14: leafspotsSize[data.get(i).getColumn(j)]++; break;
			    	case 15: leafShread[data.get(i).getColumn(j)]++;  break;
			    	case 16: leafMalf[data.get(i).getColumn(j)]++;  break;
			    	case 17: leafMild[data.get(i).getColumn(j)]++;  break;
			    	case 18: stem[data.get(i).getColumn(j)]++;  break;
			    	case 19: lodging[data.get(i).getColumn(j)]++;  break;
			    	case 20: stemCankers[data.get(i).getColumn(j)]++;  break;
			    	case 21: cankerLesion[data.get(i).getColumn(j)]++; break;
			    	case 22: fruitingBodies[data.get(i).getColumn(j)]++; break;
			    	case 23: externalDecay[data.get(i).getColumn(j)]++; break;
			    	case 24: mycelium[data.get(i).getColumn(j)]++;  break;
			    	case 25: intDiscolor[data.get(i).getColumn(j)]++; break;
			    	case 26: sclerotia[data.get(i).getColumn(j)]++;  break;
			    	case 27: fruitPods[data.get(i).getColumn(j)]++;  break;
			    	case 28: fruitSpots[data.get(i).getColumn(j)]++;  break;
			    	case 29: seed[data.get(i).getColumn(j)]++;  break;
			    	case 30: moldGrowth[data.get(i).getColumn(j)]++;  break;
			    	case 31: seedDiscolor[data.get(i).getColumn(j)]++;  break;
			    	case 32: seedSize[data.get(i).getColumn(j)]++; break;
			    	case 33: shriveling[data.get(i).getColumn(j)]++; break;
			    	case 34: roots[data.get(i).getColumn(j)]++; break;
			    	case 35: totals[0]++; break;
			    	}
				}
				else if(data.get(i).getColumn(35)==2) {
					switch(j) {
			    	case 0: date[7+data.get(i).getColumn(j)]++; break;
			    	case 1: plantStand[2+data.get(i).getColumn(j)]++; break;
			    	case 2: precip[3+data.get(i).getColumn(j)]++;  break;
			    	case 3: temp[3+data.get(i).getColumn(j)]++; break;
			    	case 4:	hail[2+data.get(i).getColumn(j)]++;  break;
			    	case 5: cropHist[4+data.get(i).getColumn(j)]++;  break;
			    	case 6: areaDamage[4+data.get(i).getColumn(j)]++;  break;
			    	case 7: severity[3+data.get(i).getColumn(j)]++;  break;
			    	case 8: seedTmt[3+data.get(i).getColumn(j)]++;  break;
			    	case 9: germination[3+data.get(i).getColumn(j)]++;  break;
			    	case 10: plantGrowth[2+data.get(i).getColumn(j)]++; break;
			    	case 11: leaves[2+data.get(i).getColumn(j)]++; break;
			    	case 12: leafspotsHalo[3+data.get(i).getColumn(j)]++; break;
			    	case 13: leafspotsMarg[3+data.get(i).getColumn(j)]++;  break;
			    	case 14: leafspotsSize[3+data.get(i).getColumn(j)]++; break;
			    	case 15: leafShread[2+data.get(i).getColumn(j)]++;  break;
			    	case 16: leafMalf[2+data.get(i).getColumn(j)]++;  break;
			    	case 17: leafMild[3+data.get(i).getColumn(j)]++;  break;
			    	case 18: stem[2+data.get(i).getColumn(j)]++;  break;
			    	case 19: lodging[2+data.get(i).getColumn(j)]++;  break;
			    	case 20: stemCankers[4+data.get(i).getColumn(j)]++;  break;
			    	case 21: cankerLesion[4+data.get(i).getColumn(j)]++; break;
			    	case 22: fruitingBodies[2+data.get(i).getColumn(j)]++; break;
			    	case 23: externalDecay[3+data.get(i).getColumn(j)]++; break;
			    	case 24: mycelium[2+data.get(i).getColumn(j)]++;  break;
			    	case 25: intDiscolor[3+data.get(i).getColumn(j)]++; break;
			    	case 26: sclerotia[2+data.get(i).getColumn(j)]++;  break;
			    	case 27: fruitPods[4+data.get(i).getColumn(j)]++;  break;
			    	case 28: fruitSpots[5+data.get(i).getColumn(j)]++;  break;
			    	case 29: seed[2+data.get(i).getColumn(j)]++;  break;
			    	case 30: moldGrowth[2+data.get(i).getColumn(j)]++;  break;
			    	case 31: seedDiscolor[2+data.get(i).getColumn(j)]++;  break;
			    	case 32: seedSize[2+data.get(i).getColumn(j)]++; break;
			    	case 33: shriveling[2+data.get(i).getColumn(j)]++; break;
			    	case 34: roots[3+data.get(i).getColumn(j)]++; break;
			    	case 35: totals[1]++; break;
			    	}
				}
				else if(data.get(i).getColumn(35)==3) {
					switch(j) {
			    	case 0: date[14+data.get(i).getColumn(j)]++; break;
			    	case 1: plantStand[4+data.get(i).getColumn(j)]++; break;
			    	case 2: precip[6+data.get(i).getColumn(j)]++;  break;
			    	case 3: temp[6+data.get(i).getColumn(j)]++; break;
			    	case 4:	hail[4+data.get(i).getColumn(j)]++;  break;
			    	case 5: cropHist[8+data.get(i).getColumn(j)]++;  break;
			    	case 6: areaDamage[8+data.get(i).getColumn(j)]++;  break;
			    	case 7: severity[6+data.get(i).getColumn(j)]++;  break;
			    	case 8: seedTmt[6+data.get(i).getColumn(j)]++;  break;
			    	case 9: germination[6+data.get(i).getColumn(j)]++;  break;
			    	case 10: plantGrowth[4+data.get(i).getColumn(j)]++; break;
			    	case 11: leaves[4+data.get(i).getColumn(j)]++; break;
			    	case 12: leafspotsHalo[6+data.get(i).getColumn(j)]++; break;
			    	case 13: leafspotsMarg[6+data.get(i).getColumn(j)]++;  break;
			    	case 14: leafspotsSize[6+data.get(i).getColumn(j)]++; break;
			    	case 15: leafShread[4+data.get(i).getColumn(j)]++;  break;
			    	case 16: leafMalf[4+data.get(i).getColumn(j)]++;  break;
			    	case 17: leafMild[6+data.get(i).getColumn(j)]++;  break;
			    	case 18: stem[4+data.get(i).getColumn(j)]++;  break;
			    	case 19: lodging[4+data.get(i).getColumn(j)]++;  break;
			    	case 20: stemCankers[8+data.get(i).getColumn(j)]++;  break;
			    	case 21: cankerLesion[8+data.get(i).getColumn(j)]++; break;
			    	case 22: fruitingBodies[4+data.get(i).getColumn(j)]++; break;
			    	case 23: externalDecay[6+data.get(i).getColumn(j)]++; break;
			    	case 24: mycelium[4+data.get(i).getColumn(j)]++;  break;
			    	case 25: intDiscolor[6+data.get(i).getColumn(j)]++; break;
			    	case 26: sclerotia[4+data.get(i).getColumn(j)]++;  break;
			    	case 27: fruitPods[8+data.get(i).getColumn(j)]++;  break;
			    	case 28: fruitSpots[10+data.get(i).getColumn(j)]++;  break;
			    	case 29: seed[4+data.get(i).getColumn(j)]++;  break;
			    	case 30: moldGrowth[4+data.get(i).getColumn(j)]++;  break;
			    	case 31: seedDiscolor[4+data.get(i).getColumn(j)]++;  break;
			    	case 32: seedSize[4+data.get(i).getColumn(j)]++; break;
			    	case 33: shriveling[4+data.get(i).getColumn(j)]++; break;
			    	case 34: roots[6+data.get(i).getColumn(j)]++; break;
			    	case 35: totals[2]++; break;
			    	}
				}
				else  {
					switch(j) {
			    	case 0: date[21+data.get(i).getColumn(j)]++; break;
			    	case 1: plantStand[6+data.get(i).getColumn(j)]++; break;
			    	case 2: precip[9+data.get(i).getColumn(j)]++;  break;
			    	case 3: temp[9+data.get(i).getColumn(j)]++; break;
			    	case 4:	hail[6+data.get(i).getColumn(j)]++;  break;
			    	case 5: cropHist[12+data.get(i).getColumn(j)]++;  break;
			    	case 6: areaDamage[12+data.get(i).getColumn(j)]++;  break;
			    	case 7: severity[9+data.get(i).getColumn(j)]++;  break;
			    	case 8: seedTmt[9+data.get(i).getColumn(j)]++;  break;
			    	case 9: germination[9+data.get(i).getColumn(j)]++;  break;
			    	case 10: plantGrowth[6+data.get(i).getColumn(j)]++; break;
			    	case 11: leaves[6+data.get(i).getColumn(j)]++; break;
			    	case 12: leafspotsHalo[9+data.get(i).getColumn(j)]++; break;
			    	case 13: leafspotsMarg[9+data.get(i).getColumn(j)]++;  break;
			    	case 14: leafspotsSize[9+data.get(i).getColumn(j)]++; break;
			    	case 15: leafShread[6+data.get(i).getColumn(j)]++;  break;
			    	case 16: leafMalf[6+data.get(i).getColumn(j)]++;  break;
			    	case 17: leafMild[9+data.get(i).getColumn(j)]++;  break;
			    	case 18: stem[6+data.get(i).getColumn(j)]++;  break;
			    	case 19: lodging[6+data.get(i).getColumn(j)]++;  break;
			    	case 20: stemCankers[12+data.get(i).getColumn(j)]++;  break;
			    	case 21: cankerLesion[12+data.get(i).getColumn(j)]++; break;
			    	case 22: fruitingBodies[6+data.get(i).getColumn(j)]++; break;
			    	case 23: externalDecay[9+data.get(i).getColumn(j)]++; break;
			    	case 24: mycelium[6+data.get(i).getColumn(j)]++;  break;
			    	case 25: intDiscolor[9+data.get(i).getColumn(j)]++; break;
			    	case 26: sclerotia[6+data.get(i).getColumn(j)]++;  break;
			    	case 27: fruitPods[12+data.get(i).getColumn(j)]++;  break;
			    	case 28: fruitSpots[15+data.get(i).getColumn(j)]++;  break;
			    	case 29: seed[6+data.get(i).getColumn(j)]++;  break;
			    	case 30: moldGrowth[6+data.get(i).getColumn(j)]++;  break;
			    	case 31: seedDiscolor[6+data.get(i).getColumn(j)]++;  break;
			    	case 32: seedSize[6+data.get(i).getColumn(j)]++; break;
			    	case 33: shriveling[6+data.get(i).getColumn(j)]++; break;
			    	case 34: roots[9+data.get(i).getColumn(j)]++; break;
			    	case 35: totals[3]++; break;
			    	}
				}
			}	
		}
		int totalValues=totals[0]+totals[1]+totals[2]+totals[3];
		float pD1= (float) totals[0]/totalValues;
		float pD2= (float) totals[1]/totalValues;
		float pD3= (float) totals[2]/totalValues;
		float pD4= (float) totals[3]/totalValues;
		float[] pDi= {pD1, pD2, pD3, pD4};
		float[] probability= new float [140]; //0-34 for 1, 35-69 for 2, 70-104 for 3, 105-139 for 4 
		float[] finalProbability= new float[4]; //0 for 1, 1 for 2, 2 for 3, 3 for 4 
		
		for (int i=0; i<4; i++) {
			probability[35*i+0]=(float) (date[7*i+values[0]])/totals[i];
			probability[35*i+1]=(float) (plantStand[2*i+values[1]])/totals[i];
			probability[35*i+2]=(float) (precip[3*i+values[2]])/totals[i];
			probability[35*i+3]=(float) (temp[3*i+values[3]])/totals[i];
			probability[35*i+4]=(float) (hail[2*i+values[4]])/totals[i];
			probability[35*i+5]=(float) (cropHist[4*i+values[5]])/totals[i];
			probability[35*i+6]=(float) (areaDamage[4*i+values[6]])/totals[i];
			probability[35*i+7]=(float) (severity[3*i+values[7]])/totals[i];
			probability[35*i+8]=(float) (seedTmt[3*i+values[8]])/totals[i];
			probability[35*i+9]=(float) (germination[3*i+values[9]])/totals[i];
			probability[35*i+10]=(float) (plantGrowth[2*i+values[10]])/totals[i];
			probability[35*i+11]=(float) (leaves[2*i+values[11]])/totals[i];
			probability[35*i+12]=(float) (leafspotsHalo[3*i+values[12]])/totals[i];
			probability[35*i+13]=(float) (leafspotsMarg[3*i+values[13]])/totals[i];
			probability[35*i+14]=(float) (leafspotsSize[3*i+values[14]])/totals[i];
			probability[35*i+15]=(float) (leafShread[2*i+values[15]])/totals[i];
			probability[35*i+16]=(float) (leafMalf[2*i+values[16]])/totals[i];
			probability[35*i+17]=(float) (leafMild[3*i+values[17]])/totals[i];
			probability[35*i+18]=(float) (stem[2*i+values[18]])/totals[i];
			probability[35*i+19]=(float) (lodging[2*i+values[19]])/totals[i];
			probability[35*i+20]=(float) (stemCankers[4*i+values[20]])/totals[i];
			probability[35*i+21]=(float) (cankerLesion[4*i+values[21]])/totals[i];
			probability[35*i+22]=(float) (fruitingBodies[2*i+values[22]])/totals[i];
			probability[35*i+23]=(float) (externalDecay[3*i+values[23]])/totals[i];
			probability[35*i+24]=(float) (mycelium[2*i+values[24]])/totals[i];
			probability[35*i+25]=(float) (intDiscolor[3*i+values[25]])/totals[i];
			probability[35*i+26]=(float) (sclerotia[2*i+values[26]])/totals[i];
			probability[35*i+27]=(float) (fruitPods[4*i+values[27]])/totals[i];
			probability[35*i+28]=(float) (fruitSpots[5*i+values[28]])/totals[i];
			probability[35*i+29]=(float) (seed[2*i+values[29]])/totals[i];
			probability[35*i+30]=(float) (moldGrowth[2*i+values[30]])/totals[i];
			probability[35*i+31]=(float) (seedDiscolor[2*i+values[31]])/totals[i];
			probability[35*i+32]=(float) (seedSize[2*i+values[32]])/totals[i];
			probability[35*i+33]=(float) (shriveling[2*i+values[33]])/totals[i];
			probability[35*i+34]=(float) (roots[3*i+values[34]])/totals[i];
			
			finalProbability[i]=(float) probability[35*i+0]*probability[35*i+1]*probability[35*i+2]*probability[35*i+3]*probability[35*i+4]*probability[35*i+5]
					*probability[35*i+6]*probability[35*i+7]*probability[35*i+8]*probability[35*i+9]*probability[35*i+10]*probability[35*i+11]*probability[35*i+12]
					*probability[35*i+13]*probability[35*i+14]*probability[35*i+15]*probability[35*i+16]*probability[35*i+17]*probability[35*i+18]*probability[35*i+19]
					*probability[35*i+20]*probability[35*i+21]*probability[35*i+22]*probability[35*i+23]*probability[35*i+24]*probability[35*i+25]*probability[35*i+26]
					*probability[35*i+27]*probability[35*i+28]*probability[35*i+29]*probability[35*i+30]*probability[35*i+31]*probability[35*i+32]*probability[35*i+33]
					*probability[35*i+34]*pDi[i];
		}

		if (finalProbability[0]>=finalProbability[1] && finalProbability[0]>=finalProbability[2] && finalProbability[0]>=finalProbability[3]) {
			System.out.println("D1 has the biggest probability");
		}
		else if (finalProbability[1]>=finalProbability[0] && finalProbability[1]>=finalProbability[2] && finalProbability[1]>=finalProbability[3]) {
			System.out.println("D2 has the biggest probability");
		}
		else if (finalProbability[2]>=finalProbability[1] && finalProbability[2]>=finalProbability[0] && finalProbability[2]>=finalProbability[3]) {
			System.out.println("D3 has the biggest probability");
		}
		else if (finalProbability[3]>=finalProbability[1] && finalProbability[3]>=finalProbability[2] && finalProbability[3]>=finalProbability[0]) {
			System.out.println("D4 has the biggest probability");
		}
		
			
}
	
////////////////////////////////Glass///////////////////////////////////////////////////////////////////////////////////////
	public static void glass(ArrayList<Glass> data, int[] values) {
		int[] totals=new int[7]; //0 building_windows_float_processed, 1 for building_windows_non_float_processed, 2 for vehicle_windows_float_processed
	      						//3 for vehicle_windows_non_float_processed (none in this database), 4  for containers, 5 for tableware, 6 for headlamps
		
		int[] ri= new int[77]; //11 for each class
		int[] na= new int[77]; //11 for each class
		int[] mg= new int[77]; //11 for each class
		int[] al= new int[77]; //11 for each class
		int[] si= new int[77]; //11 for each class
		int[] k= new int[77]; //11 for each class
		int[] ca= new int[77]; //11 for each class
		int[] ba= new int[77]; //11 for each class
		int[] fe= new int[77]; //11 for each class

	
		// Counter
		for(int i = 0; i < data.size(); i++) {// Rows
			for(int j=1; j<11; j++) {// Columns
				if(data.get(i).getColumn(10)==1) {
					switch(j) {
			    	case 1: ri[data.get(i).getColumn(j)]++; break;
			    	case 2: na[data.get(i).getColumn(j)]++;  break;
			    	case 3: mg[data.get(i).getColumn(j)]++; break;
			    	case 4:	al[data.get(i).getColumn(j)]++;  break;
			    	case 5: si[data.get(i).getColumn(j)]++;  break;
			    	case 6: k[data.get(i).getColumn(j)]++;  break;
			    	case 7: ca[data.get(i).getColumn(j)]++;  break;
			    	case 8: ba[data.get(i).getColumn(j)]++;  break;
			    	case 9: fe[data.get(i).getColumn(j)]++;  break;
			    	case 10: totals[0]++; break;
			    	}
				}
				else if(data.get(i).getColumn(10)==2) {
					switch(j) {
			    	case 1: ri[11+data.get(i).getColumn(j)]++; break;
			    	case 2: na[11+data.get(i).getColumn(j)]++;  break;
			    	case 3: mg[11+data.get(i).getColumn(j)]++; break;
			    	case 4:	al[11+data.get(i).getColumn(j)]++;  break;
			    	case 5: si[11+data.get(i).getColumn(j)]++;  break;
			    	case 6: k[11+data.get(i).getColumn(j)]++;  break;
			    	case 7: ca[11+data.get(i).getColumn(j)]++;  break;
			    	case 8: ba[11+data.get(i).getColumn(j)]++;  break;
			    	case 9: fe[11+data.get(i).getColumn(j)]++;  break;
			    	case 10: totals[1]++; break;
			    	}
				}
				else if(data.get(i).getColumn(10)==3) {
					switch(j) {
			    	case 1: ri[22+data.get(i).getColumn(j)]++; break;
			    	case 2: na[22+data.get(i).getColumn(j)]++;  break;
			    	case 3: mg[22+data.get(i).getColumn(j)]++; break;
			    	case 4:	al[22+data.get(i).getColumn(j)]++;  break;
			    	case 5: si[22+data.get(i).getColumn(j)]++;  break;
			    	case 6: k[22+data.get(i).getColumn(j)]++;  break;
			    	case 7: ca[22+data.get(i).getColumn(j)]++;  break;
			    	case 8: ba[22+data.get(i).getColumn(j)]++;  break;
			    	case 9: fe[22+data.get(i).getColumn(j)]++;  break;
			    	case 10: totals[2]++; break;
			    	}
				}
				else if(data.get(i).getColumn(10)==4) {
					switch(j) {
			    	case 1: ri[33+data.get(i).getColumn(j)]++; break;
			    	case 2: na[33+data.get(i).getColumn(j)]++;  break;
			    	case 3: mg[33+data.get(i).getColumn(j)]++; break;
			    	case 4:	al[33+data.get(i).getColumn(j)]++;  break;
			    	case 5: si[33+data.get(i).getColumn(j)]++;  break;
			    	case 6: k[33+data.get(i).getColumn(j)]++;  break;
			    	case 7: ca[33+data.get(i).getColumn(j)]++;  break;
			    	case 8: ba[33+data.get(i).getColumn(j)]++;  break;
			    	case 9: fe[33+data.get(i).getColumn(j)]++;  break;
			    	case 10: totals[3]++; break;
			    	}
				}
				else if(data.get(i).getColumn(10)==5) {
					switch(j) {
			    	case 1: ri[44+data.get(i).getColumn(j)]++; break;
			    	case 2: na[44+data.get(i).getColumn(j)]++;  break;
			    	case 3: mg[44+data.get(i).getColumn(j)]++; break;
			    	case 4:	al[44+data.get(i).getColumn(j)]++;  break;
			    	case 5: si[44+data.get(i).getColumn(j)]++;  break;
			    	case 6: k[44+data.get(i).getColumn(j)]++;  break;
			    	case 7: ca[44+data.get(i).getColumn(j)]++;  break;
			    	case 8: ba[44+data.get(i).getColumn(j)]++;  break;
			    	case 9: fe[44+data.get(i).getColumn(j)]++;  break;
			    	case 10: totals[4]++; break;
			    	}
				}
				else if(data.get(i).getColumn(10)==6) {
					switch(j) {
			    	case 1: ri[55+data.get(i).getColumn(j)]++; break;
			    	case 2: na[55+data.get(i).getColumn(j)]++;  break;
			    	case 3: mg[55+data.get(i).getColumn(j)]++; break;
			    	case 4:	al[55+data.get(i).getColumn(j)]++;  break;
			    	case 5: si[55+data.get(i).getColumn(j)]++;  break;
			    	case 6: k[55+data.get(i).getColumn(j)]++;  break;
			    	case 7: ca[55+data.get(i).getColumn(j)]++;  break;
			    	case 8: ba[55+data.get(i).getColumn(j)]++;  break;
			    	case 9: fe[55+data.get(i).getColumn(j)]++;  break;
			    	case 10: totals[5]++; break;
			    	}
				}
				else if(data.get(i).getColumn(10)==7) {
					switch(j) {
			    	case 1: ri[66+data.get(i).getColumn(j)]++; break;
			    	case 2: na[66+data.get(i).getColumn(j)]++;  break;
			    	case 3: mg[66+data.get(i).getColumn(j)]++; break;
			    	case 4:	al[66+data.get(i).getColumn(j)]++;  break;
			    	case 5: si[66+data.get(i).getColumn(j)]++;  break;
			    	case 6: k[66+data.get(i).getColumn(j)]++;  break;
			    	case 7: ca[66+data.get(i).getColumn(j)]++;  break;
			    	case 8: ba[66+data.get(i).getColumn(j)]++;  break;
			    	case 9: fe[66+data.get(i).getColumn(j)]++;  break;
			    	case 10: totals[6]++; break;
			    	}
				}
			}
		}
		int totalValues=totals[0]+totals[1]+totals[2]+totals[4]+totals[5]+totals[6];
		float p1= (float) totals[0]/totalValues;
		float p2= (float) totals[1]/totalValues;
		float p3= (float) totals[2]/totalValues;
		float p4= (float) totals[3]/totalValues;
		float p5= (float) totals[4]/totalValues;
		float p6= (float) totals[5]/totalValues;
		float p7= (float) totals[6]/totalValues;
		float[] pi= {p1, p2, p3, p4, p5, p6, p7};
		float[] probability= new float [63];
		float[] finalProbability= new float[7];  //0 building_windows_float_processed, 1 for building_windows_non_float_processed, 2 for vehicle_windows_float_processed
												//3 for vehicle_windows_non_float_processed (none in this database), 4  for containers, 5 for tableware, 6 for headlamps
		
		for (int i=0; i<7; i++) {
			if(i!=3) {
			probability[9*i+0]=(float) (ri[11*i+values[0]])/totals[i];
			probability[9*i+1]=(float) (na[11*i+values[1]])/totals[i];
			probability[9*i+2]=(float) (mg[11*i+values[2]])/totals[i];
			probability[9*i+3]=(float) (al[11*i+values[3]])/totals[i];
			probability[9*i+4]=(float) (si[11*i+values[4]])/totals[i];
			probability[9*i+5]=(float) (k[11*i+values[5]])/totals[i];
			probability[9*i+6]=(float) (ca[11*i+values[6]])/totals[i];
			probability[9*i+7]=(float) (ba[11*i+values[7]])/totals[i];
			probability[9*i+8]=(float) (fe[11*i+values[8]])/totals[i];
			
			finalProbability[i]=(float) probability[9*i+0]*probability[9*i+1]*probability[9*i+2]*probability[9*i+3]*probability[9*i+4]*probability[9*i+5]
					*probability[9*i+6]*probability[9*i+7]*probability[9*i+8]*pi[i];
			}
		}
		if (finalProbability[0]>=finalProbability[1] && finalProbability[0]>=finalProbability[2] && finalProbability[0]>=finalProbability[3]
				 && finalProbability[0]>=finalProbability[4]  && finalProbability[0]>=finalProbability[5]  && finalProbability[0]>=finalProbability[6]) {
			System.out.println("Building Windows Float processed has the biggest probability");
		}
		else if (finalProbability[1]>=finalProbability[0] && finalProbability[1]>=finalProbability[2] && finalProbability[1]>=finalProbability[3]
				 && finalProbability[1]>=finalProbability[4]  && finalProbability[1]>=finalProbability[5]  && finalProbability[1]>=finalProbability[6]) {
			System.out.println("Building Windows Non Float processed has the biggest probability");
		}
		else if (finalProbability[2]>=finalProbability[0] && finalProbability[2]>=finalProbability[1] && finalProbability[2]>=finalProbability[3]
				 && finalProbability[2]>=finalProbability[4]  && finalProbability[2]>=finalProbability[5]  && finalProbability[2]>=finalProbability[6]) {
			System.out.println("Vehicle Windows Float Processed has the biggest probability");
		}
		else if (finalProbability[3]>=finalProbability[0] && finalProbability[3]>=finalProbability[1] && finalProbability[3]>=finalProbability[2]
				 && finalProbability[3]>=finalProbability[4]  && finalProbability[3]>=finalProbability[5]  && finalProbability[3]>=finalProbability[6]) {
			System.out.println("Vehicle Windows Non Float Processed has the biggest probability");
		}
		else if (finalProbability[4]>=finalProbability[0] && finalProbability[4]>=finalProbability[1] && finalProbability[4]>=finalProbability[2]
				 && finalProbability[4]>=finalProbability[3]  && finalProbability[4]>=finalProbability[5]  && finalProbability[4]>=finalProbability[6]) {
			System.out.println("Containers has the biggest probability");
		}
		else if (finalProbability[5]>=finalProbability[0] && finalProbability[5]>=finalProbability[1] && finalProbability[5]>=finalProbability[2]
				 && finalProbability[5]>=finalProbability[3]  && finalProbability[5]>=finalProbability[4]  && finalProbability[5]>=finalProbability[6]) {
			System.out.println("Tableware has the biggest probability");
		}
		else if (finalProbability[6]>=finalProbability[0] && finalProbability[6]>=finalProbability[1] && finalProbability[6]>=finalProbability[2]
				 && finalProbability[6]>=finalProbability[3]  && finalProbability[6]>=finalProbability[4]  && finalProbability[6]>=finalProbability[5]) {
			System.out.println("Headlamps has the biggest probability");
		}
}
	
////////////////////////////////////////////Iris/////////////////////////////////////////////////////////////////
	public static void iris(ArrayList<Iris> data, int[] values) {
		int[] totals=new int[3]; //0 Iris Setosa, 1 for Iris Versicolour, 2 for Virginica
	      						
		int[] sepalLength= new int[33]; //11 for each class
		int[] sepalWidth= new int[33]; //11 for each class
		int[] petalLength= new int[33]; //11 for each class
		int[] petalWidth= new int[33]; //11 for each class

		// Counter
		for(int i = 0; i < data.size(); i++) {// Rows
			for(int j=0; j<5; j++) {// Columns
				if(data.get(i).getColumn(4)==1) {
					switch(j) {
			    	case 0: sepalLength[data.get(i).getColumn(j)]++; break;
			    	case 1: sepalWidth[data.get(i).getColumn(j)]++;  break;
			    	case 2: petalLength[data.get(i).getColumn(j)]++; break;
			    	case 3:	petalWidth[data.get(i).getColumn(j)]++;  break;
			    	case 4: totals[0]++; break;
			    	}
				}
				else if(data.get(i).getColumn(4)==2) {
					switch(j) {
			    	case 0: sepalLength[11+data.get(i).getColumn(j)]++; break;
			    	case 1: sepalWidth[11+data.get(i).getColumn(j)]++;  break;
			    	case 2: petalLength[11+data.get(i).getColumn(j)]++; break;
			    	case 3:	petalWidth[11+data.get(i).getColumn(j)]++;  break;
			    	case 4: totals[1]++; break;
			    	}
				}
				else if(data.get(i).getColumn(4)==3) {
					switch(j) {
			    	case 0: sepalLength[22+data.get(i).getColumn(j)]++; break;
			    	case 1: sepalWidth[22+data.get(i).getColumn(j)]++;  break;
			    	case 2: petalLength[22+data.get(i).getColumn(j)]++; break;
			    	case 3:	petalWidth[22+data.get(i).getColumn(j)]++;  break;
			    	case 4: totals[2]++; break;
			    	}
				}
			}
		}
		int totalValues=totals[0]+totals[1]+totals[2];
		float p1= (float) totals[0]/totalValues;
		float p2= (float) totals[1]/totalValues;
		float p3= (float) totals[2]/totalValues;
		float[] pi= {p1, p2, p3};
		float[] probability= new float [12];
		float[] finalProbability= new float[3];  //0 Iris Setosa, 1 for Iris Versicolour, 2 for Virginica
		
		for (int i=0; i<3; i++) {
			if(i!=3) {
			probability[4*i+0]=(float) (sepalLength[11*i+values[0]])/totals[i];
			probability[4*i+1]=(float) (sepalWidth[11*i+values[1]])/totals[i];
			probability[4*i+2]=(float) (petalLength[11*i+values[2]])/totals[i];
			probability[4*i+3]=(float) (petalWidth[11*i+values[3]])/totals[i];
			
			finalProbability[i]=(float) probability[4*i+0]*probability[4*i+1]*probability[4*i+2]*probability[4*i+3]*pi[i];
			}
		}
		if (finalProbability[0]>=finalProbability[1] && finalProbability[0]>=finalProbability[2]) {
			System.out.println("Iris Setosa has the biggest probability");
		}
		else if (finalProbability[1]>=finalProbability[0] && finalProbability[1]>=finalProbability[2]) {
			System.out.println("Iris Versicolour has the biggest probability");
		}
		else if (finalProbability[2]>=finalProbability[0] && finalProbability[2]>=finalProbability[1]) {
			System.out.println("Iris Virginica has the biggest probability");
		}
}
	///////////////////////////////////10%/////////////////////////////////////////////////////////////////
	//shuffles data in one column of HouseVotes
		public static ArrayList<HouseVotes> houseVotesShuffle(ArrayList<HouseVotes> data, int column) {
			int yesVotes = 0;
			int noVotes = 0;
			for(int i = 0; i < data.size(); i++) {
				if(data.get(i).dataArray[column].equals("y")) {
					yesVotes++;
				}
				else {
					noVotes++;
				}
			}
			//used for random index
			Random randnum = new Random();
			ArrayList<HouseVotes> listCopy = (ArrayList<HouseVotes>) data.clone();
			ArrayList<HouseVotes> newList = new ArrayList<HouseVotes>();
			for(int j = 0; j < yesVotes; j++) {
				int index = randnum.nextInt(listCopy.size());
				HouseVotes newMember = listCopy.get(index);
				listCopy.remove(index);
				newMember.changeValueAtIndex(column, "y");
				newList.add(newMember);
			}
			for(int k = 0; k < noVotes; k++) {
				int index = randnum.nextInt(listCopy.size());
				HouseVotes newMember = listCopy.get(index);
				listCopy.remove(index);
				newMember.changeValueAtIndex(column, "n");
				newList.add(newMember);
			}
			return newList;
		}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
