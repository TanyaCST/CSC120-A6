/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  boolean elevator;

  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean elevator) {
    super(name, address, nFloors);

    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    this.elevator = elevator;

    if(hasDiningRoom == true){
      System.out.println("There is a dining room in the house");
    }
    else{
      System.out.println("there is no dining room in the house.");
    }
    System.out.println("You have built a house: 🏠");
  }

  /**
   * 
   * @return
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
  
  /**
   * 
   * @return
   */
  public int nResidents(){
    return residents.size();
  }

  /**
   * Add name into the residents arraylist
   * @param name
   */
  public void moveIn(String name){
    this.residents.add(name);
  }
  
  /**
   * return the name of the person who moved out
   * @param name The name of residents who are moving out
   * @return
   */
  public String moveOut(String name){
    if (this.residents.contains(name)) {
      this.residents.remove(name);
      return name;
    }
    else{
      return name + " isn't a resident in this house.";
    }

  }

  public boolean IsResident(String name){
    if (this.residents.contains(name)) {
      return true;
    }
    else{
      return false;
    }
  }

  public String toString(){
    return this.name + " is a " + this.nFloors + "-story resident house located at " + this.address;
  }

  public static void main(String[] args) {
    House newHouse = new House("Northrop House", "49 Elm Street", 5, false, true);
    System.out.println(newHouse.toString());
  }

}