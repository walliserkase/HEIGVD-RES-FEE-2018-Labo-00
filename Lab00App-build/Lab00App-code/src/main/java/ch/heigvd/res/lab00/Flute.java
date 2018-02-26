package ch.heigvd.res.lab00;

/**
 * Created by Alex on 19.02.2018.
 */
public class Flute implements IInstrument {

    private int soundVolume = 20;
    private String color = "café";

    @Override
    public String play() {
        return "fifou";
    }

    @Override
    public int getSoundVolume() {
        return soundVolume;
    }

    @Override
    public String getColor() {
        return null;
    }
}
