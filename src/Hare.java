public class Hare extends Animal{
    @Override
    public void move() {
        super.move();
        int i = rand.nextInt(10) + 1;
        switch(i) {
            case 1: case 2:
                setPosition(getPosition());// sleep
                break;
            case 3: case 4:
                setPosition(getPosition()+9);// big hop
                break;
            case 5:
                setPosition(getPosition()-12);// big slip
                break;
            case 6: case 7: case 8:
                setPosition(getPosition()+1);// small hop
                break;
            case 9: case 10:
                setPosition(getPosition()-2);// small slip
                break;
        }

    }
}
