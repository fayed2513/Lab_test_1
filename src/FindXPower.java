import java.util.Scanner;
public class FindXPower {
    private double answer ;
    public FindXPower(){
        answer = 0;
    }
    public double calculatePower(double x , int n){
        if(n < 0){
            answer = Math.pow((1/x) , -n);
        }
        else{
            if(n % 2 == 0) {
                answer = Math.pow(Math.pow(x , n/2) , 2);
            }
            else{
                answer = Math.pow(x,n-1)*x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindXPower ans = new FindXPower();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and n");
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(ans.calculatePower(x , n));
    }
}
