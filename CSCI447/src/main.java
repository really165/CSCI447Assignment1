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
	}
}