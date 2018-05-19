package Variante2007.Var006;

public class Nod {

    private int num;
    private Nod next;

    public Nod(int num, Nod next) {
        this.num = num;
        this.next = next;
    }

    public int getNum() {
        return num;
    }

    public Nod getNext() {
        return next;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNext(Nod next) {
        this.next = next;
    }
}
