class Mobile{
    String  brand;
    int price;
    /* Static Keyword :
    - Shared among all objects in the class.
    - Memory allocated only once when the class is loaded. */
    static String type = "Smartphone" ;

    public void show(){
        System.out.println(brand + ":" + price + " " + type);
    }
}
public class staticKeyword {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "Nokia";
        obj.price = 1500;
        // 'type' can be accessed directly using the class name, without creating any object.

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 150000;
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 75000;
        
        obj.show();
        obj1.show();
        obj2.show();
    }
    
}
