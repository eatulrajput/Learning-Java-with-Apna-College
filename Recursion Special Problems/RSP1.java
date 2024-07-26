// Tower of Hanoi
/**
 * RSP1
 */
public class RSP1 {

    public static void towerOfHanoi(int n, String src, String helper, String dest){

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer Disk" + n + "from" + src + "to" + dest);
    }

    public static void main(String[] args) {
        int n = 3;

    }
}