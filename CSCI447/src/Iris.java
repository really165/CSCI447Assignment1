public class Iris {
	private float sepalLength;
	private float sepalWidth;
	private float petalLength;
	private float petalWidth;
	private String irisClass;
	
	Iris(float sl, float sw, float pl, float pw, String ic){
		this.sepalLength = sl;
		this.sepalWidth = sw;
		this.petalLength = pl;
		this.petalWidth = pw;
		this.irisClass = ic;
	}
	
	public void printIris(){
    	System.out.println("Sepal length: " + this.sepalLength + ", Sepal width: " + this.sepalWidth + ", Petal length: " + this.petalLength + ", Petal Width: " + this.petalWidth + ", Iris class: " + this.irisClass); 
    }
}
