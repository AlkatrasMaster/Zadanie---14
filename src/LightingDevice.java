public abstract class LightingDevice {
    public static final double MAX_BRIGHTNESS = 1D;
    public static final double MIN_BRIGHTNESS = 0D;

    protected final int power;
    protected double brightness;

    public LightingDevice(int power) {
        this.power = power;
    }

    public void setBrightness(double level) {
        if (level < MIN_BRIGHTNESS) {
            brightness = MIN_BRIGHTNESS;
        } else if (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        } else {
            brightness = level;
        }
    }

    public void getBrightness(double brightness) {
        this.brightness = brightness;
    }

    public void changeBrightness(double rate) {
        double change = brightness + brightness * rate;
        setBrightness(change);
    }

    public abstract double getEnergyConsumption();

}
