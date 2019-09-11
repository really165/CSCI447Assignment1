package project1;

public class Iris {
	private float sepalLength;
	private float sepalWidth;
	private float petalLength;
	private float petalWidth;
	private String irisClass;
	float[] dataArray= new float[4];
	
	Iris(float sl, float sw, float pl, float pw, String ic){
		this.sepalLength = dataArray[0] = sl;
		this.sepalWidth = dataArray[1] = sw;
		this.petalLength = dataArray[2] = pl;
		this.petalWidth = dataArray[3] = pw;
		this.irisClass = ic;
		
	}
	
	public void printIris(){
    	System.out.println("Sepal length: " + this.sepalLength + ", Sepal width: " + this.sepalWidth + ", Petal length: " + this.petalLength + ", Petal Width: " + this.petalWidth + ", Iris class: " + this.irisClass); 
    }
	
	public void setGroup(int index, int value) {
    	switch(index){
		case 0:
			this.sepalLength = value;
			this.dataArray[0] = value;
			break;
		case 1:
			this.sepalWidth = value;
			this.dataArray[1] = value;
			break;
		case 2:
			this.petalLength = value;
			this.dataArray[2] = value;
			break;
		case 3:
			this.petalWidth = value;
			this.dataArray[3] = value;
			break;
		default:
			break;
		}
    }
	public int getColumn(int column) {
    	switch(column) {
    	case 0: return (int) this.sepalLength;
    	case 1: return (int) this.sepalWidth;
    	case 2: return (int) this.petalLength; 
    	case 3: return (int) this.petalWidth;
    	case 4:	
    		if(this.irisClass.equals("Iris-setosa")) {
    			return 1;
    		}
    		else if(this.irisClass.equals("Iris-versicolor")) {
    			return 2;
    		}
    		else {
    			return 3;
    		}
    	}
    	return 1000;
    }
}
