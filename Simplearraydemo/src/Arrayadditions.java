public class Arrayadditions{
    public static void main(String[] args) {
 
           int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
           int arr1[][]={{6,5,2},{8,5,2},{7,4,3}};
           int add[][]=new int [3][3];
           int sub[][]=new int [3][3];     
           int mul[][]=new int[3][3];
           System.out.print("first matrix");
          for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr1.length;j++){
                  System.out.print(arr[i][j]+ " ");
              }
                         System.out.println();
              
          }
               System.out.println("secound matrix");
                for(int i=0;i<arr.length;i++){
                 for(int j=0;j<arr1.length;j++){
                  System.out.print(arr1[i][j]+ " ");
              }
              System.out.println();
          }    
          System.out.println("addition of two matrix:-");
             for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr1.length;j++){
                  add[i][j]=arr[i][j]+arr1[i][j];
                  System.out.print(add[i][j]+ " ");
              }
              System.out.println();
          
          } 
             System.out.println("Substraction of two matrix:-");
                        for(int i=0;i<arr.length;i++){
                           for(int j=0;j<arr1.length;j++){
                            sub[i][j]=arr[i][j]-arr1[i][j];
                            System.out.print(sub[i][j]+ " ");
                    }
                           System.out.println();
             }
                  System.out.println("Multiplication of two matrix:-");
                  for(int i=0;i<arr.length;i++){
                  for(int j=0;j<arr1.length;j++){
                        mul[i][j]=arr[i][j]*arr1[i][j];
                        System.out.print(mul[i][j]+ " ");
                    }
                      System.out.println();
       }
}
}

