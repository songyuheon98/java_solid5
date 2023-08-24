import java.util.Random;

public class PlayGame{

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public RandomNum getRn() {
        return rn;
    }

    public StringToIntArray getSi() {
        return si;
    }

    public CheckResult getCr() {
        return cr;
    }

    public int[] getRandNumArr() {
        return randNumArr;
    }

    public void setRandNumArr(int[] randNumArr) {
        this.randNumArr = randNumArr;
    }

    private int count = 0;
    private final RandomNum rn;
    private final StringToIntArray si;
    private final CheckResult cr;

    public PlayGame(RandomNum rn, StringToIntArray si, CheckResult cr) {
        this.rn = rn;
        this.si = si;
        this.cr = cr;
    }
    // DIP 적용 생성자 ( 의존성 주입 ) -> 의존성 하락
    // 외부 객체 받아 사용

    private int[] randNumArr;
    public void playGame(int randomNumLen,int sn){
        randNumArr = rn.random(randomNumLen);

        while(true){
            System.out.print(count + "번째 시도 : ");

            int [] user=si.stringToIntArray(randomNumLen);

            if(cr.checkResult(user, randNumArr,sn)==1)
                break;

            count++;
        }
        System.out.println(count+"번만에 맞히셨습니다.");
        System.out.println("게임을 종료합니다.");
    }
}
