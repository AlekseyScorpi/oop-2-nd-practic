import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("1-st task");
        task1();
        System.out.println("2-nd task");
        task2();
        System.out.println("3-rd task");
        task3();
        System.out.println("4-th task");
        task4();
        System.out.println("5-th task");
        task5();
        System.out.println("6-th task");
        task6();
        System.out.println("7-th task");
        task7();
        System.out.println("8-th task");
        task8();
        System.out.println("9-th task");
        task9();
        System.out.println("10-th task");
        task10();
    }
    static void task1() {
        System.out.println(oppositeHouse(1, 3));
        System.out.println(oppositeHouse(2, 3));
        System.out.println(oppositeHouse(3, 5));
        System.out.println(oppositeHouse(5, 46));
    }
    public static int oppositeHouse(int num, int len){
        return (len * 2) + 1 - num;
    }
    static void task2() {
        System.out.println(nameShuffle("Donald Trump"));
        System.out.println(nameShuffle("Rosie O'Donnell"));
        System.out.println(nameShuffle("Seymour Butts"));

    }
    public static String nameShuffle(String str){
        String firstName = "";
        String secondName = "";
        int i = 0;
        while (str.charAt(i) != ' '){
            firstName += str.charAt(i);
            i++;
        }
        for (int j = i + 1; j < str.length() - 1; j++){
            secondName += str.charAt(j);
        }
        return secondName + " " + firstName;
    }
    static void task3(){
        System.out.println(discount(1500, 50));
        System.out.println(discount(89, 20));
        System.out.println(discount(100, 75));

    }
    public static double discount(int price, int percent){
        return (100 * price - price * percent) / 100;
    }
    static void task4(){
        System.out.println(differenceMaxMin(new double[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new double[]{44, 32, 86, 19}));
    }
    public static double differenceMaxMin(double[] arr){
        double max = arr[0];
        double min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= max){
                max = arr[i];
            }
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        return max - min;
    }
    static void task5(){
        System.out.println(equal(-3,3,-3));
        System.out.println(equal(1,1,1));
        System.out.println(equal(3,4,1));
    }
    public static int equal(int a, int b, int c){
        if (a == b && a == c){
            return 3;
        }else if ((a == b) || (a == c) || (b == c)){
            return 2;
        }
        return 0;
    }
    static void task6(){
        System.out.println(reverse("Hello World"));
        System.out.println(reverse("The quick brown fox."));
        System.out.println(reverse("Edabit is really helpful!"));
    }
    public static String reverse(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }
    static void task7(){
        System.out.println(programmers(147, 33, 526));
        System.out.println(programmers(33, 72, 74));
        System.out.println(programmers(1, 5, 9));
    }
    public static int programmers(int a, int b, int c){
        return max(a, b, c) - min(a, b, c);
    }
    public static int max(int a, int b, int c){
        if (a >= b) {
            if (a >= c) {
                return a;
            }else{
                return c;
            }
        }else{
            if (b >= c){
                return b;
            }else{
                return c;
            }
        }
    }
    public static int min(int a, int b, int c){
        if (a <= b) {
            if (a <= c) {
                return a;
            }else{
                return c;
            }
        }else{
            if (b <= c){
                return b;
            }else{
                return c;
            }
        }
    }
    static void task8(){
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }
    public static boolean getXO(String str){
        int countX = 0;
        int countO = 0;
        str = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'x'){
                countX++;
            }
            if (str.charAt(i) == 'o'){
                countO++;
            }
        }
        return (countO == countX);
    }
    static void task9(){
        System.out.println(bomb("There is a bomb."));
        System.out.println(bomb("Hey, did you think there is a BOMB?"));
        System.out.println(bomb("This goes boom!!!"));
    }
    public static String bomb(String str){
        str = str.toLowerCase(Locale.ROOT);
        String keyWord = "bomb";
        String tempWord = "";
        if (str.length() < 4){
            return "Relax, there's no bomb.";
        }
        for (int i = 0; i < 4; i++){
            tempWord += str.charAt(i);
        }
        if (tempWord.equals(keyWord)){
            return "DUCK!";
        }
        for (int j = 4; j < str.length(); j++){
            tempWord = tempWord.substring(1,tempWord.length());
            tempWord += str.charAt(j);
            if (tempWord.equals(keyWord)){
                return "DUCK!";
            }
        }
        return "Relax, there's no bomb.";
    }
    static void task10(){
        System.out.println(sameAscii("a", "a"));
        System.out.println(sameAscii("AA", "B@"));
        System.out.println(sameAscii("EdAbIt", "EDABIT"));
    }
    public static boolean sameAscii(String str1, String str2){
        return (getAsciiSum(str1) == getAsciiSum(str2));
    }
    public static int getAsciiSum(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            sum += (int) str.charAt(i);
        }
        return sum;
    }
}
