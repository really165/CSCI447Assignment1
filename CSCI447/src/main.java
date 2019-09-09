package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

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
			glassData.get(k).printGlass();
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
		String[] testVotes = {"y","y","y","n","n","n","y","y","y","n","y","n","n","n","y","y"};
		String party = partyGivenVotes(houseVotesData, testVotes);
		
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
		
		// TODO: pre-processing for missing attributes
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
	}
	
	public static boolean hasMissingValue(String[] inputValues){
		for(int i = 0; i < inputValues.length; i++){
			if(inputValues[i].equals("?")) {
				return true;
			}
		}
		return false;
	}
	
	//Discretize the continuous variables
	public static void continuous(int column, ArrayList<Glass> data){
		float m=10; //number of intervals
		float min=100;
		float max=0;
		float[] tempArray=new float[data.size()];
		int[] position=new int[data.size()];
		
		//Get min and max values of the data
		for(int i=0; i<data.size(); i++) {
			tempArray[i]=data.get(i).dataArray[column];
			position[i]=i;
			if(data.get(i).dataArray[column]<min) {
				min=data.get(i).dataArray[column];
			}
			if(data.get(i).dataArray[column]>max) {
				max=data.get(i).dataArray[column];
			}
		}
		
		int intervals=(int) (((max-min)/m)+0.5); //For equal width intervals
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
}
