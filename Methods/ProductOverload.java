package Methods;

class Product{

    public int prod(int a, int b, int c){
        return a * b * c; 
        
    }
    public double prod(double a, double b, double c){ 
        return a * b * c; 
    }
}

public class ProductOverload {
    public static void main(String[] args){
        
        Product p = new Product();
        System.out.println(p.prod(1, 2, 3));
        System.out.println(p.prod(1.0, 2.0, 9.0));
    }
}