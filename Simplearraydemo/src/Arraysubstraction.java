       public class Arraysubstraction{
              public static void main(String[] args) {
 
                  int arr[][]={{1,2,3},{12,14,36},{78,89,45}};
                  int arr1[][]={{6,5,2},{56,25,61},{15,56,45}};
                  int sub[][]=new int [3][3];
        
                    System.out.println("first matrix");
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
                    System.out.println("Substraction of two matrix:-");
                        for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr1.length;j++){
                        sub[i][j]=arr[i][j]-arr1[i][j];
                        System.out.print(sub[i][j]+ " ");
              }
                    System.out.println();
          } 
          
    
     }
}