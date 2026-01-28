public class Tortoise extends Animal{
    @Override
    public void move() {
        super.move();
        int i = rand.nextInt(10) + 1;
        switch(i) {
            case 1: case 2: case 3: case 4: case 5:
                setPosition(getPosition()+3);// fast plod
                break;
            case 6: case 7:
                setPosition(getPosition()-6);// slip
                break;
            case 8: case 9: case 10:
                setPosition(getPosition()+1);// slow plod
                break;
        }

    }
}
