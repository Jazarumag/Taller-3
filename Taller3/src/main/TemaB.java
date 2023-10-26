package main;

public class TemaB{}

public class ShoppingCart{
  private List<Shoppable> products;
  public void addProduct(Shoppable comprable){
    products.add(comprable);
  }
  public void removeProduct(Shoppable comprable){
    products.remove(comprable);
  }
  public double calculateTotalPrice(){
    double total=0;
    //Logica para calcular el precio total
    return total;
  }
}

public class EnviaRecibos{
  public void sendReceipt(ShoppingCart carrito){
    System.out.println("Sending receipt by email...");
    //Logica para enviar el recibo
  }
}

public interface Shoppable{
  double calculateIVA();
}

public class Product implements Shoppable {
  private String name;
  private double price;
  private double weight;
  public Product(String name,
                 double price,
                 double weight){
    this.name=name;
    this.price=price;
    this.weight=weight;
  }
  
  public String getName() {
    return name;
  }
  public double getPrice() {
    return price;
  }
  public double getWeight() {
    return weight;
  }
  
  public double calculateIVA() {
    return getPrice() * 0.12;
  }
}

public class DigitalProduct implements Shoppable{
  private String name;
  private double price;
  public DigitalProduct(String name, double price) {
    this.name=name;
    this.price=price;
  }
  
  public double calculateIVA() {
    return getPrice() * 0.15;
  }
}
