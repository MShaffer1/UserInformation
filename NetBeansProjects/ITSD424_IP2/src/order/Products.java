
package order;

/**
 *
 * @author Peanu
 */
public class Products {
  
    static class sandType{
        
        String name;
        double price;
        
    }
    static class breadType {
        
        String name;
        double price;
      
    }
    static class size {
        
        String name;
        double price;
      
    }
    static class sideItem {
        
        String name;
        double price;
      
    }
    static class drink {
        
        String name;
        double price;
      
    }
    @Override
public String toString() {
    return name + " " + price;       
}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }   
    private String name;
    private double price;          
    Products() {              
    }             
    public static void main (String args[]){                  
    }             
        public Products(String name, double price){       
            this.name = name;
            this.price = price;           
        }           
}
