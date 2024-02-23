
public class TwoDimArray {

	public static int[][] myArray;

	public static void main(String[] args) {
		int [][] myArray = fillArray("twodimarray8.txt");
		printArray(myArray);
		printArrayEven(myArray);
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	private static void display (int num){
		System.out.print(num+" ");
	}
	private static void printArrayEven(int[][] theArray){

	}

	public static int[][] fillArray(String myFile){
		myArray = new myArray("twodimarray8.txt");
		line = myArray.readLine();
		System.out.println("The input line is "+line);
	}
}	