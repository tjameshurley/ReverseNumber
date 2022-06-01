import java.util.*;


public class ReverseNumber {
    
    public void reverse1(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            
            int num = sc.nextInt();
    
            int rev = 0;
    
            while(num != 0){
                rev= rev * 10 + num%10; //0 + 1234%10=4   then 4*10 +123%10 = 40+3 then 43*10 + 12%10=2 finally 432*10+1%10=1
                num= num/10; // 1234/10=123 then  123/10=12 then 12/10=1 finally 1/10=0
            }
            System.out.println("Reverse number is: "+ rev);
    }

    public static void main(String[] args) throws Exception {
        ReverseNumber revTest1 = new ReverseNumber();
        revTest1.reverse1();

        
        
    }
}
