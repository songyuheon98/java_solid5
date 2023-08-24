public class RandomNum{
    public int[] getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(int[] randomNum) {
        this.randomNum = randomNum;
    }

    private int [] randomNum;
    int [] random(int a) {
        randomNum=new int[3];
        while(true) {
            for (int i = 0; i < a; i++)
                randomNum[i] = (int) (Math.random() * 10);

            if (randomNum[0] != randomNum[1] && randomNum[1] != randomNum[2] && randomNum[2] != randomNum[0])
                break;
        }
        return randomNum;
    }
}