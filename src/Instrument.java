import java.util.ArrayList;
import java.util.Date;

/**
 * @version 1.0
 * @author Nia.Hawkins
 *
 */
public class Instrument {
    String name;
    Instruments instrumentType;
    Date purchase_date;
    ArrayList<MaintenanceTask> maintenanceLog =  new ArrayList<>();

    public Instrument(String name, Instruments instrumentType){
        this.name = name;
        this.instrumentType = instrumentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instruments getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(Instruments instrumentType) {
        this.instrumentType = instrumentType;
    }

    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public ArrayList<MaintenanceTask> getMaintenanceLog() {
        return maintenanceLog;
    }

    public void addMaintenance(MaintenanceTask task) {
        maintenanceLog.add(task);
    }
}
