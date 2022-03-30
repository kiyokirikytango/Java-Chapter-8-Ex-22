/*
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
|
|   Project: Even number of 1s
|   Name: Riky Hernandez
|   Date: 9/23/21
|   Description: Write a program that generates a 6x6 matrix filled with 0s and 1s, checks if every row and col have an even amount of ones   
|

⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⣠⣤⣶⣶
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⢰⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣀⣀⣾⣿⣿⣿⣿
⣿⣿⣿⣿⣿⡏⠉⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿
⣿⣿⣿⣿⣿⣿⠀⠀⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠁⠀⣿
⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠙⠿⠿⠿⠻⠿⠿⠟⠿⠛⠉⠀⠀⠀⠀⠀⣸⣿
⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣴⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⢰⣹⡆⠀⠀⠀⠀⠀⠀⣭⣷⠀⠀⠀⠸⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠈⠉⠀⠀⠤⠄⠀⠀⠀⠉⠁⠀⠀⠀⠀⢿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⢾⣿⣷⠀⠀⠀⠀⡠⠤⢄⠀⠀⠀⠠⣿⣿⣷⠀⢸⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⡀⠉⠀⠀⠀⠀⠀⢄⠀⢀⠀⠀⠀⠀⠉⠉⠁⠀⠀⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/
package chapter8_22;


public class Chapter8_22 {

    public static boolean hasEvenOnes(int[][] matrix){          //method to tell if we have even ones
        
        for(int i = 0; i < matrix.length; i++){
            int oneCount = 0;
            for(int j = 0; j<matrix[i].length; j++){       //checks a signle row
                if(matrix[i][j] ==1){
                    oneCount++;
                }
            }
            if (oneCount % 2 != 0){                 //checks if its even amount
                return false;
            }
        }
        for(int j = 0; j < matrix[0].length; j++){
            int oneCount = 0;
        for(int i = 0;  i <matrix.length; i++){      //checks a signle column
            if(matrix[i][j] == 1){
                oneCount++;
            }
        }
        if(oneCount % 2 != 0){                  //checks if its a even amount
            return false;
        }
       }
        return true;
    }
    public static void main(String[] args) {
        
       int[][] matrix = new int[6][6];          //declareing 2dray always making it 6x6
       
       for(int i = 0; i< matrix.length; i++){
           for(int j = 0; j< matrix[i].length; j++){
               matrix[i][j] = (int)(Math.random() * 2);  //feelin in the array with random 0s and 1s
               System.out.print(matrix[i][j]);               
               
           }
           System.out.println();
           
       }
        if (hasEvenOnes(matrix)){
            System.out.println("All row and colums have even ones");    // if the method is true then this prints
        }
        else{
            System.out.println("All row and colums did not have even ones");  // if false it print this
        }
    }
    
}
