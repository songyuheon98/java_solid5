public class CheckResult{
    private int strike=0;
    private int ball=0;

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public int checkResult(int [] user, int [] randNumArr, int sn){
        for (int i = 0; i < user.length; i++)
            for (int j = 0; j < user.length; j++)
                if(randNumArr[i]==user[j])
                    if(i==j)
                        strike++;
                    else
                        ball++;
        if(ball!=0)
            System.out.println(ball+"B");
        if(strike!=0)
            System.out.println(strike+"S");
        if(strike==0 && ball==0) {
            System.out.print(ball + "B");
            System.out.println(strike + "S");
        }
        if(strike==sn)
            return 1;
        strike=0;
        ball=0;
        return 0;
    }
}
