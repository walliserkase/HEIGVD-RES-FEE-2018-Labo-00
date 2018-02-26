package ch.heigvd.res.lab00;

/**
 * Created by Alex on 19.02.2018.
 */
public class Harmonica implements IInstrument
{

    private int soundVolume = 50;
    private String color = "stuff";

    @Override
    public String play() {
        return "dap dap";
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
