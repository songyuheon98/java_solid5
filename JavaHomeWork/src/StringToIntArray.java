import java.util.Scanner;

public class StringToIntArray {
    private int user[];

    public int[] getUser() {
        return user;
    }

    public void setUser(int[] user) {
        this.user = user;
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    private int userChoice;
    public int[] stringToIntArray(int len) {
        // 입력 받은 문자열 자리수에 따라 배열로 변환
        Scanner sc = new Scanner(System.in);
        userChoice = sc.nextInt();

        user=new int[len];

        for (int i = 0; i < len; i++) {
            user[i]=userChoice/ (int)Math.pow(10,len-1-i);
            userChoice %=(int)Math.pow(10,len-1-i);
        }
        return user;
    }
}