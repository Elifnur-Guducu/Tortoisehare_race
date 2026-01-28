import java.util.Random;
public class Animal {
    private int position=1; //bu başlangıçta bulundukları satır
    Random rand = new Random();

    public void setPosition(int newposition) {
        if (newposition<1)
            this.position=1;
        else
            this.position=newposition;
    }

    public int getPosition() {
        return position;
    }
    public void move(){

    }
}
