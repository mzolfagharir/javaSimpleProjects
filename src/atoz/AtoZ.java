package atoz;
public class AtoZ {
    public static void main(String[] args) {
        int z = 90;
        for(int a=65; a <= z; a+=2){
            char result = (char) a;
            System.out.println(result);
        }
    }
}