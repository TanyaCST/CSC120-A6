/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building {
  private Hashtable<String, Boolean> collection;


    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }
  
    /**
     * To put a book into the library collection
     * @param title
     */
    public void addTitle(String title){
      this.collection.put(title, true);
    }

    /**
     * To remove a book from the library collection
     * @param title a string variable representing the title of book
     * @return
     */
    public String removeTitle(String title){
      if (collection.keySet().contains(title)){
        this.collection.remove(title);
        return title;
      }
      else{
        //return title + "is not found in the library";
        throw new NullPointerException();
      }
    }

    /**
     * To check out a book when it is borrowed by someone
     * @param title a string variable representing the title of book
     */
    
    public void checkOut(String title){
      if (this.collection.keySet().contains(title)){
        this.collection.replace(title, false);
      }
      else{
        throw new NullPointerException();
      }
    }
    
    /**
     * To check in a book when someone returns it back
     * @param title a string variable representing the title of book
     */
    public void returnBook(String title){
      if (this.collection.keySet().contains(title)){
        this.collection.replace(title, true);
      }
      else{
        throw new NullPointerException();
      }
    }

    /**
     * Check whether the collection contains certain book
     * @param title a string variable representing the title of book
     * @return
     */
    public boolean containsTitle(String title){
      if (this.collection.keySet().contains(title)){
        return true;
      }
      else{
        return false;
      }
    } 

    /**
     * Check whether the book is available in the collection
     * @param title a string variable representing the title of book
     * @return
     */
    public boolean isAvailable(String title){
      if (containsTitle(title) == true) {
        if(this.collection.get(title) == true){
          return true;
        }
        else{
          return false;
        }
      }
      else{
        throw new NullPointerException();
      }
    }

     /**
     * Print outthe entire collection with check out status
     */
    public void printCollection(){
      String itemInCollection;
      for (int i = 0; i < this.collection.size(); i++){
        
        //itemInCollection += this.collection.get;
      }
    } // prints out the entire collection in an easy-to-read way (including checkout status)

    public static void main(String[] args) {
      Library mybibli = new Library("Fake Library", "123 Ghost Street", 100);
      mybibli.collection.put("A Story", true);
      mybibli.collection.put("Emily's Secret Diary", true);
      mybibli.checkOut("A Story");
      mybibli.returnBook("A Story");
      System.out.println(mybibli.removeTitle("A Story"));
      System.out.println(mybibli.collection);
    }
  
  }