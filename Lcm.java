public class Lcm {
    public static void main(String[] args) {
        int n1 = 22;
        int n2 = 12;

        int max = (n1 > n2) ? n1:n2;
        while (true) {
            if(max%n1 == 0 && max%n2 == 0){
                System.out.println("LCM of " + n1 +" and " + +n2 +" is " + max);
                break;
            }
            max++;
        }
    }
}
