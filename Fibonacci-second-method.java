
public class FibonacciSecondMethod {
	
	public static int Fibonacci(int n) {
	
	int i = 2;
	int[] array = new int[(n + 1)];
	
	array[0] = 0;											//array[0]
	array[1] = 1;											//array[1]   (those two here must be manually written. :/
		
	while(i < n) {											//this here is a loop that returns multiples arrays[i]
	array[i] = array[i - 1] + array[i - 2];					//array[i]
	i++;
	}
	
	array[n] = array[n - 1] + array[n - 2];  				//array[n]
	
	
	
	return array[n];
	
}

	
	
	
	
		//The Rule is xn = xn−1 + xn−2
	public static void main(String[] args) {
		
		int insertYourValueHere = 20;
		
		System.out.print(0 + ", ");
		System.out.print(1 + ", " );
		
		
		
		for(int i = 2; i <= insertYourValueHere; i++) {
		System.out.print(Fibonacci(i) + ", ");
		}
		
		
		
	}

}
