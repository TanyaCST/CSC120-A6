/* This is a stub for the Cafe class */

public class Cafe extends Building {
    // attributes
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * Constructor: Create a cafe
     * @param name: name of cafe
     * @param address: cafe's address
     * @param nFloors: number of floors in this cafe.
     * @param nCoffeeOunces: the amout of coffee available in the cafe
     * @param nSugarPackets: the number of sugar packets available in the cafe
     * @param nCreams: amount of cream available in the cafe
     * @param nCups: amount of cups available in cafe
     */
    public Cafe(String name, 
                String address, 
                int nFloors, 
                int nCoffeeOunces, 
                int nSugarPackets, 
                int nCreams, 
                int nCups) {
        super(name, address, nFloors);

        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;

        System.out.println("You have built a cafe: ☕");
    }

    /**
     * To sell coffee 
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(((this.nCoffeeOunces - size) > 0) && 
            ((this.nSugarPackets - nSugarPackets) > 0) && 
            ((this.nCreams - nCreams) > 0) ){
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams; 
            this.nCups -= 1;
        }
        else{
            restock(size, nSugarPackets, nCreams, 100);
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams; 
            this.nCups -= 1;
        }
    }

    /**
     * Restock the ingredients when they are out
     * @param nCoffeeOunces: the amout of coffee available in the cafe
     * @param nSugarPackets: the number of sugar packets available in the cafe
     * @param nCreams: amount of cream available in the cafe
     * @param nCups: amount of cups available in cafe
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        if(this.nCoffeeOunces < 10){
            this.nCoffeeOunces = nCoffeeOunces;
        }

        if(this.nSugarPackets < 10){
            this.nSugarPackets = nSugarPackets;
        }

        if(this.nCreams < 10){
            this.nCreams = nCreams;
        }


        if (this.nCups < 10) {
            this.nCups = nCups;
        }

    }

    /**
     * show staffs how much materials are remaining
     * @return a string where contains material name and amount of materials remaining.
     */
    public String materialCheck(){
        return "Coffee: " + nCoffeeOunces + " Sugar Packets: " + nSugarPackets + "Cream:";
    }
    
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("A cafe", 
                               "Somewhere", 
                               1, 
                               50, 
                               50, 
                               50, 
                               50);
        System.out.println(myCafe.toString());
        myCafe.sellCoffee(20, 5, 5);
        myCafe.sellCoffee(20, 10, 10);
        myCafe.sellCoffee(20, 0, 0);

    }
    
}
