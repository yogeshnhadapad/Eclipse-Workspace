package Delivery;

public class Delivery {
  Product product;
 

Address address;
  
  Delivery(Product prodct, Address address){
	  this.product = product;
	  this.address = address;
  }
  
  @Override
  public String toString() {
  	return "Delivery [product=" + product + ", address=" + address + "]";
  }
  
}
