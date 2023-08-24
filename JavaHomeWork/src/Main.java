public class Main {

//    Solid 5원칙
//
//    SRP(Single Responsibility Principle): 단일 책임 원칙
//    -> 클래스 별로 기능을 분할
//    OCP(Open Closed Priciple): 개방 폐쇄 원칙
//    -> 컴퓨터의 랜덤 수의 범위, strike의 개수 등 기능 확장 고려
//    LSP(Listov Substitution Priciple): 리스코프 치환 원칙
//    -> 상속 사용 X, 고려 X
//    ISP(Interface Segregation Principle): 인터페이스 분리 원칙
//    -> 인터페이스 사용 X, 고려 X
//    DIP(Dependency Inversion Principle): 의존 역전 원칙
//    -> playGame = 여러 클래스에 의존
//    => 생성자를 통해 외부 객체 주입 ( = 의존성 하락 가능 )
//

    public static void main(String[] args) {
        PlayGame pg = new PlayGame(new RandomNum(),new StringToIntArray(),new CheckResult());
        pg.playGame(3,3);

    }
}
