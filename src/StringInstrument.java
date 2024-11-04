import java.util.ArrayList;

public class StringInstrument extends Instrument{
    StringTypes stringType;
    ArrayList<Bow> bows = new ArrayList<>();

    public StringInstrument(String name, Instruments instrumentType) {
        super(name, instrumentType);
    }

    public StringTypes getStringType() {
        return stringType;
    }

    public void setStringType(StringTypes stringType) {
        this.stringType = stringType;
    }

    public ArrayList<Bow> getBows() {
        return bows;
    }

    public void addBows(Bow bow) {
       bows.add(bow);
    }
}
