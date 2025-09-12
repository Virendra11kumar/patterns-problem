/* Pattern:-
     *****
    *****
   *****
  *****
 *****
*/
public class pattern9 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 5; i >0; i--) {
            for(int j=0;j<=9;j++){
                if (j<i || j>9-a) {
                    System.out.print(" "); 
                }else
                System.out.print("*");
            }
            a++;
            System.out.println();
        }
    }
    
}
