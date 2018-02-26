package ch.heigvd.res.lab00;

/**
 * Created by Alex on 19.02.2018.
 */
public class Trumpet implements IInstrument {

    private int soundVolume = 50;
    private String color = "golden";

    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return soundVolume;
    }

    @Override
    public String getColor() {
        return color;
    }
}
