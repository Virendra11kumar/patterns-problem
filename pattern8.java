/*
 1
 0 1
 1 0 1
 0 1 0 1
 */
public class pattern8 {
    public static void main(String []args){

        int a;
        for(int i=1;i<=5;i++){
            if (i%2==0) {
                a=0;
            }else
            a=1;
            for(int j=1;j<=i;j++){
                if (a==0) {
                    System.out.print(a);
                    a=1;
                }else{
                    System.out.print(a);
                    a=0;
                }
            }
            System.out.println();
        }
    }
}
