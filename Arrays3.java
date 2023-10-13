// It is a multidimensional array where each row can have a different length.

class Arrays3{
    public static void main(String[] args){

        int[][] datas = new int[3][]; // two-dimensional array is created with four rows but length of rows isn't specified.

        datas[0] = new int[] { 1, 2, 3 }; // Elements in row are defined using single-dimensional integer array. 
        datas[1] = new int[] { 4, 5 };
        datas[2] = new int[] { 6};


        for(int[] arrayData : datas){
            for(int m : arrayData){
                System.out.print(m + " ");
            }
                System.out.println();
        }

    }
}
