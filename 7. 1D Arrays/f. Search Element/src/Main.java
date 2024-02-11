import java.util.Scanner;
public class Main {
    public static int SearchInteger(int[] arr, int B) { //this function will check whether integer B is present in array "arr"
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]==B) return 1;     //if integer "B" is found return 1
        }
        return 0;                       //if integer "B" is not found return 0
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Test Cases: ");
        int T = scanner.nextInt();      //Take input for number of test cases
        for (int i = 0; i < T ; i++){
            System.out.print("Enter Length of the Array: ");
            int N = scanner.nextInt();  //take input from the user for length of the array
            int[] arr = new int[N];

            System.out.print("Enter Elements of the Array: ");
            for(int j=0 ; j<N ; j++){   //start a loop to input N elements of the array
                arr[j]=scanner.nextInt();
            }

            System.out.print("Enter Search Integer: ");
            int B = scanner.nextInt();                //Input the search integer

            System.out.println(SearchInteger(arr,B)); //pass array "arr" and integer "B" to the function SearchInteger

        }
    }
}