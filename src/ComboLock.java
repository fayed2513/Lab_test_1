public class ComboLock {
    private int secret1;
    private int secret2;
    private int secret3;
    private int ans;
    private int check;
    public ComboLock(int secret1 , int secret2 , int secret3){
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        ans = 0;
        check = 0;
    }
    public void reset(){
        secret1 = 0;
        secret2 = 0;
        secret3 = 0;
    }
    public void turnRight(int ticks){
        if(secret1 == ticks && ans==0){
            check++;
            ans++;
        }
        if(ans==1 && secret3 == ticks && check==2){
            check++;
        }
    }
    public void turnLeft(int ticks){
        if(ticks == secret2)
            check++;
    }
    public boolean open(){
        if(check == 3)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        ComboLock ans = new ComboLock(1,2,39);
        ans.turnRight(1);
        ans.turnLeft(2);
        ans.turnRight(39);
        System.out.println(ans.open());
    }
}
