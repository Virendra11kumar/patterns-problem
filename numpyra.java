/*Number pyramid:-
    1     
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
public class numpyra {
    public static void main(String[] args) {
        int a=1;
        for (int i = 5; i >0; i--) {
            for (int j = 1; j <=9; j++) {
                if (j<i||j>(i+a-1)) {
                    System.out.print(" "); 
                }else
                System.out.print(a+" ");
            }
            a++;
            System.out.println();
        }
        
    }
    
}
