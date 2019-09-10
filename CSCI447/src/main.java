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
					Integer.parseInt(values[29]), Integer.parseInt(values[30]), Integer.parseInt(values[31]), Integer.parseInt(values[32]), Integer.parseInt(values[33]), Integer.parseInt(values[34]));
			soyBeanData.add(newObservation);
			//newObservation.printSoyBean();
		}
		
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
		int[] values= {1, 1, 1, 1, 1, 1, 1, 1, 1};
		breastCancer(breastCancerData, values);
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
		System.out.println("probabilityDemocrat = " + probabilityDemocrat);
		float probabilityRepublican = numeratorRepublican/denominatorRepublican;
		System.out.println("probabilityRepublican = " + probabilityRepublican);
		
		if(probabilityDemocrat > probabilityRepublican) {
			System.out.println("more likely to be democrat");
			return "democrat";
		}
		else if(probabilityRepublican > probabilityDemocrat) {
			System.out.println("more likely to be republican");
			return "republican";
		}
		else {
			return "?";
		}
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