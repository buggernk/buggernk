import javax.swing.*; // supporting the JOptionPane

public class Lab6Program1 {

	public static void main(String[] args) {
		int[] inputArray = new int[20];
		int inputArraySize = inputFromFile(args[0], inputArray);
		if (inputArraySize == -1) {
			System.out.println("inputArray capacity is too small.");
			System.exit(0);
		}
		
		
		JOptionPane.showMessageDialog(null, "The sum is " + sum(inputArray, inputArraySize));
		JOptionPane.showMessageDialog(null, "The average is " + average(inputArray, inputArraySize));
	} //main

	public static int inputFromFile(String fileName, int myArray[]){
		TextFileInput in = new TextFileInput(fileName);
		
		String line = in.readLine();
		int count = 0;
		while (count < myArray.length && line != null) {
			myArray[count++] = Integer.parseInt(line);
			line = in.readLine();
		}
		in.close();
		
		if (line != null) return -1;
		return count;
	}
	
	public static int sum (int[] myArray, int myArraySize) {
		int sum = 0 ;
		for (int i = 0; i < myArraySize; ++i) {
			sum += myArray[i];
		}
		
		return sum;
		
	}

	public static int average (int[] myArray, int myArraySize) {
		return sum(myArray, myArraySize) / myArraySize;
	}
	
} // class Lab6Program1