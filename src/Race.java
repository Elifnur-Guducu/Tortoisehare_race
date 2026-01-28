public class Race {
    public static void main(String[] args) {
        Tortoise tortoise = new Tortoise();
        Hare hare = new Hare();
        System.out.println("BANG !!!!! AND THEY'RE OFF !!!!!");
        //int[] raceTrack = new int[70];

        while (tortoise.getPosition() < 70 && hare.getPosition() < 70) {
            /*for (int i = 0; i < 70; i++) {
                raceTrack[i] = 0; // 0 = boş  her turda eski pozisyonları temizlemek için
            }*/
            tortoise.move();
            hare.move();
            for (int i = 1; i <= 70; i++) {
                if (i==tortoise.getPosition() && i==hare.getPosition())
                    System.out.print("OUCH!!!");
                else if (i == hare.getPosition()) System.out.print("H");
                else if (i == tortoise.getPosition()) System.out.print("T");
                else System.out.print("_"); // boş kareyi _ ile göster
            }
            System.out.println();
            if (tortoise.getPosition()>=70 || hare.getPosition()>=70)
                break;

        }
        if (tortoise.getPosition() >= 70 && hare.getPosition() >= 70)
            System.out.println("It's a tie!");
        else if (tortoise.getPosition() >= 70)
            System.out.println("TORTOISE WINS!!! YAY!!!");
        else if (hare.getPosition() >= 70)
            System.out.println("HARE WINS Yuch.");
    }
}
