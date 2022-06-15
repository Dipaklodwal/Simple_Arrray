public class Twodimentionarray {
public static void main(String[] args) {
   int intarray[][]={{12,15},{45,78}};
   int intarray1[][]={{55,40},{80,25}};
   int j=0;
   int clonearray[][]=intarray1.clone();
    for(int i=0;i<clonearray.length;i++){
        for(j=0;i<intarray1.length;j++){
        System.out.print(intarray[i][j]+"  ");
          }
    }
       System.out.println(intarray==clonearray);
       System.out.println(intarray!=intarray);
       System.out.println(clonearray==clonearray);
  }
    
}



       
