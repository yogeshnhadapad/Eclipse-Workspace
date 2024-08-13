package Collection;

public class Player {
 public String name;
 public Integer iD;
 public String country;
 public Player(String name, int iD, String country) {
	super();
	this.name = name;
	this.iD = iD;
	this.country = country;
}
 
 public Player() {
	 
 }

       public void disp() {
    	   System.out.println(name+iD+country);
    	   
       }
}
