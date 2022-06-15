public class Methodreturnarray {
public static void main(String[] args) {
    int arr[]=Method1();
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +"  ");
    }
}
     
 public static int[] Method1(){
     return new int[]{12,13,15,54,48,78};
   }
}

