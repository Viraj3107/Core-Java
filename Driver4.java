class P1 {
    public void sheela() {
        System.out.println("Sheela Super");
    }

}

class P2 extends P1 {
    public void sheela() {
        System.out.println("Sheela Sub");
    }
}

/**
 * Driver4
 */
public class Driver4 {

    public static void main(String[] args) {
        P1 ref = new P2();
        ref.sheela();
    }
}