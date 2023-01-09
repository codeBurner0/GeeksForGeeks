import java.util.*;
public class PowerOfTwo {
    public static boolean Two(int n) {
        return Math.log10(n)/Math.log10(2)%1==0;
    }
    public static void main(String[] args) {
        System.out.println(Two(166));
    }
}
