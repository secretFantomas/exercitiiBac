package Var003;

public class S3_2b {

    public static void cifreDiferite(int number){
        int cifra = number;
        int counter =0;

        while (cifra!=0) {
            cifra = cifra / 10;
            counter++;
        }


        if (counter>4)
            return;
        else
            System.out.println("e ok");
    }

    public static void main(String[] args) {
        cifreDiferite(456);
        cifreDiferite(1);
        cifreDiferite(56899);
    }
}
