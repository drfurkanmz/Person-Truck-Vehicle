
public class Deneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person Kisi1  = new Person ("furkan durmaz");
        Truck Truck1= new Truck(10000,"volvo",8,Kisi1);
        Truck Truck2=new Truck(Truck1);
        Truck Truck3=new Truck(1500,"mercedes",12,Kisi1);
        
        System.out.println("********* Truck Bilgileri***********");
        System.out.println("Truck2 nin Truck1 kopyasi:"+ '\n'+ Truck2+ '\n');
        System.out.println("Truck1 :"+'\n'+ Truck1+ '\n');
        System.out.println("Truck2 :"+'\n'+ Truck2+ '\n');
        System.out.println("Iki Truckin birbirine es olma durumu "+ Truck1.equals(Truck2));
        System.out.println("3 Truckin birbirine es olma durumu "+ Truck1.equals(Truck3));
        System.out.println("Truck3 :"+'\n'+ Truck3+ '\n');
    }
    
}
