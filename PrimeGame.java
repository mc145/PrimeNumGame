import java.util.*; 
import java.io.*; 

public class PrimeGame {

    static boolean gameOver(int[] arr){

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(i != j){
                    if((arr[i] != 0 && arr[j] != 0 && arr[j] > arr[i]) && (arr[j] % arr[i] == 0)){
                        return false; 
                    }
                }
            }
        
        }
        return true; 
    }

    static int[] removeVal(int[] arr, int valtoRemove){
        boolean stat = false; 
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0 && arr[i] < valtoRemove && valtoRemove % arr[i] == 0){
                arr[i] = 0; // removing it 
                stat = true; 
            }
        }

        if(stat){
            for(int i = 0; i<arr.length; i++){
                if(arr[i] == valtoRemove){
                    arr[i] = 0; 
                }
            }
        }
        return arr; 
    }
    
    static Scanner key = new Scanner(System.in); 
    public static void main(String[] args){
        System.out.println("How many numbers do you want to play the game with?");
        int totNum = key.nextInt(); 
        int[] curNum = new int[totNum]; 

        for(int i = 0; i<totNum; i++){
            curNum[i] = i+1; 
        }

    

        while(!gameOver(curNum)){
            System.out.println("Your current numbers are: ");
            for(int a: curNum){
                if(a != 0){
                System.out.print(a + " ");
                }
            }
            System.out.println();
            System.out.println("Which number would you like to remove the factors of?");
            int nextRemove = key.nextInt(); 
            curNum = removeVal(curNum, nextRemove); 

        }

        System.out.println("Your current numbers are: ");
        for(int a: curNum){
            if(a != 0){
                System.out.print(a + " ");
            }
        }

        int score = 0; 
        for(int i = 0; i<curNum.length; i++){
            score+=curNum[i]; 
        }

        System.out.println("GAME OVER");
        System.out.println("SCORE: "  + score);

        
    }


}
