
import java.util.Objects;


public class Vehicle {
    private String Marka;
    private int Silindir;
    private Person Owner;
    
    public Vehicle(){
       
    }

    public Vehicle(String Marka,int Silindir,Person Owner){
        this.Marka=Marka;
        this.Silindir=Silindir;
        this.Owner=Owner;
    }
    public Vehicle(Vehicle veh){
        this.Marka=veh.Marka;
        this.Silindir=veh.Silindir;
        this.Owner=veh.Owner;
    }

    /**
     * @return the Marka
     */
    public String getMarka() {
        return Marka;
    }

    /**
     * @param Marka the Marka to set
     */
    public void setMarka(String Marka) {
        this.Marka = Marka;
    }

    /**
     * @return the Silindir
     */
    public int getSilindir() {
        return Silindir;
    }

    /**
     * @param Silindir the Silindir to set
     */
    public void setSilindir(int Silindir) {
        this.Silindir = Silindir;
    }

    /**
     * @return the Owner
     */
    public Person getOwner() {
        return Owner;
    }

    /**
     * @param Owner the Owner to set
     */
    public void setOwner(Person Owner) {
        this.Owner = Owner;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (this.Silindir != other.Silindir) {
            return false;
        }
        if (!Objects.equals(this.Marka, other.Marka)) {
            return false;
        }
        return Objects.equals(this.Owner, other.Owner);
    }

    @Override
    public String toString() {
        return "Vehicle" + "Marka:" + Marka + ", Silindir:" + Silindir + ", Owner:" + Owner;
    }
    
}
