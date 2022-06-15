public class Arrayclone {
public static void main(String[] args) {
    int intarray[]={12,15,45,78,98,87};
    int clonearray[]=intarray.clone();
    for(int i=0;i<clonearray.length;i++){
        System.out.println(intarray[i]+" ");
    }
       System.out.println(intarray==clonearray);
       System.out.println(intarray!=intarray);
       System.out.println(clonearray==clonearray);
  }
    
}
