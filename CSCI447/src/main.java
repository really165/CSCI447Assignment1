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
				newObservation.printBreastCancer();
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
}
