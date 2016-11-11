public class ArrayMethods{

   //PART 1 (these two methods are almost the same! -- I count them as 1 problem)
   public static int rowSum(int[][] AR, int x){
       int sum = 0;
       for (int i = 0; i < AR[x].length; i++){
	   sum += AR[x][i];
       }
       return sum;
   }
    //returns the sum of the elements in Row x of AR. 

   public static int columnSum(int[][] AR, int x){
       int sum = 0;
       for (int i = 0; i < AR.length; i++){
	   if (x < AR[i].length){
	       sum += AR[i][x];
	   }
       }
       return sum;
   }
    //returns the sum of the elements in Column x of AR (careful with rows of different lengths!).

   //PART 2
   public static int[] allRowSums(int[][] AR){
       int[] sum = new int[AR.length];
       for (int i = 0; i < sum.length; i++){
	   sum[i] = rowSum(AR,i);
       }
       return sum;
   }
    //calculates the row sum for every row and returns each of the values in an array. 
    //Index i of the return array contains the sum of elements in row i.

   //PART 3 (one should just use your part 2 answer... look at the difference in the readability)
   public static boolean isRowMagic(int[][] AR){
       int[] sum = allRowSums(AR);
       for (int i = 0; i < sum.length; i++){
	   if (sum[i] != sum[0]){
	       return false;
	   }
       }
       return true;
   }
     //checks if the array is row-magic (this means that every row has the same row sum).

   public static boolean isColumnMagic(int[][] AR){
       int[] sum = new int[AR.length];
       for (int i = 0; i < sum.length; i++){
	   sum[i] = columnSum(AR,i);
	   if (sum[i] != sum[0]){
	       return false;
	   }
       }
       return true;
   }
    //checks if the array is column-magic (this means that every column has the same column sum).

} 
