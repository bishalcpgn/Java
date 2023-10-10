/* Multidimensional arrays -> Array of arrays 


Syntax of advanced for loop : 

for ( dataType variableNAme : arrayName){

Your code here. 

}

With the use of advanced for loop we don't need to know the size of an array in advance.

*/


class MultidimensionalArray{    
    public static void main(String[] args){
    int[][] matrix = new int[2][3];
    for(int i=0; i<2; i++){
        for(int j=0; j<3; j++){
            matrix[i][j] = i+j;
            System.out.print(matrix[i][j] + " "); // prints inner values in a same row
        }
        System.out.println(); // goes to next line for each outerloop
    }

    System.out.println("\n Printing same values using advanced for loop : ");

    for ( int[] data : matrix){ // single array is returned by matrix 
        for (int innerData : data){
            System.out.print(innerData + " ");

        }     
        System.out.println(); 
    }
    }
}

    



    
