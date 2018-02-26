package ch.heigvd.res.lab00;

/**
 * Created by Alex on 19.02.2018.
 */
public class Clavier implements IInstrument {

    private String color = "ivory";
    private int soundVolume = 50;

    @Override
    public String play() {
        return "dayyyn";
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
