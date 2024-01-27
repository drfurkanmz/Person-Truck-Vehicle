
public class Truck extends Vehicle {
    private double Kapasite;
    
    public Truck(){
        this.Kapasite=0;
    }
    public Truck (double Kapasite, String Marka, int Silindir, Person Owner){
        super(Marka,Silindir,Owner);
        this.Kapasite=Kapasite;
    }
    public Truck (double Kapasite){
        this.Kapasite=Kapasite;
        
    }
    public Truck(Truck tr){
        super(tr);
        this.Kapasite=tr.Kapasite;
    }

    /**
     * @return the Kapasite
     */
    public double getKapasite() {
        return Kapasite;
    }

    /**
     * @param Kapasite the Kapasite to set
     */
    public void setKapasite(double Kapasite) {
        this.Kapasite = Kapasite;
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
        final Truck other = (Truck) obj;
        return Double.doubleToLongBits(this.Kapasite) == Double.doubleToLongBits(other.Kapasite);
    }

    @Override
    public String toString() {
        return super.toString()+"Truck" + "Kapasite:" + Kapasite ;
    }
}
